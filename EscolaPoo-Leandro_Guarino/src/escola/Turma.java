package escola;

import java.util.ArrayList;

public class Turma {

    private String sigla;
    private int ano;
    //Uma turma tem vários alunos, vários professores
    private ArrayList<Aluno> alunos;

//Construtor Turma () iniciando quando objeto é instanciado
    public Turma() {
        alunos = new ArrayList<Aluno>();
    }

// Criar 4 métodos para array, adicionar, quantidade, remover e mostrar
    public void adicionarAluno(Aluno aluno) {//metodo adiciona aluno com parametro do objeto Aluno
        alunos.add(aluno);//Array alunos recebe add aluno
    }

    public int quantidadeAlunos() {//Método quantidade de alunos em objeto Alunos
        return alunos.size();
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public Aluno getAluno(int posicao) {
        return alunos.get(posicao);
    }

    private ArrayList<Professor> professores;
    private ArrayList<Disciplina> disciplinas;

    void adicionarAluno() {
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
