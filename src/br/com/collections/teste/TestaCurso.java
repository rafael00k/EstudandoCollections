package br.com.collections.teste;

import java.util.List;

import br.com.collection.modelos.Aula;
import br.com.collection.modelos.Curso;

public class TestaCurso {

	public static void main(String[] args) {
		Curso colecoesJava = new Curso("Coleções com Java","Tiago");
		colecoesJava.adiciona(new Aula("Iniciado o curso", 30));
		System.out.println(colecoesJava.getAulas());
		

	}

}
