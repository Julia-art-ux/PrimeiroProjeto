package br.com.bertini.primeiroprojeto;

public class EscopoVariavel {
	
	
	private static String nomeFamilia = "Silva";
	

	public static void main(String[] args) {
			
		System.out.println(obtemNomeCompleto("João"));
		System.out.println(obtemNomeFamilia());
		calculo();
	
	}
	
	
	private static String obtemNomeCompleto(String primeiroNome) {
		return primeiroNome + " " + nomeFamilia;
	
	}
	
	private static String obtemNomeFamilia() {
	return nomeFamilia;
	}

	private static void calculo() {
		
		int idade = 15;
		if (idade < 18) {
			System.out.println("Não pode Entrar");	
		} else {  
		
			System.out.println("Pode Entrar");
		}
	}
	
}
	
