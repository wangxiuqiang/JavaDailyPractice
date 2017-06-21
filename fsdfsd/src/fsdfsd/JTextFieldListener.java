package fsdfsd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.xml.soap.Text;

public class JTextFieldListener implements ActionListener {

	 static String str;
   JTextField textField;
	public void setField(JTextField text){
		textField = text;
	}
	public void actionPerformed(ActionEvent e) {
		JTextField test = (JTextField) e.getSource();
		str = test.getText();
		if(!str.isEmpty() ){
			try{
				textField.setText("2");
			}catch (Exception a) {
			
			}
		}
		
	}
}
