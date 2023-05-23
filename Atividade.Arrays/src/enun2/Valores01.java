package enun2;

import java.util.Scanner;

public class Valores01 {
	
	Scanner scanner = new Scanner(System.in);
	
	int[] valores01 = new int [10];
	int[] valores02 = new int [10];
	int cont = 0;
	
	public void valores() {
		
		while(cont < 10) {
			
			System.out.println("INFORME UM VALOR PARA O VALOR " + (cont + 1));
			valores01[cont] = scanner.nextInt();
			cont ++;
			 
		}
		cont = 0;
		while (cont < 10) {
			
			valores02[cont] = valores01[cont] * 3;
			cont ++;
			
		}
		cont = 0;
		while (cont <10) {
			
			System.out.println("valor01: " + valores01[cont] + " valores02: " + valores02[cont]);
			cont ++;
		}
		
		}
		
	}
	


