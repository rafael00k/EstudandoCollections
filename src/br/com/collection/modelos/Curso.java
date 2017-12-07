package br.com.collection.modelos;

import java.util.*;

public class Curso implements Comparable<Curso> {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<>();
	private Set<Aluno> alunos = new HashSet<>();
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	public String getNome() {
		return nome;
	}
	public String getInstrutor() {
		return instrutor;
	}
	public List<Aula> getAulas() {
		return 	Collections.unmodifiableList(aulas);
	}
	@Override
	public String toString() {
		return  "Curso :"+this.nome+" ; Aulas: "+this.aulas;
	}
	@Override
	public int compareTo(Curso outro) {
		
		return this.nome.compareTo(outro.nome);
	}
	public void adiciona (Aula aula) {
		aulas.add(aula);
	}
	public void matricula(Aluno aluno){
		this.alunos.add(aluno);
	}
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	
	public int getTempoTotal () {
		int tempoTotal=0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}
	
	
	
	

}
