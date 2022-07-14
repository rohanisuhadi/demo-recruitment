package com.recruitment.recruitment;

public class Model {
	
	private int id;
	
	private String name;
	
	private int age;
	
	private int balance;
	
	private int prevBalance;
	
	private int avBalance;
	
	private int freeTransfer;
	
	private String noOneThread;
	
	private String noTwoAThread;
	
	private String noTwoBThread;
	
	private String noThreeThread;
	
	public Model() {
		
	}
	
	public Model(String line) {
		String[] columns = line.split(";");
		this.id = Integer.parseInt(columns[0]);
		this.name = columns[1];
		this.age = Integer.parseInt(columns[2]);
		this.balance = Integer.parseInt(columns[3]);
		this.prevBalance = Integer.parseInt(columns[4]);
		this.avBalance = Integer.parseInt(columns[5]);
		this.freeTransfer = Integer.parseInt(columns[6]);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getPrevBalance() {
		return prevBalance;
	}

	public void setPrevBalance(int prevBalance) {
		this.prevBalance = prevBalance;
	}

	public int getAvBalance() {
		return avBalance;
	}

	public void setAvBalance(int avBalance) {
		this.avBalance = avBalance;
	}

	public int getFreeTransfer() {
		return freeTransfer;
	}

	public void setFreeTransfer(int freeTransfer) {
		this.freeTransfer = freeTransfer;
	}
	
	public String getNoOneThread() {
		return noOneThread;
	}

	public void setNoOneThread(String noOneThread) {
		this.noOneThread = noOneThread;
	}

	public String getNoTwoAThread() {
		return noTwoAThread;
	}

	public void setNoTwoAThread(String noTwoAThread) {
		this.noTwoAThread = noTwoAThread;
	}

	public String getNoTwoBThread() {
		return noTwoBThread;
	}

	public void setNoTwoBThread(String noTwoBThread) {
		this.noTwoBThread = noTwoBThread;
	}

	public String getNoThreeThread() {
		return noThreeThread;
	}

	public void setNoThreeThread(String noThreeThread) {
		this.noThreeThread = noThreeThread;
	}

	public int getAvarageBalance() {
		return (this.balance + this.prevBalance) / 2;
	}

	@Override
	public String toString() {
		return "Model [id=" + id + ", name=" + name + ", age=" + age + ", balance=" + balance + ", prevBalance="
				+ prevBalance + ", avBalance=" + avBalance + ", freeTransfer=" + freeTransfer + ", noOneThread="
				+ noOneThread + ", noTwoAThread=" + noTwoAThread + ", noTwoBThread=" + noTwoBThread + ", noThreeThread="
				+ noThreeThread + "]";
	}
	
	public String toRow() {
		return "\n"+id+";"+name+";"+age+";"+balance+";"+noTwoBThread+";"+getNoThreeThread()+";"+prevBalance+";"+avBalance+";"+noOneThread+";"+freeTransfer+";"+noTwoAThread+";";
	}

	
}
