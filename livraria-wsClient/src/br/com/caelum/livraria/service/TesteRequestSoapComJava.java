package br.com.caelum.livraria.service;

import java.rmi.RemoteException;

public class TesteRequestSoapComJava {

	public static void main(String[] args) throws RemoteException {

		LivrariaWS client = new LivrariaWSProxy();
		Livro[] livros = client.getLivrosPeloNome("arquitetura");
		
		for (Livro livro : livros) {
			System.out.println(livro.getTitulo());
			System.out.println(livro.getAutor().getNome());
		}
	}

}
