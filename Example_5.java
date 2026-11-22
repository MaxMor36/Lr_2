package Lr_2;

import java.util.Scanner;

public class Example_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введи число: ");
		int number = in.nextInt();
		int N = Math.abs(number);
		int digits = String.valueOf(Math.abs(number)).length();
		int answer;
		if (digits >= 0 && digits <= 3) {
			System.out.println("В числе " + number + " нету тысяч");
		}	else {
			answer = N/1000;
			System.out.println("В числе " + number + " находится " + answer + " тысяч");
		}
		in.close();
	}
}
