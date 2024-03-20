import java.io.Serializable;

public class ContoCorrente implements Serializable {
	
	
	// definiamo la proprietà saldo dell'oggetto
	public int saldo;
	public int numero;
	
	public static double tasso = 2;
	
	// definiamo il costruttore
	
	 public ContoCorrente(int saldo, int numero) {
		 
		 this.saldo = saldo;
		 this.numero = numero;
		 
		 this.numero = numero;
	 }

		
	

	// andiamo a definire il metodo preleva
	 public void preleva(int somma) {
		 
		 if(somma <= this.saldo) {
		 
		 this.saldo -= somma;
	 }
		 else {
			 System.out.println("somma non disponibile");
		 }
	 
	 }
	 
	 //andiamo adefinire il metodo versa
	 public void versa(int somma) {
		 this.saldo += somma;
	 }
	 
	 public int getSaldo() {
		 return saldo;
	 }
	 public int getNumero() {
		 return numero;
	 }
	 public String toString() {
		 
		 return "Il saldo è " + this.saldo + " del conto numero: " + this.numero;
	 }
	 
	 public void calcolaInteressi() {
		 this.saldo += saldo* tasso;
	 }
	 
	 
	 
	 
}
