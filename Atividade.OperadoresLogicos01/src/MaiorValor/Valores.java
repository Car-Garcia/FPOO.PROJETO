package MaiorValor;

public class Valores {

	public void TesteLogico() {

		if ((n1 > n3) && (n1 > n2)) {
			System.out.println("O PRIMEIRO NUMERO È MAIOR");
		}
		if ((n2 > n1) && (n2 > n3)) {
			System.out.println("O SEGUNDO NUMERO È MAIOR");
		}
		if ((n3 > n1) && (n3 > n2)) {
			System.out.println("O TERCEIRO NUMERO È MAIOR");
							}
	
	}


	int n1, n2, n3;
	boolean resultado;

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getN3() {
		return n3;
	}

	public void setN3(int n3) {
		this.n3 = n3;
	}

}
