package escola;

import java.util.ArrayList;

public class Disciplina {

    private String nome;
    private int cargaHoraria;

    private ArrayList<Professor> professores;
    private ArrayList<Turma> turmas;

    /**
     * @return the nome
     */
    public Disciplina() {
        professores = new ArrayList<Professor>();

    }

    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cargaHoraria
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria >= 0) {
            this.cargaHoraria = cargaHoraria;
        } else {
            System.out.println("ERRO");
        }
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void excluirProfessor(Professor professor) {
        professores.remove(professor);
    }

    public int quantidadeProfessores() {
        return professores.size();
    }

    public Professor getProfessor(int posicao) {
        return professores.get(posicao);
    }

}
