import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ButtonMsgActionListener implements ActionListener {

	Finestra f1;
	Persona p1;
	public ButtonMsgActionListener(Finestra finestra) {
		// TODO Auto-generated constructor stub
		
		this.f1 = finestra;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String nome = f1.campo1.getText();
		String pin = f1.campo2.getText();
		String saldo = "";
boolean ok = false;
		
		for (int i = 0; i < f1.lista.size(); i++) {
			
			if (f1.lista.get(i).nome.equals(nome) && f1.lista.get(i).pin.equals(pin)) {
				ok = true;
				saldo = f1.lista.get(i).c1.toString();
			}
		}
		if (ok == true) {
				
				JOptionPane.showMessageDialog(null, saldo);
			}
		}
	}


