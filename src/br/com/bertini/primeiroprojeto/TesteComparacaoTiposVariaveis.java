package br.com.bertini.primeiroprojeto;

public class TesteComparacaoTiposVariaveis {

	public static void main(String[] args) {
		
		
		Cliente cliente = new Cliente();
		
		System.out.println("PRIMITIVOS");
		System.out.println(cliente.getIdadePrimitivo());
		System.out.println(cliente.isClientePrimitivo());
		System.out.println(cliente.getValorPrimitivo());
		
		System.out.println("..................");
	
		System.out.println("WRAPPERS");
		System.out.println(cliente.getIdadeWrapper());
		System.out.println(cliente.getClienteAtivoWrapper());
		System.out.println(cliente.getValorWrapper());
	
	
	}
}
