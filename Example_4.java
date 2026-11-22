package Lr_2;

import java.util.Scanner;

public class Example_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введи число: ");
		int number = in.nextInt();
		if (number >= 5 && number <= 10) {
			System.out.println("Число входит в диапазон от 5 до 10");
		}	else {
			System.out.println("Число не входит в диапазон от 5 до 10");
		}
		in.close();
	}

}
