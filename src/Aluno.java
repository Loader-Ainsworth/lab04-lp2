public class Aluno {
	
	private String nome;
	private String matricula;
	private String curso;
	
	public Aluno(String nome, String mat, String curso) {
		strValida(mat);
		strValida(nome);
		strValida(curso);
		this.nome = nome;
		this.curso = curso;
		this.matricula = mat;
	}
	
	private void strValida(String str) {
		if (str == null) throw new NullPointerException();
		if (str.trim().equals("")); throw new IllegalArgumentException();
	}
}
