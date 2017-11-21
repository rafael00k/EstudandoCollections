package br.com.collections.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoCollection {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		String  a1 = "Java 3";
		String a2 = "Java 1";
		String a3 = "Java 2";
		lista.add(a1);
		lista.add(a3);
		lista.add(a2);
		System.out.println(lista);
		lista.remove("Java 3");
		System.out.println(lista);
		lista.add(a1);
		System.out.println(lista);
		lista.remove(0);
		System.out.println(lista);
		lista.add(a1);
		System.out.println("A primeira aula é "+lista.get(0));
        Collections.sort(lista);
		System.out.println(lista);

        
	}

}
