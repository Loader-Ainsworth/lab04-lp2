import java.util.Scanner;

public class Main {

	private static Scanner scanf = new Scanner(System.in);
	private static Sistema sistemaPadrao = new Sistema(); 
	public static void main(String[] args) {

		String opcao;
		String matricula;
		String nome;
		String curso;
		String grupo;
		String opcaoSecundaria;

		System.out.println("(C)adastrar Aluno");
		System.out.println("(E)xibir Aluno");
		System.out.println("(N)ovo Grupo");
		System.out.println("(A)locar Aluno no Grupo e Imprimir Grupos");
		System.out.println("(R)egistrar Resposta de Aluno");
		System.out.println("(I)mprimir Alunos que Responderam");
		System.out.println("(O)ra, vamos fechar o programa!");
		System.out.println("");
		System.out.println("Opção> "); 
		
		opcao = scanf.nextLine();
		
		switch (opcao) {

		case "C":
					System.out.println("Matrícula: ");
					matricula = scanf.nextLine();
					System.out.println("Nome: ");
					nome = scanf.nextLine();
					System.out.println("Curso: ");
					curso = scanf.nextLine();
					System.out.println(sistemaPadrao.cadastraAluno(matricula, nome, curso));
					break;
		case "E":
					System.out.println("Matrícula: ");
					matricula = scanf.nextLine();
					System.out.println(sistemaPadrao.consultaAluno(matricula));
					break;
		case "N":	
					System.out.println("Grupo: ");
					grupo = scanf.nextLine();
					System.out.println(sistemaPadrao.cadastraGrupo(grupo));
					break;
		case "A":
					System.out.println("(A)locar aluno ou (I)mprimir Grupo? ");
					opcaoSecundaria = scanf.nextLine();
					switch (opcaoSecundaria) {
					case "A":
								System.out.println("Matricula: ");
								matricula = scanf.nextLine();
								System.out.println("Grupo: ");
								grupo = scanf.nextLine();
								System.out.println(sistemaPadrao.alocaAluno(matricula, grupo));
								break;
					case "I": 	
								System.out.println("Grupo: ");
								grupo = scanf.nextLine();
								System.out.println(sistemaPadrao.imprimeGrupo(grupo));
								break;
					default: 
								throw new IllegalArgumentException("Opção inválida");
					}
		case "R":
					System.out.println("Matricula: ");
					matricula = scanf.nextLine();
					System.out.println(sistemaPadrao.registraResposta(matricula));
					break;
		case "I":
					System.out.println(sistemaPadrao.imprimeRespostas());
					break;
		default:
					throw new IllegalArgumentException("Opção inválida");
		}
	}
}