
public class OperadoresLogicos {
	public void testeLogicos() {
		/*
		 OPERADORES LOGICOS
		 
		&& -> AND -> E
		|| -> OR  -> OU
		!  -> NOT -> NÃO 
		
		 */
		
	int idadeInicio = 18;
	int idadeFim = 90;
	boolean resultado;
	
	/*
	 VERIFICA SE A IDADE DA PESSOA É 18 OU 90 ANOS  
	 */
	
	resultado = (idadeInicio >= 18) || (idadeFim <= 90);
	System.out.println(resultado);
	
	idadeInicio = 17;
	resultado = (idadeInicio >= 18) || (idadeFim <= 90);
	System.out.println(resultado);
			
	/*
	 VERIFICA SE A IDADE DA PESSOA ESTA ENTRE 18 E 90 ANOS  
	 */
	
	idadeInicio = 18;
	resultado = (idadeInicio >= 18) && (idadeFim <= 90);
	System.out.println(resultado);
	
	idadeInicio = 17;
	resultado = (idadeInicio >= 18) && (idadeFim <= 90);
	System.out.println(resultado);
	}
}
