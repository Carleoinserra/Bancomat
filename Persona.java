
public class Persona {

	String nome;
	

	String pin;
	
	ContoCorrente c1;
	
	public Persona(String nome, String pin, ContoCorrente c1) {
		
		this.nome = nome ;
		this.pin = pin;
		this.c1 = c1;	}
	@Override
	public String toString() {
		return "[nome=" + nome + ", pin=" + pin + "]";
	}
	public void setIndirizzo(String indirizzo) {
		
		this.pin = indirizzo;
	}
	public String getTipo() {
		return("persona");
	}
	
}
