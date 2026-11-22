package Lr_2;

import java.util.Scanner;

public class Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Введи число: ");
		int number = in.nextInt();
		if (number == 0) {
			System.out.println("Число не должно быть равно 0");
		}	else if (number % 5 == 2) {
			System.out.println("При делении на 5, остаток 2");
		} 	else {
			System.out.println("При делении на 5, остаток не 2");
		}
		if (number == 0) {
			System.out.println("Число не должно быть равно 0");
		}	else if (number % 7 == 1) {
			System.out.println("При делении на 7, остаток 1");
		} 	else {
			System.out.println("При делении на 7, остаток не 1");
		}
		in.close();
	}

}
