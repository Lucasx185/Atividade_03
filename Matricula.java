import java.time.LocalDate;
import java.time.Period;

public class Matricula {
	private Aluno aluno;
	private Curso curso;
	private LocalDate data_matricula;

	public Matricula(Aluno aluno, Curso curso, LocalDate data_matricula) {
		this.aluno = aluno;
		this.curso = curso;
		this.data_matricula = data_matricula;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public LocalDate getData_matricula() {
		return data_matricula;
	}

	public void setData_matricula(LocalDate data_matricula) {
		this.data_matricula = data_matricula;
	}

	public int calcularIdadeNaMatricula() {
		LocalDate dataNascimento = aluno.getdata_nascimento();
		LocalDate hoje = LocalDate.now();
		Period periodo = Period.between(dataNascimento, hoje);
		return periodo.getYears();
	}

	public boolean alunoPodeSerMatriculado() {
		return calcularIdadeNaMatricula() >= 18;
	}
}
