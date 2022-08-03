package escolaPOO;

import escola.Aluno;
import escola.Turma;
import java.util.Date;

public class AssociacaoPraUm {

    public static void main(String[] args) {
        Turma turma1 = new Turma();
        turma1.setSigla("1A");
        turma1.setAno(1);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Jão");//Nome herdado de Pessoa
        aluno1.setData_nascimento(new Date());
        aluno1.setMatricula(123);
        aluno1.setTurma(turma1);//chama o objeto turma
        turma1.adicionarAluno(aluno1);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Zé");
        aluno2.setMatricula(999);
        aluno2.setData_nascimento(new Date());
        aluno2.setTurma(turma1);
        turma1.adicionarAluno(aluno2);

        System.out.format("=========ALUNO============\nNome: %s\nMatricula: %d\nTurma: %s\n", aluno1.getNome(), aluno1.getMatricula(), aluno1.getTurma().getSigla());
        System.out.format("=========ALUNO============\nNome: %s\nMatricula: %d\nTurma: %s\n", aluno2.getNome(), aluno2.getMatricula(), aluno2.getTurma().getSigla());

        for (int i = 0; i < turma1.quantidadeAlunos(); i++) {
            System.out.println("Aluno "+(i+1)+ ": "+turma1.getAluno(i).getNome());

        }
    }
}
