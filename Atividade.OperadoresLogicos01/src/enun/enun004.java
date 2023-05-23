package enun;

import java.util.Scanner;

public class enun004 {


		public static void main(String[] args) {
			
			String a, b, c;
			
			Scanner scanner = new Scanner(System.in);
			
			
			System.out.println("Informe um nome para A: ");
			a = scanner.next();
			
			System.out.println("Informe um nome para B: ");
			b = scanner.next();
			
			c = a;
			a = b;
			b = c;
			
			System.out.println("A: "+ a);
			System.out.println("B: "+ b);
//			System.out.println("c: "+ a);
		
		}

}
