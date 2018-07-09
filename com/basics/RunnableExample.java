package com.basics;

public class RunnableExample implements Runnable{
	String name;
	public RunnableExample(String name)	{
		this.name=name;
		Thread thread=new Thread(this);
		thread.start();
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(name+"="+i+Thread.currentThread());
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		 RunnableExample one=new  RunnableExample("one");
		 RunnableExample two=new  RunnableExample("two");
		System.out.println("main Done"+Thread.currentThread());
	}



}
