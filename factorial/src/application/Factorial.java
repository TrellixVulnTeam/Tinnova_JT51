package application;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number, factorial = 1; 
		
		System.out.print("Digite um n�mero que deseja obter o fatorial: ");
		number = sc.nextInt(); 
		
		if(number >= 0) { 
			
			for(int i = 1; i <= number; i++) {
				factorial = factorial * i; 
			}
			System.out.println("O n�mero fatorial �: " + factorial);
			
		}else {
			System.out.println("N�o existe fatorial para n�meros negativos.");
		}
		
		sc.close();
	}

}