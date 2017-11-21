package br.com.collection.modelos;

public class Aula implements Comparable<Aula> {
	private String nome;
	private int tempo;
	
	public Aula (String nome,int tempo) {
		this.nome = nome;
		this.tempo = tempo;
	}
	public String getNome() {
		return nome;
	}
	public int getTempo() {
		return tempo;
	}
	@Override
	public String toString() {
		return "(Aula: " + this.nome + ", " + this.tempo + " minutos)";
	}
	@Override
	public int compareTo(Aula outraaula) {
		return this.nome.compareTo(outraaula.nome);
	}
}
