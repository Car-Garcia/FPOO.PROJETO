
public class Professor {
	
	private String nomeProfessor;

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		int tamanho = nomeProfessor.length();
		if(tamanho >= 3)
		this.nomeProfessor = nomeProfessor;
		}
	
	

}
