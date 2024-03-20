import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastrar Aluno:");

        System.out.println("Insira número de matrícula do aluno: ");
        int numeroMatriculaAluno = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.print("Data de nascimento do aluno (DD/MM/YYYY): ");
        String dataNascimentoInput = scanner.nextLine();
        LocalDate dataNascimentoAluno = LocalDate.parse(dataNascimentoInput, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Aluno aluno = new Aluno(numeroMatriculaAluno, nomeAluno, dataNascimentoAluno);
        
        System.out.println("\nCadastro de Curso:");
        System.out.print("Código do curso: ");
        int codigoCurso = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Nome do curso: ");
        String nomeCurso = scanner.nextLine();
        System.out.print("Data de início do curso (DD/MM/YYYY): ");
        String dataInicioInput = scanner.nextLine();
        LocalDate dataInicioCurso = LocalDate.parse(dataInicioInput, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Curso curso = new Curso(codigoCurso, nomeCurso, dataInicioCurso);

        
        System.out.println("\nMatrícula:");
        System.out.print("Data de matrícula (DD/MM/YYYY): ");
        String dataMatriculaInput = scanner.nextLine();
        LocalDate dataMatricula = LocalDate.parse(dataMatriculaInput, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Matricula matricula = new Matricula(aluno, curso, dataMatricula);

        
        if (matricula.alunoPodeSerMatriculado()) {
            System.out.println("\nMatrícula realizada com sucesso:");
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Curso: " + curso.getCod_curso());
            System.out.println("Data de início do curso: " + curso.getData_inicio());
            System.out.println("Data de matrícula: " + dataMatricula);
        } else {
            System.out.println("\nO aluno não pode ser matriculado pois é menor de idade.");
        }

        scanner.close();
    }

}
