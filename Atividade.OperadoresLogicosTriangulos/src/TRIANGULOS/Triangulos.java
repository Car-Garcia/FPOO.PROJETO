package TRIANGULOS;

public class Triangulos {
	
	public void Triangulos() {
		
		
		if ((getLado1() == getLado2()) && (getLado2() == getLado3())) {
			System.out.println("COM BASE COM OS VALORES DADOS O TRIANGULO � EQUIL�TERO");
			System.exit(0);
		}
		if ((getLado1() == getLado2()) && (getLado2() != getLado3())) {
			System.out.println("COM BASE COM OS VALORES DADOS O TRIANGULO � IS�SCELES");
			System.exit(0);
		}
		if ((getLado1() != getLado2()) && (getLado2() != getLado3())) {
			System.out.println("COM BASE COM OS VALORES DADOS O TRIANGULO � ESCALENO");
			System.exit(0);
		}
		
	}

	int lado1, lado2, lado3;
	
	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	public int getLado3() {
		return lado3;
	}

	public void setLado3(int lado3) {
		this.lado3 = lado3;
	}
}
