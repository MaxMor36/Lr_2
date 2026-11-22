package Lr_2;

import java.util.Scanner;

public class Timus_1409 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Сколько прострелил банок Гарри: ");
		int G = in.nextInt();
		System.out.println("Сколько прострелил банок Ларри: ");
		int L = in.nextInt();
		int sum = G + L;
		int G_a;
		int L_a;
		
		if (sum != 11) {
			do {
				System.out.println("Потраченных потронов должно быть 11");
				System.out.println("Сколько прострелил банок Гарри: ");
				G = in.nextInt();
				System.out.println("Сколько прострелил банок Ларри: ");
				L = in.nextInt();
			} while (sum == 11);
		}
		G_a = 10 - G;
		L_a = 10 - L;
		System.out.println("Гарри оставалось прострелить " + G_a + " банок, а Ларри - " + L_a + " банок. \nЛарри прострелил у Гарри банку под номером " + G + ".");
		
		in.close();
	}

}
