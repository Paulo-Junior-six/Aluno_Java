package testeAluno;


	import java.time.LocalDate;
	import java.time.format.DateTimeFormatter;
	import java.time.format.DateTimeParseException;
	import java.util.Scanner;

	public class TesteData {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        LocalDate dataNascimento = null;

	    
	        try {
	            System.out.print("Digite a data de nascimento (dd/MM/yyyy): ");
	            String dataInput = scanner.nextLine();

	           
	            dataNascimento = LocalDate.parse(dataInput, formatter);

	          
	            System.out.println("Data de Nascimento formatada: " + dataNascimento.format(formatter));

	        } catch (DateTimeParseException e) {
	            System.out.println("Erro: Data de nascimento inválida. Use o formato dd/MM/yyyy.");
	        } finally {
	            scanner.close();
	        }
	    }
	}

