package gerenciamento;

import java.util.Scanner;

public class SistemaHotel {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Hotel hotel = new Hotel();

     while (true) {
         System.out.println("\nMenu:");
         System.out.println("1. Cadastrar Quarto");
         System.out.println("2. Listar Quartos");
         System.out.println("3. Cadastrar Reserva");
         System.out.println("4. Listar Reservas");
         System.out.println("5. Realizar Check-in");
         System.out.println("6. Realizar Check-out");
         System.out.println("7. Relatório de Ocupação");
         System.out.println("8. Sair");
         System.out.print("Escolha uma opção: ");
         int opcao = scanner.nextInt();
         scanner.nextLine(); // Consumir a nova linha

         switch (opcao) {
             case 1:
                 System.out.print("Número do quarto: ");
                 int numero = scanner.nextInt();
                 scanner.nextLine(); // Consumir a nova linha
                 System.out.print("Tipo do quarto (solteiro, casal, suite): ");
                 String tipo = scanner.nextLine();
                 System.out.print("Preço diário: ");
                 double preco = scanner.nextDouble();
                 hotel.cadastrarQuarto(numero, tipo, preco);
                 break;
             case 2:
                 hotel.listarQuartos();
                 break;
             case 3:
                 System.out.print("Nome do hóspede: ");
                 String nomeHospede = scanner.nextLine();
                 System.out.print("Data de check-in (DD/MM/AAAA): ");
                 String checkIn = scanner.nextLine();
                 System.out.print("Data de check-out (DD/MM/AAAA): ");
                 String checkOut = scanner.nextLine();
                 System.out.print("Número de quartos reservados: ");
                 int numeroQuartos = scanner.nextInt();
                 scanner.nextLine(); // Consumir a nova linha
                 System.out.print("Tipo de quarto reservado: ");
                 String tipoQuarto = scanner.nextLine();
                 hotel.cadastrarReserva(nomeHospede, checkIn, checkOut, numeroQuartos, tipoQuarto);
                 break;
             case 4:
                 hotel.listarReservas();
                 break;
             case 5:
                 System.out.print("Nome do hóspede para check-in: ");
                 String hospedeCheckIn = scanner.nextLine();
                 hotel.realizarCheckIn(hospedeCheckIn);
                 break;
             case 6:
                 System.out.print("Nome do hóspede para check-out: ");
                 String hospedeCheckOut = scanner.nextLine();
                 hotel.realizarCheckOut(hospedeCheckOut);
                 break;
             case 7:
                 hotel.relatorioOcupacao();
                 break;
             case 8:
                 System.out.println("Saindo do sistema...");
                 scanner.close();
                 return;
             default:
                 System.out.println("Opção inválida. Tente novamente.");
         }
     }
 }
}