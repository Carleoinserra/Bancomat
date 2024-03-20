import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ButtonStampaActionListener implements ActionListener {

	Finestra f1;
	Persona p1;
	
	
	
	
	public ButtonStampaActionListener(Finestra finestra) {
		this.f1 = finestra;
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		String nome = f1.campo1.getText();
		String indirizzo = f1.campo2.getText();
		
		JOptionPane.showMessageDialog(null, "Buon pomeriggio da: "+ nome);
		
		int randomNum = (int)(Math.random() * 10000); 
		
		ContoCorrente c1 = new ContoCorrente(10000, randomNum);
		Persona p = new Persona(nome, indirizzo, c1);
		f1.lista.add(p);

	}

}
