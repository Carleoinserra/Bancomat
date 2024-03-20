import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Finestra extends JFrame {
	
	
	String nome;
	JButton button_mostra;
	JButton button_msg;
	JButton button_messaggio;
	JButton button_preleva;
	JButton button_versa;
    JLabel label1;
    JTextField campo1;
    JLabel label2;
    JTextField campo2;
    JLabel label3;
    JTextField campo3;
    ArrayList<Persona> lista = new ArrayList<>();

	public static void main(String[] args) {
		
		Finestra  f1 = new Finestra("Finestra di benvenuto");
		
		
	}
	
	
	public Finestra(String titolo) {
		super(titolo);
		  
		 
		
		// imposta la dimensione della finestra
		this.setSize(500, 500);
		
		// specifica che la chiusura della finestra deve
				// fare terminare l'intero programma
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// inizializza la prima casella di input
				label1 = new JLabel("Scrivi il tuo cognome");
				campo1 = new JTextField(40);
				
				
				label2 = new JLabel("Scrivi il tuo pin");
				campo2 = new JTextField(40);
				
				label3 = new JLabel("Scrivi l'importo");
				campo3 = new JTextField(40);
		
		
		// primo bottone (mostra il valore del contatore)
	   button_mostra = new JButton("Accedere");
				// associa al bottone il suo comportamento
		button_mostra.addActionListener(new ButtonMostraActionListener(this));
		
		 button_msg = new JButton("Stampa");
		button_msg.addActionListener(new ButtonMsgActionListener(this ));
		
		 button_messaggio = new JButton("Inserisci nuovo utente");
		button_messaggio.addActionListener(new ButtonStampaActionListener(this));
		
		button_preleva = new JButton("Preleva");
		button_preleva.addActionListener(new ButtonPrelevaActionListener(this ));
		
		button_versa = new JButton("Versa");
		button_versa.addActionListener(new ButtonVersaActionListener(this ));
		
		// un panel e' un contenitore di elementi da
		// visualizzare in una finestra
	    JPanel panel = new JPanel();
	    
	    panel.add(label1);
	    panel.add(campo1);
	    panel.add(label2);
	    panel.add(campo2);
	    panel.add(button_mostra);
	    panel.add(button_msg);
	    panel.add(button_messaggio);
	    panel.add(button_preleva);
	    panel.add(button_versa);
	    panel.add(label3);
	    panel.add(campo3);
	    button_msg.setVisible(false);
	    button_preleva.setVisible(false);
	    button_versa.setVisible(false);
	    label3.setVisible(false);
	    campo3.setVisible(false);
	    this.add(panel);
	    
	    this.setVisible(true);
				
	}}


