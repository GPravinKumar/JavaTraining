package com.pack2;



public class Runclient {

	public static void main(String[] args) {
		MyRunnable r1=new MyRunnable();
		
		Runnable r2=()->{
			for(int i=1;i<=1000;++i){
				System.out.println(Thread.currentThread().getName()+" "+(i*5));
			}
		};
		
		Thread t1=new Thread(r1);
		t1.setName("afsal");
		
		Thread t2=new Thread(r1);
		t2.setName("pravin");
		
		t1.start();
		t2.start();
		
		System.out.println("main over");
		}

	}


