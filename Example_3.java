package Lr_2;

import java.util.Scanner;

public class Example_3 {
	
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
        Scanner in = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = in.nextInt();
        if (number == 0) {
            System.out.println("Число не должно быть 0");
        }

        else if (number % 4 == 0 && number > 10 ) {
            System.out.println("Число " + number + " подходит по критериям: делится на 4 и меньше 10");
        }

        else if  (number % 4 != 0) {
            System.out.println("Число " + number + " не делится на 4");
            if  (number < 10) {
                System.out.println("Число " + number + " меньше 10");
            }
        }

        else if  (number < 10) {
            System.out.println("Число " + number + " меньше 10");
        }
        in.close();
    }

}
