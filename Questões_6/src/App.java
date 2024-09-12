import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Turma estudantes = new Turma();
        estudantes.adicionar_alunos(new Estudante("Cleitinho Rocha", "47865465", 7.5f));
        estudantes.adicionar_alunos(new Estudante("Jubiscreuzo Ronaldo", "548466", 5.45f));
        estudantes.adicionar_alunos(new Estudante("Valdimira Soares", "987546", 10.0f));
        estudantes.adicionar_alunos(new Estudante("Tubardes Mendes", "785462", 7.8f));

        double media_estudantes = estudantes.media_aluno();
        System.out.printf("Média Turma: %.2f", media_estudantes);
    }
}
