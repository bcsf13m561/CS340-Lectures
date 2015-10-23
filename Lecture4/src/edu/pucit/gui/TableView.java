package edu.pucit.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TableView extends JFrame{
	private static final long serialVersionUID = -6791831399375537864L;
	
	JLabel betAmount = new JLabel("$1000,000");
	public TableView(){
		this.getContentPane().add(betAmount);
		this.setVisible(true);
		this.setSize(500, 300);
	}

	public static void main(String[] args) {
		new TableView();

	}

}
