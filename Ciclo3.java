package Ciclo;

import java.util.Scanner;

public class Ciclo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N,i;
		
		System.out.println("Ingresar el valor de el ciclo");
		
		N = new Scanner(System.in).nextInt();
		
		/*No me reclamen asi funciona por ahora*/
		N = N +1;
		/*-------------------------------------*/
		for(i=2 ; i<=N ; i++) {
			
			if(i % 2 == 0) {
				System.out.print("1,");
			}else {
				System.out.print(i+",");
			}
		}
	}

}
