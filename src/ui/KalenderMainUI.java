package ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KalenderMainUI {
	
	public KalenderMainUI() {
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
		
		
		JLabel kalender = new JLabel("Kalender");
		kalender.setBounds(180,10,300,40);
		kalender.setFont(new Font("Arial" ,Font.PLAIN,30));
		panel.add(kalender);
		
		JButton kalender_butt = new JButton("Kalender");
		kalender_butt.setBounds(100,70,300,40);
		kalender_butt.addActionListener(e -> {
			
		});
		panel.add(kalender_butt);
		
		JButton creTer = new JButton("Termin erstellen");
		creTer.setBounds(100,120,300,40);
		creTer.addActionListener(e -> {

		});
		panel.add(creTer);
		
		JButton delTer = new JButton("Termin Löschen");
		delTer.setBounds(100,170,300,40);
		delTer.addActionListener(e -> {
			
		});
		panel.add(delTer);
		
		
		JButton backB = new JButton("Zurück");
		backB.setBounds(100,220,300,40);
		backB.addActionListener(e -> {
			UI ui = new UI();
			frame.dispose();
		});
		panel.add(backB);
		
		frame.setVisible(true);
	}

}
