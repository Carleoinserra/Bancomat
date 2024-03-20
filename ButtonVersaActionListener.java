import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonVersaActionListener implements ActionListener {
   Finestra f1;
	public ButtonVersaActionListener(Finestra finestra) {
		
		
		this.f1 = finestra;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		String num = f1.campo3.getText();
		int importo = Integer.parseInt(num);
		String nome = f1.campo1.getText();
		String pin = f1.campo2.getText();
		int indice = 0;
		boolean ok = false;
		
		for (int i = 0; i < f1.lista.size(); i++) {
			
			if (f1.lista.get(i).nome.equals(nome) && f1.lista.get(i).pin.equals(pin)) {
				ok = true;
				indice = i;
			}
		}
		
		if (ok == true) {
			
			f1.lista.get(indice).c1.versa(importo);
			
		}
		
	}

}
