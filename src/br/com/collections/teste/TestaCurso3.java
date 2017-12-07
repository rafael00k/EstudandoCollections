package br.com.collections.teste;

import br.com.collection.modelos.Aluno;
import br.com.collection.modelos.Aula;
import br.com.collection.modelos.Curso;

public class TestaCurso3 {
    public static void main(String[] args) {
        Curso colecoesJava = new Curso("Coleções com Java","Tiago");
        colecoesJava.adiciona(new Aula("Iniciado o curso", 30));
        colecoesJava.adiciona(new Aula("Continuando o curso", 15));
        colecoesJava.adiciona(new Aula("Finalizando o curso", 10));
        colecoesJava.matricula(new Aluno("Pedro",23451));
        colecoesJava.matricula(new Aluno("Tiago",14322));
        colecoesJava.matricula(new Aluno("Janilove",32456));
        System.out.println(colecoesJava.getAlunos());
        colecoesJava.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

}
}
