import java.util.ArrayList;
import java.util.List;
public class Turma {
    List<Estudante> alunos = new ArrayList<>();
    public void adicionar_alunos(Estudante alunos){
        this.alunos.add(alunos);
    }
    public double media_aluno(){
        double media_aluno = 0;
        for(Estudante estudante : this.alunos){
            media_aluno += estudante.nota;
        }
        return media_aluno/this.alunos.size();
    } 
}
