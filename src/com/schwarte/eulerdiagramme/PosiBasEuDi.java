/*	
 * PosiBasEuDi
 */

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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

/**
 * Programm zur graphischen Darstellung von Zirkel-Diagrammen
 * nach Euler auf Basis der Positionen der Diagrammelemente 
 * entlang der Basisgeraden
 * 
 * @author Dr.-Ing. Joachim Schwarte
 * @version 0.95
 */

public class PosiBasEuDi {
	
	Language l = Language.English;

	private JFrame frmPositionsBasierteEulerdiagramme;
	private JTextField textField_0;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JCheckBox chckbxKreisAJN;
	private JCheckBox chckbxKreisBJN;
	private JCheckBox chckbxKreisCJN;
	private JCheckBox chckbxSternJN;
	private JButton btnNewButton;
	private JLabel lblLang;
	private JComboBox<Language> comboBox_1;
	private int a1;
	private int ax;
	private int a2;
	private int b1;
	private int bx;
	private int b2;
	private int c1;
	private int cx;
	private int c2;
	private int ex;
	private boolean az;
	private boolean bz;
	private boolean cz;
	private boolean ez;
	
	/**
	 * Launch the application.
	 * @param args
	 * Parameterliste
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
		initialize(l);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param l
	 * initial GUI-Language
	 */
	private void initialize(Language l) {		
		frmPositionsBasierteEulerdiagramme = new JFrame();
		frmPositionsBasierteEulerdiagramme.setTitle(GuiStrings.getGuiString("ti",l));
		frmPositionsBasierteEulerdiagramme.setBounds(100, 15, 566, 700);
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
		        boolean rangeOK = true;
		        boolean circleOK = true;
		        boolean nomaskOK = true;
		        boolean insideOK = true;
		        try {
			        a1 = Integer.valueOf(textField_0.getText());
			        ax = Integer.valueOf(textField_1.getText());
			        a2 = Integer.valueOf(textField_2.getText());
			        az = chckbxKreisAJN.isSelected();
			        if (az == true && (a1>=ax || ax>=a2)) {circleOK=false;}
			        b1 = Integer.valueOf(textField_3.getText());
			        bx = Integer.valueOf(textField_4.getText());
			        b2 = Integer.valueOf(textField_5.getText());
			        bz = chckbxKreisBJN.isSelected();
			        if (bz == true && (b1>=bx || bx>=b2)) {circleOK=false;}
			        c1 = Integer.valueOf(textField_6.getText());
			        cx = Integer.valueOf(textField_7.getText());
			        c2 = Integer.valueOf(textField_8.getText());
			        cz = chckbxKreisCJN.isSelected();
			        if (cz == true && (c1>=cx || cx>=c2)) {circleOK=false;}
			        ex = Integer.valueOf(textField_9.getText());
			        ez = chckbxSternJN.isSelected();
			        if (az == true && bz == true && (ax == b1 || ax == bx || ax == b2)) {nomaskOK = false;}
			        if (az == true && cz == true && (ax == c1 || ax == cx || ax == c2)) {nomaskOK = false;}
			        if (bz == true && az == true && (bx == a1 || bx == ax || bx == a2)) {nomaskOK = false;}
			        if (bz == true && cz == true && (bx == c1 || bx == cx || bx == c2)) {nomaskOK = false;}
			        if (cz == true && az == true && (cx == a1 || cx == ax || cx == a2)) {nomaskOK = false;}
			        if (cz == true && bz == true && (cx == b1 || cx == bx || cx == b2)) {nomaskOK = false;}
			        if (ez == true && az == true && (ex == a1 || ex == ax || ex == a2)) {nomaskOK = false;}
			        if (ez == true && bz == true && (ex == b1 || ex == bx || ex == b2)) {nomaskOK = false;}
			        if (ez == true && cz == true && (ex == c1 || ex == cx || ex == c2)) {nomaskOK = false;}		
			        if (ez == true) {
			        	insideOK = false;
			        	if (az == true && a1 < ex && a2 > ex) {insideOK = true;}
			        	if (bz == true && b1 < ex && b2 > ex) {insideOK = true;}
			        	if (cz == true && c1 < ex && c2 > ex) {insideOK = true;}
			        }
		        } catch (NumberFormatException e) {
		        	rangeOK = false;
		        } 
		        if (rangeOK == true && circleOK == true && nomaskOK == true && insideOK == true) {
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
		        } else {
		        	int zeilen = 0;
	        		g2d.drawString(GuiStrings.getGuiString("e0",comboBox_1.
		        			getItemAt(comboBox_1.getSelectedIndex())),30,100);	
		        	if (rangeOK == false) {
		        		g2d.drawString(GuiStrings.getGuiString("e1",comboBox_1.
			        			getItemAt(comboBox_1.getSelectedIndex())),30,130);	
		        		zeilen++;
		        	}
		        	if (circleOK == false) {
		        		g2d.drawString(GuiStrings.getGuiString("e2",comboBox_1.
			        			getItemAt(comboBox_1.getSelectedIndex())),30,130+20*zeilen);
		        		zeilen++;
		        	}
		        	if (nomaskOK == false) {
		        		g2d.drawString(GuiStrings.getGuiString("e3",comboBox_1.
			        			getItemAt(comboBox_1.getSelectedIndex())),30,130+20*zeilen);	
		        		zeilen++;
		        	}
		        	if (insideOK == false) {
		        		g2d.drawString(GuiStrings.getGuiString("e4",comboBox_1.
			        			getItemAt(comboBox_1.getSelectedIndex())),30,130+20*zeilen);
		        		zeilen++;
		        	}
		        	if (rangeOK == false || nomaskOK == false || circleOK == false) {
		        		g2d.drawString(GuiStrings.getGuiString("e5",comboBox_1.
			        			getItemAt(comboBox_1.getSelectedIndex())),30,150+20*zeilen);
		        	}
	        		if (rangeOK == false) {
	        			g2d.drawString(GuiStrings.getGuiString("e6",comboBox_1.
			        			getItemAt(comboBox_1.getSelectedIndex())),30,180+20*zeilen);
	        			zeilen++;
	        		}
	        		if (nomaskOK == false) {
	        			g2d.drawString(GuiStrings.getGuiString("e7",comboBox_1.
			        			getItemAt(comboBox_1.getSelectedIndex())),30,180+20*zeilen); 
	        			zeilen++;
	        		}
	        		if (circleOK == false) {
	        			g2d.drawString(GuiStrings.getGuiString("e8",comboBox_1.
			        			getItemAt(comboBox_1.getSelectedIndex())),30,180+20*zeilen);
	        			g2d.drawString(GuiStrings.getGuiString("e9",comboBox_1.
			        			getItemAt(comboBox_1.getSelectedIndex())),30,200+20*zeilen);
	        			
	        		}
		        }
		    } 			
		};
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 160, 550, 500);
		frmPositionsBasierteEulerdiagramme.getContentPane().add(panel);
		
		textField_0 = new JTextField();
		textField_0.setDocument(new SetMaxText(1)); 
		textField_0.setBounds(20, 30, 33, 20);
		textField_0.setText("1");
		frmPositionsBasierteEulerdiagramme.getContentPane().add(textField_0);
		textField_0.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setDocument(new SetMaxText(1)); 
		textField_1.setColumns(10);
		textField_1.setBounds(65, 30, 33, 20);
		textField_1.setText("2");
		frmPositionsBasierteEulerdiagramme.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setDocument(new SetMaxText(1)); 
		textField_2.setColumns(10);
		textField_2.setBounds(110, 30, 33, 20);
		textField_2.setText("3");
		frmPositionsBasierteEulerdiagramme.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setDocument(new SetMaxText(1)); 
		textField_3.setColumns(10);
		textField_3.setBounds(172, 30, 33, 20);
		textField_3.setText("0");
		frmPositionsBasierteEulerdiagramme.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setDocument(new SetMaxText(1)); 
		textField_4.setColumns(10);
		textField_4.setBounds(217, 30, 33, 20);
		textField_4.setText("5");
		frmPositionsBasierteEulerdiagramme.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setDocument(new SetMaxText(1)); 
		textField_5.setColumns(10);
		textField_5.setBounds(262, 30, 33, 20);
		textField_5.setText("6");
		frmPositionsBasierteEulerdiagramme.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setDocument(new SetMaxText(1)); 
		textField_6.setColumns(10);
		textField_6.setBounds(324, 30, 33, 20);
		textField_6.setText("4");
		frmPositionsBasierteEulerdiagramme.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setDocument(new SetMaxText(1)); 
		textField_7.setColumns(10);
		textField_7.setBounds(369, 30, 33, 20);
		textField_7.setText("7");
		frmPositionsBasierteEulerdiagramme.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setDocument(new SetMaxText(1)); 
		textField_8.setColumns(10);
		textField_8.setBounds(416, 30, 33, 20);
		textField_8.setText("8");
		frmPositionsBasierteEulerdiagramme.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setDocument(new SetMaxText(1)); 
		textField_9.setColumns(10);
		textField_9.setBounds(476, 30, 33, 20);
		textField_9.setText("9");
		frmPositionsBasierteEulerdiagramme.getContentPane().add(textField_9);
		
		JLabel lblNewLabel = new JLabel("  (     A     )      [     B     ]      {     C     }      *");
		lblNewLabel.setFont(new Font("Courier New", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 8, 507, 14);
		frmPositionsBasierteEulerdiagramme.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabelC = new JLabel("PosiBasEuDi Version 0.95");
		lblNewLabelC.setFont(new Font("Arial", Font.PLAIN, 10));
		lblNewLabelC.setBounds(20, 140, 516, 14);
		lblNewLabelC.setHorizontalAlignment(2);
		frmPositionsBasierteEulerdiagramme.getContentPane().add(lblNewLabelC);

		JLabel lblNewLabelD = new JLabel("12.02.2018    Dr.-Ing. Joachim Schwarte");
		lblNewLabelD.setFont(new Font("Arial", Font.PLAIN, 10));
		lblNewLabelD.setBounds(10, 140, 516, 14);
		lblNewLabelD.setHorizontalAlignment(4);
		frmPositionsBasierteEulerdiagramme.getContentPane().add(lblNewLabelD);
		
		chckbxKreisAJN = new JCheckBox(GuiStrings.getGuiString("c1",l));
		chckbxKreisAJN.setBounds(16, 52, 97, 23);
		chckbxKreisAJN.setSelected(true);
		frmPositionsBasierteEulerdiagramme.getContentPane().add(chckbxKreisAJN);
		
		chckbxKreisBJN = new JCheckBox(GuiStrings.getGuiString("c2",l));
		chckbxKreisBJN.setBounds(168, 52, 97, 23);
		chckbxKreisBJN.setSelected(true);
		frmPositionsBasierteEulerdiagramme.getContentPane().add(chckbxKreisBJN);
		
		chckbxKreisCJN = new JCheckBox(GuiStrings.getGuiString("c3",l));
		chckbxKreisCJN.setBounds(320, 52, 97, 23);
		chckbxKreisCJN.setSelected(true);
		frmPositionsBasierteEulerdiagramme.getContentPane().add(chckbxKreisCJN);
		
		chckbxSternJN = new JCheckBox(GuiStrings.getGuiString("c4",l));
		chckbxSternJN.setBounds(471, 52, 97, 23);
		chckbxSternJN.setSelected(false);
		frmPositionsBasierteEulerdiagramme.getContentPane().add(chckbxSternJN);
		
		btnNewButton = new JButton(GuiStrings.getGuiString("b1",l));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel.repaint();
			}

		});
		btnNewButton.setBounds(20, 77, 507, 20);
		frmPositionsBasierteEulerdiagramme.getContentPane().add(btnNewButton);
		
		lblLang = new JLabel(GuiStrings.getGuiString("l1",l));
		lblLang.setFont(new Font("Arial", Font.BOLD, 12));
		lblLang.setBounds(350, 104, 100, 20);
		lblLang.setHorizontalAlignment(2);
		frmPositionsBasierteEulerdiagramme.getContentPane().add(lblLang);
		
		comboBox_1 = new JComboBox<Language>();
		comboBox_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				changeLanguage(comboBox_1.getItemAt(comboBox_1.getSelectedIndex()));
				panel.repaint();
				
			}			
		});
		comboBox_1.setModel(new DefaultComboBoxModel<Language>(Language.values()));
		comboBox_1.setBounds(427, 105, 100, 20);
		comboBox_1.setSelectedIndex(1);
		frmPositionsBasierteEulerdiagramme.getContentPane().add(comboBox_1);

	}
	
	/**
	 * Wechsel der Sprache der Benutzerführung (GUI)
	 * @param l1
	 * die gewählte Sprache
	 */
	
	private void changeLanguage(Language l1) {
		frmPositionsBasierteEulerdiagramme.setTitle(GuiStrings.getGuiString("ti",l1));
		chckbxKreisAJN.setText(GuiStrings.getGuiString("c1",l1));
		chckbxKreisBJN.setText(GuiStrings.getGuiString("c2",l1));
		chckbxKreisCJN.setText(GuiStrings.getGuiString("c3",l1));
		chckbxSternJN.setText(GuiStrings.getGuiString("c4",l1));
		btnNewButton.setText(GuiStrings.getGuiString("b1",l1));
		lblLang.setText(GuiStrings.getGuiString("l1",l1));
		l=l1;
	}
}
