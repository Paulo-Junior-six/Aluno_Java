package testeAluno;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        
        System.out.print("Nome: ");
        aluno.setNome(scanner.nextLine());

        System.out.print("Matrícula: ");
        aluno.setMatricula(scanner.nextLine());

        System.out.print("Sexo: ");
        aluno.setSexo(scanner.nextLine());

        System.out.print("Data de Nascimento: ");
        aluno.setDataNascimento(scanner.nextLine());

        System.out.print("Curso: ");
        aluno.setCurso(scanner.nextLine());

        System.out.print("Ano de Início: ");
        aluno.setAnoInicio(scanner.nextInt());

        System.out.print("Nota da Prova 1: ");
        aluno.setNotaProva1(scanner.nextDouble());

        System.out.print("Nota da Prova 2: ");
        aluno.setNotaProva2(scanner.nextDouble());

        System.out.print("Média das Notas dos Trabalhos: ");
        aluno.setMediaTrabalhos(scanner.nextDouble());

       
        System.out.println("\n--- Resultados ---");
        System.out.println("Nome: " + aluno.getNome());
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Média Final: " + df.format(aluno.calcularMediaFinal()));
        System.out.println("Status: " + (aluno.estaAprovado() ? "Aprovado" : "Reprovado"));

        scanner.close();
    }
}

