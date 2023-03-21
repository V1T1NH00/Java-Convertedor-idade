import java.util.Scanner;
public class exeBasico {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
	        
	        // leia a idade em anos, meses e dias
	        System.out.print("Digite a idade em anos: ");
	        int anos = input.nextInt();
	        System.out.print("Digite a idade em meses: ");
	        int meses = input.nextInt();
	        System.out.print("Digite a idade em dias: ");
	        int dias = input.nextInt();
	        
	        // calcule a idade em dias
	        int idadeEmDias = anos * 365 + meses * 30 + dias;
	        
	        // exiba a idade em dias
	        System.out.printf("A idade em dias é: %d", idadeEmDias);
	        
	        input.close();

	}

}