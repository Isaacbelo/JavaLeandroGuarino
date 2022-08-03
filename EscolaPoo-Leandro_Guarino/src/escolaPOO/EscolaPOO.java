package escolaPOO;

import escola.Disciplina;// Importação da clase disciplina do pacote escola

public class EscolaPOO {

    public static void main(String[] args) {

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("MATEMATICA");
        disciplina1.setCargaHoraria(100);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setNome("PORTUGUES");
        disciplina2.setCargaHoraria(200);

        System.out.format("Disciplina: %s \nHoras: %d\n", disciplina1.getNome(), disciplina1.getCargaHoraria());
    }

}
