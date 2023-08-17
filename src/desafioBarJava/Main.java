package desafioBarJava;


	import java.util.Locale;
	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			Bill calc = new Bill();
			
			System.out.printf("Sexo: ");
			calc.gender = sc.next().charAt(0);
			System.out.printf("Quantidade de cervejas: ");
			calc.beer = sc.nextInt();
			System.out.printf("Quantidade de refrigerantes: ");
			calc.softDrink = sc.nextInt();
			System.out.printf("Quantidade de espetinhos:");
			calc.barbecue = sc.nextInt();
			System.out.println();
			System.out.println();
			
	        System.out.println("RELATÓRIO: ");	
	        System.out.println("Consumo = R$ " + calc.feeding());
			
			
			
			if (calc.consumo > 30) {
				System.out.println("Isento de couvert");
	       
			}
			else {
				System.out.printf("Couvert = R$ %.2f%n", calc.cover());
			}
			
			System.out.printf("Ingresso = R$ %.2f%n", calc.ticket());
			
			System.out.println();
			
			System.out.printf("Valor a pagar = R$ %.2f%n", calc.total());
			

			
			
			sc.close();
		}

	}
