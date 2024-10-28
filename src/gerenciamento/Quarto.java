package gerenciamento;

public class Quarto {

	public Quarto() {
		// TODO Auto-generated constructor stub
	}
 private int numero;
 private String tipo;
 private double preco;
 private boolean disponibilidade;

 public Quarto(int numero, String tipo, double preco) {
     this.numero = numero;
     this.tipo = tipo;
     this.preco = preco;
     this.disponibilidade = true; 
 }

 public int getNumero() {
     return numero;
 }

 public String getTipo() {
     return tipo;
 }

 public double getPreco() {
     return preco;
 }

 public boolean isDisponivel() {
     return disponibilidade;
 }

 public void setDisponibilidade(boolean disponibilidade) {
     this.disponibilidade = disponibilidade;
 }

 @Override
 public String toString() {
     return "Quarto " + numero + " (" + tipo + ") - R$" + preco + " - " + (disponibilidade ? "Disponível" : "Ocupado");
 }
}