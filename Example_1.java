package Lr_2;

import java.util.Scanner;

public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введи число: ");
		int number = in.nextInt();
		int N = 3;
		if (number == 0) {
			System.out.println("Число не должно быть равно 0");
		}	else  if (number % N == 0) { 
			System.out.println("Число кратно 3");
		}	else {
			System.out.println("Число не кратно 3");
		}
		in.close();
	}

}
