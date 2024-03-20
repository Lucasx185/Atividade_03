import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastrar Aluno:");

        System.out.println("Insira n�mero de matr�cula do aluno: ");
        int numeroMatriculaAluno = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.print("Data de nascimento do aluno (DD/MM/YYYY): ");
        String dataNascimentoInput = scanner.nextLine();
        LocalDate dataNascimentoAluno = LocalDate.parse(dataNascimentoInput, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Aluno aluno = new Aluno(numeroMatriculaAluno, nomeAluno, dataNascimentoAluno);
        
        System.out.println("\nCadastro de Curso:");
        System.out.print("C�digo do curso: ");
        int codigoCurso = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Nome do curso: ");
        String nomeCurso = scanner.nextLine();
        System.out.print("Data de in�cio do curso (DD/MM/YYYY): ");
        String dataInicioInput = scanner.nextLine();
        LocalDate dataInicioCurso = LocalDate.parse(dataInicioInput, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Curso curso = new Curso(codigoCurso, nomeCurso, dataInicioCurso);

        
        System.out.println("\nMatr�cula:");
        System.out.print("Data de matr�cula (DD/MM/YYYY): ");
        String dataMatriculaInput = scanner.nextLine();
        LocalDate dataMatricula = LocalDate.parse(dataMatriculaInput, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Matricula matricula = new Matricula(aluno, curso, dataMatricula);

        
        if (matricula.alunoPodeSerMatriculado()) {
            System.out.println("\nMatr�cula realizada com sucesso:");
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Curso: " + curso.getCod_curso());
            System.out.println("Data de in�cio do curso: " + curso.getData_inicio());
            System.out.println("Data de matr�cula: " + dataMatricula);
        } else {
            System.out.println("\nO aluno n�o pode ser matriculado pois � menor de idade.");
        }

        scanner.close();
    }

}
