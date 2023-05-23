package MaiorValor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Valores valores = new Valores();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("INFORME O PRIMEIRO NUMERO: ");
		valores.setN1(scanner.nextInt());
		
		System.out.println("INFORME O SEGUNDO NUMERO: ");
		valores.setN2(scanner.nextInt());
		
		System.out.println("INFORME O TERCEIRO NUMERO: ");
		valores.setN3(scanner.nextInt());
		
		valores.TesteLogico();
	}

}
