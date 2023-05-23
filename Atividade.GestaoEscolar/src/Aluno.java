
public class Aluno {
	
	private String nomeAluno;

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		int tamanho = nomeAluno.length();
		if(tamanho >= 3)
		this.nomeAluno = nomeAluno;
	}
	
	

}
