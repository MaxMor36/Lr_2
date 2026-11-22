package Lr_2;

import java.util.Scanner;

public class Timus_2012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введи колличество задач: ");
		int number = in.nextInt();
		if (number < 1 && number > 11) {
			do {
				System.out.println("Введи число от 1 до 11: ");
				number = in.nextInt();
			
		}	while (number < 1 && number > 11);
		}
		if (number >= 7) {
			System.out.println("YES YES YES");
		}	else {
			System.out.println("Omae wa mou shindeiru");
		}
		in.close();
	}

}
