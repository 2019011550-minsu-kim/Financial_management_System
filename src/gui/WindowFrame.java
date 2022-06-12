package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Manager.FinancialManager;

//import 

public class WindowFrame extends JFrame{
	FinancialManager financialManager;
	
	MenuSelection menuselection;
	FinancialAdder financialadder;
	FinancialViewer financialviewer;
	
	
	public WindowFrame(FinancialManager financialManager){
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.financialManager = financialManager;
		this.menuselection = new MenuSelection(this);
		this.financialadder = new FinancialAdder(this, this.financialManager);
		this.financialviewer = new FinancialViewer(this, this.financialManager);
		
		
		
		
		
		this.setupPanel(menuselection);
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection /*(¸®ÅÏÇü)*/ getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public FinancialAdder getFinancialadder() {
		return financialadder;
	}

	public void setFinancialadder(FinancialAdder financialadder) {
		this.financialadder = financialadder;
	}

	public FinancialViewer getFinancialviewer() {
		return financialviewer;
	}

	public void setFinancialviewer(FinancialViewer financialviewer) {
		this.financialviewer = financialviewer;
	}


}
