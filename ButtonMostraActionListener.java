import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ButtonMostraActionListener implements ActionListener {

	Finestra f1;
	public ButtonMostraActionListener(Finestra finestra) {
		
		
		this.f1 = finestra;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	
		
		
		String nome;
		String pin;
		nome = f1.campo1.getText();
		pin = f1.campo2.getText();
		boolean ok = false;
		
		for (int i = 0; i < f1.lista.size(); i++) {
			
			if (f1.lista.get(i).nome.equals(nome) && f1.lista.get(i).pin.equals(pin)) {
				ok = true;
			}
		}
		
		if (ok == true) {
			
			f1.button_preleva.setVisible(true);
			f1.button_versa.setVisible(true);
			f1.button_msg.setVisible(true);
			f1.label3.setVisible(true);
		    f1.campo3.setVisible(true);

			
		}
		else {
			f1.button_preleva.setVisible(false);
			f1.button_versa.setVisible(false);
			f1.button_msg.setVisible(false);
		}
	}

}
