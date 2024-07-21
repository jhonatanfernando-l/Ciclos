package Ciclo;

import java.util.Iterator;
import java.util.Scanner;

public class Ciclo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N, E, i=1;
		System.out.println("Ingresar el valor de el ciclo");
		N = new Scanner(System.in).nextInt();
		
		for (E=1 ; E<=N; E++) {
			
			System.out.print(i+",");
			
			i = i+4;
		}
	}

}
