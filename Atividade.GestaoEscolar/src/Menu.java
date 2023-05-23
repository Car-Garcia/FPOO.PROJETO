import java.util.Scanner;

public class Menu {

	Professor Prof;
	Aluno aluno;
	Diciplina diciplina;
	Media media;
	private String decisao;

	

	public void exibirMenu() {

		int opcao = 0;
		
		Scanner scanner = new Scanner(System.in);

		while (opcao != 6) {
			
			

			System.out.println("EXCOLHA UMA OPÇÃO PELO NUMERO: ");
			System.out.println("1 - CADASTRAR PROFESSOR");
			System.out.println("2 - CADASTRAR ALUNO");
			System.out.println("3 - CADASTRAR DICIPLINA");
			System.out.println("4 - CADASTAR NOTAS");
			System.out.println("5 - EXIBIR DADOS");
			System.out.println("6 - SAIR");

			opcao = scanner.nextInt();
			
			
			
			switch (opcao) {
			case 1:
				System.out.println("DIGITE O NOME DO PROFESSOR(A): ");
				Prof = new Professor();
				Prof.setNomeProfessor(scanner.next());
				break;
			case 2:
				System.out.println("DIGITE O NOME DO ALUNO(A): ");
				aluno = new Aluno();
				aluno.setNomeAluno(scanner.next());
				break;
			case 3:
				System.out.println("DIGITE A DICIPLINA: ");
				diciplina = new Diciplina();
				diciplina.setNomeDiciplina(scanner.next());
				break;
			case 4:
				System.out.println("DIGITE AS NOTAS");
				media = new Media();
				System.out.println("NOTA 1: ");
				media.setNota1(scanner.nextFloat());
				System.out.println("NOTA 2: ");
				media.setNota2(scanner.nextFloat());
				System.out.println("NOTA 3: ");
				media.setNota3(scanner.nextFloat());
				System.out.println("NOTA 4: ");
				media.setNota4(scanner.nextFloat());
				break;
			case 5:
				System.out.println("EXIBIR DADOS: ");
				System.out.println("NOME DO PROFESSOR (A): " + Prof.getNomeProfessor());
				System.out.println("NOME DO ALUNO: " + aluno.getNomeAluno());
				System.out.println("NOME DA DICIPLINA: " + diciplina.getNomeDiciplina());
				System.out.println("MEDIA: " + media.calcularMedia());
				break;
			case 6:
				System.out.println("#####-OBRIGADO POR USAR O SISTEMA-#####: ");
				break;
			default:
				System.out.println("OPÇÃO INVALIDA ");
				break;
			}// FIM DO SWITCH
		
		} // FIM DO WHILE

	}// FIM DO METODo
	public String getDecisao() {
		return decisao;
	}

	public void setDecisao(String decisao) {
		this.decisao = decisao;
	}

}// FIM DA CLASS MENU
