import java.util.Scanner;

public class Array {

	Scanner scanner = new Scanner(System.in);
	String[] nomes = new String[10];

	public void arrayNomes() {

		int cont = 0;
		while (cont < 10) {
			System.out.println("INFORME O NOME DO ALUNO(A) " + (cont + 1));
			nomes[cont] = scanner.next();
			cont++;
		}
		
		System.out.println(cont);
		cont = 0;
		while (cont < 10) {
			
			System.out.println("O NOME DO ALUNO(A) " + cont + " É " + nomes[cont]);
			cont++;
		}
	}

}
