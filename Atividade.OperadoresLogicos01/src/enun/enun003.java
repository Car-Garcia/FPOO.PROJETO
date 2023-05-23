package enun;

import java.util.Scanner;

/*
 * ent = tempo e velocidade
 * pro = tempo * velocidade e distancia / 12
 * said = litros gastos 
 */

public class enun003 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		double time, velocidade, distancia, litros;
		
		System.out.println("Tempo gasto:");
		time = scanner.nextDouble();
		
		System.out.println("Tempo gasto:");
		velocidade = scanner.nextDouble();
		
		distancia = (time * velocidade);
		
		litros = (distancia /12);
		
		System.out.println("Litros gatos: " + litros);
		
		
	}

}
