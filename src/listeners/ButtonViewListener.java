package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import Manager.FinancialManager;
import gui.FinancialViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;
	
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FinancialViewer financialViewer = frame.getFinancialviewer();
		FinancialManager financialManager = getObject("financialManager.ser");
		
		
		financialViewer.setFinancialManager(financialManager);
		
		// TODO Auto-generated method stub
		frame.getContentPane().removeAll();
		frame.getContentPane().add(financialViewer);
		frame.revalidate();
		frame.repaint();

	}
	
	public static FinancialManager getObject(String filename) {
		FinancialManager financialManager = null;


		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			financialManager = (FinancialManager)in.readObject();

			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return financialManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return financialManager;


	}

}
