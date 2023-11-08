package com.user.login;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> newList = Arrays.asList(2,3,3,4,5,6,4);
		HashMap<Integer, Integer> newMap = new HashMap<>();
		newList.forEach(ele -> {
			if(newMap.containsKey(ele)) {
				newMap.replace(ele, newMap.get(ele)+1);
			} else {
				newMap.put(ele, 1);
			}

		});
		List evenNum = newList.stream().sorted().collect(Collectors.toList());
//		System.out.println(newMap);
		
		Hi T1 = new Hi();
		Hello T2 = new Hello();
		T1.setPriority(Thread.MAX_PRIORITY);
		T2.setPriority(Thread.MIN_PRIORITY);
		T1.start();
		T2.start();
		
//		RunnableHi T1 = new RunnableHi();
//		RunnableHello T2 = new RunnableHello();
//		Thread T3 = new Thread(new RunnableHi());
//		Thread T4 = new Thread(T2);
//		T3.start();
//		T4.start();
	}

}

class RunnableHi implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<100; i++) {
			 System.out.println("Runnable Hi : "+(i+1));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
	
}

class RunnableHello implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			 System.out.println("Runnable Hello : "+(i+1));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	}
	
}

class Hi extends Thread{
	
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<100; i++) {
		 System.out.println("Hi : "+(i+1));
		}
	}	
}

class Hello extends Thread {
	public void run() {
		for(int i=0; i<100; i++) {
			 System.out.println("Hello : "+(i+1));
			}
	}
}
