package com.schwarte.eulerdiagramme;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

public class PosiBasEuDi {

	private JFrame frmPositionsBasierteEulerdiagramme;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JCheckBox chckbxKreisAJn;
	private JCheckBox chckbxKreisBJn;
	private JCheckBox chckbxKreisCJn;
	private JCheckBox chckbxJn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PosiBasEuDi window = new PosiBasEuDi();
					window.frmPositionsBasierteEulerdiagramme.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PosiBasEuDi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPositionsBasierteEulerdiagramme = new JFrame();
		frmPositionsBasierteEulerdiagramme.setTitle("Positions basierte Euler-Diagramme");
		frmPositionsBasierteEulerdiagramme.setBounds(100, 100, 566, 722);
		frmPositionsBasierteEulerdiagramme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPositionsBasierteEulerdiagramme.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel() {
			private static final long serialVersionUID = 1L;
			public void paintComponent(Graphics g) { 
		        Graphics2D g2d = (Graphics2D) g; 
		        g2d.setColor(Color.WHITE); 
		        g2d.fillRect(0, 0, this.getWidth(), this.getHeight()); 
		        g2d.setColor(Color.BLACK); 
		        BasicStroke stroke1= new BasicStroke(6.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
		        Font font1 = new Font("Arial", 50, 50);
		        int a1 = Integer.valueOf(textField.getText());
		        int ax = Integer.valueOf(textField_1.getText());
		        int a2 = Integer.valueOf(textField_2.getText());
		        boolean az = chckbxKreisAJn.isSelected();
		        int b1 = Integer.valueOf(textField_3.getText());
		        int bx = Integer.valueOf(textField_4.getText());
		        int b2 = Integer.valueOf(textField_5.getText());
		        boolean bz = chckbxKreisBJn.isSelected();
		        int c1 = Integer.valueOf(textField_6.getText());
		        int cx = Integer.valueOf(textField_7.getText());
		        int c2 = Integer.valueOf(textField_8.getText());
		        boolean cz = chckbxKreisCJn.isSelected();
		        int ex = Integer.valueOf(textField_9.getText());
		        boolean ez = chckbxJn.isSelected();
		        Ellipse2D.Double kreis1 = new Ellipse2D.Double(42+a1*50, 255-(a2-a1)*25, (a2-a1)*50, (a2-a1)*50);
		        Ellipse2D.Double kreis2 = new Ellipse2D.Double(42+b1*50, 255-(b2-b1)*25, (b2-b1)*50, (b2-b1)*50);
		        Ellipse2D.Double kreis3 = new Ellipse2D.Double(42+c1*50, 255-(c2-c1)*25, (c2-c1)*50, (c2-c1)*50);
		        g2d.setStroke(stroke1);
		        g2d.setFont(font1);         
		        if (az == true) {g2d.draw(kreis1);} 
		        if (bz == true) {g2d.draw(kreis2);}
		        if (cz == true) {g2d.draw(kreis3);}
		        if (az == true) {g2d.drawString("A", 34+ax*50-8, 270);}
		        if (bz == true) {g2d.drawString("B", 34+bx*50-8, 270);}
		        if (cz == true) {g2d.drawString("C", 34+cx*50-8, 270);}
		        if (ez == true) {
		        	g2d.drawString("X", 34+ex*50-8, 270);
		            g2d.drawString("_", 37+ex*50-8, 243);
		            g2d.drawString("|", 44+ex*50-8, 264);
		        }
		    } 
			
		};
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 133, 550, 550);
		frmPositionsBasierteEulerdiagramme.getContentPane().add(panel);
		
		textField = new JTextField();
		textField.setBounds(20, 30, 33, 20);
		textField.setText("1");
		frmPositionsBasierteEulerdiagramme.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(65, 30, 33, 20);
		textField_1.setText("2");
		frmPositionsBasierteEulerdiagramme.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(110, 30, 33, 20);
		textField_2.setText("3");
		frmPositionsBasierteEulerdiagramme.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(172, 30, 33, 20);
		textField_3.setText("0");
		frmPositionsBasierteEulerdiagramme.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(217, 30, 33, 20);
		textField_4.setText("5");
		frmPositionsBasierteEulerdiagramme.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(262, 30, 33, 20);
		textField_5.setText("6");
		frmPositionsBasierteEulerdiagramme.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(324, 30, 33, 20);
		textField_6.setText("4");
		frmPositionsBasierteEulerdiagramme.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(369, 30, 33, 20);
		textField_7.setText("7");
		frmPositionsBasierteEulerdiagramme.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(416, 30, 33, 20);
		textField_8.setText("8");
		frmPositionsBasierteEulerdiagramme.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(476, 30, 33, 20);
		textField_9.setText("9");
		frmPositionsBasierteEulerdiagramme.getContentPane().add(textField_9);
		
		JLabel lblNewLabel = new JLabel("  (     A     )      [     B     ]      {     C     }      *");
		lblNewLabel.setFont(new Font("Courier New", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 8, 507, 14);
		frmPositionsBasierteEulerdiagramme.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabelC = new JLabel("PosiBasEuDi Version 0.9     31.01.2018    Dr.-Ing. Joachim Schwarte");
		lblNewLabelC.setFont(new Font("Arial", Font.PLAIN, 10));
		lblNewLabelC.setBounds(10, 110, 516, 14);
		lblNewLabelC.setHorizontalAlignment(4);
		frmPositionsBasierteEulerdiagramme.getContentPane().add(lblNewLabelC);
		
		chckbxKreisAJn = new JCheckBox("Kreis A J/N");
		chckbxKreisAJn.setBounds(16, 52, 97, 23);
		chckbxKreisAJn.setSelected(true);
		frmPositionsBasierteEulerdiagramme.getContentPane().add(chckbxKreisAJn);
		
		chckbxKreisBJn = new JCheckBox("Kreis B J/N");
		chckbxKreisBJn.setBounds(168, 52, 97, 23);
		chckbxKreisBJn.setSelected(true);
		frmPositionsBasierteEulerdiagramme.getContentPane().add(chckbxKreisBJn);
		
		chckbxKreisCJn = new JCheckBox("Kreis C J/N");
		chckbxKreisCJn.setBounds(320, 52, 97, 23);
		chckbxKreisCJn.setSelected(true);
		frmPositionsBasierteEulerdiagramme.getContentPane().add(chckbxKreisCJn);
		
		chckbxJn = new JCheckBox("* J/N");
		chckbxJn.setBounds(471, 52, 97, 23);
		chckbxJn.setSelected(false);
		frmPositionsBasierteEulerdiagramme.getContentPane().add(chckbxJn);
		
		JButton btnNewButton = new JButton("Diagramm neu zeichnen");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel.repaint();
			}

		});
		btnNewButton.setBounds(20, 77, 507, 20);
		frmPositionsBasierteEulerdiagramme.getContentPane().add(btnNewButton);

	}
	
 
}
