package gerenciamento;

public class Reserva {

	public Reserva() {
		// TODO Auto-generated constructor stub
	}
 private String nomeHospede;
 private String checkIn;
 private String checkOut;
 private int numeroQuartos;
 private String tipoQuarto;

 public Reserva(String nomeHospede, String checkIn, String checkOut, int numeroQuartos, String tipoQuarto) {
     this.nomeHospede = nomeHospede;
     this.checkIn = checkIn;
     this.checkOut = checkOut;
     this.numeroQuartos = numeroQuartos;
     this.tipoQuarto = tipoQuarto;
 }

 public String getNomeHospede() {
     return nomeHospede;
 }

 public String getCheckIn() {
     return checkIn;
 }

 public String getCheckOut() {
     return checkOut;
 }

 public int getNumeroQuartos() {
     return numeroQuartos;
 }

 public String getTipoQuarto() {
     return tipoQuarto;
 }

 @Override
 public String toString() {
     return "Reserva de " + nomeHospede + ": " + checkIn + " a " + checkOut + " - " + numeroQuartos + " quarto(s) " + tipoQuarto;
 }
}