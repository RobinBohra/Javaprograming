package Unit_03;

import java.util.Scanner;

public class P16_MultiThreading {

	public static void main(String[] args) {
		

		C1 a = new C1();
		//a.show1();
		C2 b = new C2();
		//b.show2();
		
		Thread t1 = new Thread(new T1(), "T1");
		Thread t2 = new Thread(new T2(), "T2");
		
		t1.start();
		t2.start();
		

	}

}


class C1 {
	public void show1() {
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		System.out.println(a);
		System.out.println("Done with show 1!");
	}
}

class C2 {
	public void show2() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "hey ");
		}
	}
}

class T1 extends Thread {
	public void run() {
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		System.out.println(a);
		System.out.println("Done with show 1!");
	}
}

class T2 implements Runnable {
	@Override

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "hey ");
		}
	}
}