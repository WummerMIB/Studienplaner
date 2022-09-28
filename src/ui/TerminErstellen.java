package ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import api.API;

public class TerminErstellen {
	
	private JTextField date;
	private JTextField text;
	private String message;

	
	public TerminErstellen() {
		start();
	}

	private void start() {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame("Studienplaner");
		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		frame.add(panel);
		panel.setBackground(new Color(119,215,239));
		panel.setLayout(null);
		
		JLabel tE = new JLabel("Termin erstellen");
		tE.setBounds(150,10,300,40);
		tE.setFont(new Font("Arial" ,Font.PLAIN,30));
		panel.add(tE);
		
		JLabel dat = new JLabel("Datum dd.mm.yyyy");
		dat.setBounds(100,60,300,40);
		dat.setFont(new Font("Arial" ,Font.PLAIN,15));
		panel.add(dat);
		
		date = new JTextField();
		date.setBounds(100,90,300,20);
		panel.add(date);
		
		JLabel tex = new JLabel("Termin Text");
		tex.setBounds(100,130,300,40);
		tex.setFont(new Font("Arial" ,Font.PLAIN,15));
		panel.add(tex);
		
		text = new JTextField();
		text.setBounds(100,160,300,20);
		panel.add(text);
		frame.setVisible(true);
		
		JButton save = new JButton("Speichern");
		save.setBounds(300,200,100,20);
		save.addActionListener(e -> {
			API api = new API();
			api.saveTermin(date.getText(),text.getText());
		});
		panel.add(save);
		
		JButton abb = new JButton("Abbrechen");
		abb.setBounds(190,200,100,20);
		abb.addActionListener(e -> {
			
		});
		panel.add(abb);
	}

}
