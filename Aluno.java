import java.time.LocalDate;

public class Aluno {
	private int matricula;
	private String nome;
	private LocalDate data_nascimento;
	
	public Aluno(int matricula, String nome, LocalDate data_nascimento) {
		this.matricula = matricula;
		this.nome = nome;
		this.data_nascimento = data_nascimento;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getdata_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(LocalDate data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	
	
}
