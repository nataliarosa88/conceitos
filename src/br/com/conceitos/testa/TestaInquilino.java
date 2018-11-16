package br.com.conceitos.testa;

import br.com.conceitos.model.Inquilino;

public class TestaInquilino {	
	public static void main(String[] args) {
		Inquilino inquilino1 = new Inquilino();
		inquilino1.nome = "Andre";
		inquilino1.cpf = "33548755852";
		
		System.out.println(inquilino1.nome);
		System.out.println(inquilino1.cpf);
		System.out.println(inquilino1.validaCpf(inquilino1.cpf));
	}
}
