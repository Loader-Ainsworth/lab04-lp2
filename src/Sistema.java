import java.util.HashMap;
import java.util.HashSet;

public class Sistema {

	private HashSet <Grupo> grupos = new HashSet<>();
	private HashMap <String, Aluno> mapMatAluno = new HashMap<>();
	
	public String cadastraAluno(String mat, String nome, String curso) { 
		
		if (this.mapMatAluno.put(mat, new Aluno(nome, mat, curso)) == null) {
			return "CADASTRO REALIZADO";	
		} 
		
		return "MATRÍCULA JÁ CADASTRADA";
	}
	
	
	public String consultaAluno(String mat) {
		
		if (this.mapMatAluno.containsKey(mat)) {
			Aluno consultado = mapMatAluno.get(mat);
			return String.format("Aluno: %s", consultado.toString());
			
		} else {
			return "Aluno não cadastrado.";
		}
	}
	
	public String cadastraGrupo(String nome) {
		Grupo novoGrupo = new Grupo(nome);
		
		if (grupos.contains(novoGrupo)) {
			return "GRUPO JÁ CADASTRADO!";
		}		
		grupos.add(novoGrupo);
		return "CADASTRO REALIZADO"; 				// TODO: try catch and print exception
	}
	
	public String alocaAluno(String mat, String nomeGrupo) {
		
		
	}
	public String imprimeGrupo(String nomeGrupo) {
		
	}
}






























