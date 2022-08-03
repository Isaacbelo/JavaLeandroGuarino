package escola;

import java.util.ArrayList;

public class Professor extends Pessoa {

    private String formacaoAcademica;
    private double salario;

    private ArrayList<Turma> turmas;
    private ArrayList<Disciplina> disciplinas;

    public void aplicarAvaliacao() {
    }

    public Professor() {
        disciplinas = new ArrayList<Disciplina>();
    }
    

    //4 Métodos para manipular o CRUD
    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void excluirDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
    }

    public int quantidadeDisciplina() {
        return disciplinas.size();
    }

    public Disciplina getDisciplina(int posicao) {
        return disciplinas.get(posicao);
    }

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
