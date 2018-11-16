package br.com.conceitos.model;

import br.com.conceitos.testa.ValidaCPFCNPJ;

public class Inquilino implements RegraInquilino{
	public String nome;
	public String cpf;

	public boolean validaCpf(String cpf) {
		
		if(ValidaCPFCNPJ.isValidCPF(cpf)) 
			return true;
		return false;
	}
}
