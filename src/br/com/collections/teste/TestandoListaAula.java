package br.com.collections.teste;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.collection.modelos.Aula;

public class TestandoListaAula {
	public static void main(String[] args) {
		Aula a1 = new Aula("Java : primeiros passos",50);
		Aula a2 = new Aula("Java : continuando..",35);
		Aula a3 = new Aula ("Proximos passos",45);
		
		List<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println(aulas);
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
		

		
	}

}
