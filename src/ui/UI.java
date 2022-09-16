package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UI {
	
	public UI() {
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
		
		JLabel planer = new JLabel("Studienplaner");
		planer.setBounds(160,10,300,40);
		planer.setFont(new Font("Arial" ,Font.PLAIN,30));
		panel.add(planer);
		
		JButton kalender = new JButton("Kalender");
		kalender.setBounds(100,70,300,40);
		kalender.addActionListener(e -> {
			// Erster kommt hier das Objekt der neunen Klasse also das Fenster was du öffnen willst beispiel
			// NoteUI noteUI = new NoteUI();
			// Dann schließt du dass jetzige Fenster mit
			// frame.dispose();
			// dass schlißt das fenster und du kannst in nem neune Fenster abeiten nicht vergessen wenn du
			// es so schlißt gehen alle eingegebenen Daten verloren wenn du ein neues Fenster aufmachen willst wo die daten drin bleiben
			// es aber nicht sehen willst musst du setVisible auf false machen
		});
		panel.add(kalender);
		
		JButton noten = new JButton("Noten");
		noten.setBounds(100,120,300,40);
		noten.addActionListener(e -> {
			
		});
		panel.add(noten);
		
		JButton stPlan = new JButton("Stundenplan");
		stPlan.setBounds(100,170,300,40);
		stPlan.addActionListener(e -> {
			
		});
		panel.add(stPlan);
		
		
		JButton notes = new JButton("Notizen");
		notes.setBounds(100,220,300,40);
		notes.addActionListener(e -> {
			
		});
		panel.add(notes);
		
		
		JButton lernBe = new JButton("Noten");
		lernBe.setBounds(100,270,300,40);
		lernBe.addActionListener(e -> {
			
		});
		panel.add(lernBe);
		
		frame.setVisible(true);
	}
}
