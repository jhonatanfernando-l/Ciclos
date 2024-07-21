package Ciclo;

import java.util.Scanner;

public class Ciclo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N, i;
		
		System.out.println("Ingrese el valor de el ciclo");
		
		N = new Scanner(System.in).nextInt();
		
		for(i=1 ; i<=N ; i++) {
			
			if (i % 2 == 0) {
				
				System.out.print("0,");
			}else {
				System.out.print("1,");
			}
		}
		
	}

}
