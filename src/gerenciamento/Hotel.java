package gerenciamento;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

	private List<Quarto> quartos;
 private List<Reserva> reservas;

 public Hotel() {
     quartos = new ArrayList<>();
     reservas = new ArrayList<>();
 }

 public void cadastrarQuarto(int numero, String tipo, double preco) {
     Quarto quarto = new Quarto(numero, tipo, preco);
     quartos.add(quarto);
     System.out.println("Quarto " + numero + " cadastrado com sucesso.");
 }

 public void listarQuartos() {
     System.out.println("\nLista de Quartos:");
     for (Quarto quarto : quartos) {
         System.out.println(quarto);
     }
 }

 public void cadastrarReserva(String nomeHospede, String checkIn, String checkOut, int numeroQuartos, String tipoQuarto) {
     Reserva reserva = new Reserva(nomeHospede, checkIn, checkOut, numeroQuartos, tipoQuarto);
     reservas.add(reserva);
     System.out.println("Reserva para " + nomeHospede + " cadastrada com sucesso.");
 }

 public void listarReservas() {
     System.out.println("\nHistórico de Reservas:");
     for (Reserva reserva : reservas) {
         System.out.println(reserva);
     }
 }

 public void realizarCheckIn(String nomeHospede) {
     for (Reserva reserva : reservas) {
         if (reserva.getNomeHospede().equals(nomeHospede)) {
             int count = 0;
             for (Quarto quarto : quartos) {
                 if (quarto.getTipo().equals(reserva.getTipoQuarto()) && quarto.isDisponivel() && count < reserva.getNumeroQuartos()) {
                     quarto.setDisponibilidade(false);
                     count++;
                 }
             }
             if (count == reserva.getNumeroQuartos()) {
                 System.out.println("Check-in realizado para " + nomeHospede + ".");
             } else {
                 System.out.println("Quartos insuficientes disponíveis para esta reserva.");
             }
             return;
         }
     }
     System.out.println("Reserva não encontrada.");
 }

 public void realizarCheckOut(String nomeHospede) {
     for (Reserva reserva : reservas) {
         if (reserva.getNomeHospede().equals(nomeHospede)) {
             for (Quarto quarto : quartos) {
                 if (quarto.getTipo().equals(reserva.getTipoQuarto())) {
                     quarto.setDisponibilidade(true);
                 }
             }
             System.out.println("Check-out realizado para " + nomeHospede + ".");
             return;
         }
     }
     System.out.println("Reserva não encontrada.");
 }

 public void relatorioOcupacao() {
     System.out.println("\nRelatório de Ocupação:");
     for (Quarto quarto : quartos) {
         if (!quarto.isDisponivel()) {
             System.out.println(quarto);
         }
     }
 }
}