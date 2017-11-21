package br.com.collections.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.collection.modelos.Aula;
import br.com.collection.modelos.Curso;

public class TestaCurso2 {
	public static void main(String[] args) {
		Curso colecoesJava = new Curso("Coleções com Java","Tiago");
		colecoesJava.adiciona(new Aula("Iniciado o curso", 30));
		colecoesJava.adiciona(new Aula("Continuando o curso", 15));
		colecoesJava.adiciona(new Aula("Finalizando o curso", 10));
		
		System.out.println(colecoesJava.getAulas());
		List<Aula> aulas = new ArrayList<>(colecoesJava.getAulas());
		Collections.sort(aulas);
		System.out.println(aulas);
		System.out.println(colecoesJava.getTempoTotal());
		System.out.println(colecoesJava);
	}

}
