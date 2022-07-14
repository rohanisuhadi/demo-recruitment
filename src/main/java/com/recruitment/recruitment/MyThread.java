package com.recruitment.recruitment;

public class MyThread extends Thread {
	
	private String line;
	
	private Model cal;
	
	private Callback c;
	
	public MyThread(String line, Callback c) {
		this.line = line;
		this.cal = new Model(this.line);
		this.c = c;
	}
	
	@Override
	public void run() {
		
		synchronized (cal) {
			
			/* soal 1*/
			cal.getAvarageBalance();
			cal.setNoOneThread(getName());
			
			/* soal 2*/
			if( cal.getBalance() >= 100 && cal.getBalance() <= 150 ) {
				cal.setFreeTransfer(cal.getFreeTransfer()+5);
				cal.setNoTwoAThread(getName());
			}
			else if( cal.getBalance() > 150  ) {
				cal.setBalance(cal.getBalance()+25);
				cal.setNoTwoBThread(getName());
			}
			
			/* soal 3*/
			if( cal.getId() <= 100 ) {
				cal.setBalance(cal.getBalance()+10);
				cal.setNoThreeThread(getName());
			}
			
			c.callback(cal.toRow());
			
		}	
	}
	
	
	
	
}
