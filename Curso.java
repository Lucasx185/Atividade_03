import java.time.LocalDate;

public class Curso {
	private int cod_curso;
	private String nome_curso;
	private LocalDate data_inicio;
	
	public Curso(int cod_curso, String nome_curso, LocalDate data_inicio) {
		this.cod_curso = cod_curso;
		this.nome_curso = nome_curso;
		this.data_inicio = data_inicio;
	}

	public int getCod_curso() {
		return cod_curso;
	}

	public void setCod_curso(int cod_curso) {
		this.cod_curso = cod_curso;
	}

	public String getNome_curso() {
		return nome_curso;
	}

	public void setNome_curso(String nome_curso) {
		this.nome_curso = nome_curso;
	}

	public LocalDate getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(LocalDate data_inicio) {
		this.data_inicio = data_inicio;
	}
	
	
	
}
