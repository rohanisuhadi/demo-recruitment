package com.recruitment.recruitment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecruitmentApplication implements Callback {
	
	private String rowAll = "id;Nama;Age;Balanced;No 2b Thread-No;No 3 Thread-No;Previous Balanced;Average Balanced;No 1 Thread-No;Free Transfer;No 2a Thread-No";
	
	private int rowIndex = 0;
	
	private MyThread myThread = null ;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(RecruitmentApplication.class, args);

		File file = new File("Before Eod.csv");

		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		 
		String lineRow = null;
		
		RecruitmentApplication ra = new RecruitmentApplication();
		
		int column = 1;
		
		while( ( lineRow = br.readLine() ) != null ){
			if( column < 1 ) {
				
				ra.myThread = new MyThread(lineRow, ra );
				ra.myThread.start();
			}
			else {
				column = 0;
			}
			
		}
		br.close(); 
		fr.close();
		
		 
	}

	@Override
	public void callback(String line) {
		
		this.rowAll = this.rowAll + line;
		rowIndex++;
		
		
		// selesai 200 baris
		if( rowIndex >= 200 ) {
			
			try {
				FileWriter myWriter = new FileWriter("After Eod.csv");
			    myWriter.write(this.rowAll);
			    myWriter.close();
			} catch (IOException e) {
			    e.printStackTrace();
			}
			
		}
	}

}
