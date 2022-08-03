
package escolaPOO;

import escola.Disciplina;
import escola.Professor;

public class AssociacaoMuitosParaMuitos {
    public static void main(String[] args) {
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("Matematica");
        disciplina1.setCargaHoraria(85);
        
        Disciplina disciplina2 = new Disciplina();
        disciplina2.setNome("Portugues");
        disciplina2.setCargaHoraria(90);
        
        Professor professor1 = new Professor();
        professor1.setNome("Fessor Bruno");
        professor1.setMatricula(123);
        professor1.setFormacaoAcademica("Licenciado");
        professor1.setSalario(10);
        
        Professor professor2 = new Professor();
        professor2.setNome("Fessora Suzana");
        professor2.setMatricula(999);
        professor2.setFormacaoAcademica("Licenciado");
        professor2.setSalario(10);
        
        professor1.adicionarDisciplina(disciplina1);
        disciplina1.adicionarProfessor(professor1);
        
        professor1.adicionarDisciplina(disciplina2);
        disciplina2.adicionarProfessor(professor1);
        
        professor2.adicionarDisciplina(disciplina2);
        disciplina2.adicionarProfessor(professor2);
        
        // Listar as disicplinas do professor Fessor Bruno. (Objeto professor 1)
        System.out.println("\nDisciplinas do professor "+ professor1.getNome());
        for(int i = 0; i < professor1.quantidadeDisciplina(); i++){
        Disciplina disciplina = professor1.getDisciplina(i);
            System.out.println(disciplina.getNome());}
        
        System.out.println("\nProfessor da disciplina "+ disciplina1.getNome());
        for(int i = 0; i < disciplina1.quantidadeProfessores(); i++){
            System.out.println(disciplina1.getProfessor(i).getNome());
            
        }
    }
}
