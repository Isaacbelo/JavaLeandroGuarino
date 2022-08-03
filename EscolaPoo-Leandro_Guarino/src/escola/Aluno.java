package escola;

import java.util.ArrayList;
import java.util.Date;

public class Aluno extends Pessoa {//Aluno herda Pessoa

    private Date data_nascimento;

    // Aluno tem uma turma
    private Turma turma;

    void realizarAvlaiacao() {
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

}
