import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Mylistener implements ActionListener{
	boolean check = false;
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		// TODO Auto-generated method stub
		if(check) button.setText("�ȳ��ϼ���");
		else button.setText("�ȳ���������");
		check = !check;
	}
	
}
