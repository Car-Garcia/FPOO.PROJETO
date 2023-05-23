package TRIANGULOS;

import java.util.Scanner;

public class MAIN {
	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		Triangulos triangulos = new Triangulos();
		
		System.out.println("INFORME O VALOR DO LADO ESQUERDO DO TRIANGULO: ");
		triangulos.setLado1(scanner.nextInt());
		
		System.out.println("INFORME O VALOR DO LADO DIREITO DO TRIANGULO: ");
		triangulos.setLado2(scanner.nextInt());
		
		System.out.println("INFORME O VALOR DA BASE DO TRIANGULO: ");
		triangulos.setLado3(scanner.nextInt());
		
		triangulos.Triangulos();
	}

}
