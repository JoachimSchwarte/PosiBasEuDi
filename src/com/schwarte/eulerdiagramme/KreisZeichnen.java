package com.schwarte.eulerdiagramme;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics; 
import java.awt.Graphics2D; 
import java.awt.geom.Ellipse2D; 
import javax.swing.JFrame; 
import javax.swing.JPanel;
public class KreisZeichnen extends JFrame { 
	private static final long serialVersionUID = 1L;
	JPanel panel;     
    public KreisZeichnen(){ 
        panel = new KreisPanel(); 
        add(panel); 
        this.setSize(550, 550); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setVisible(true); 
    } 
    public static void main(String[] args) { 
        new KreisZeichnen(); 
    } 
} 
class KreisPanel extends JPanel { 
	private static final long serialVersionUID = 1L;
	public void paintComponent(Graphics g) { 
        Graphics2D g2d = (Graphics2D) g; 
        g2d.setColor(Color.WHITE); 
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight()); 
        g2d.setColor(Color.BLACK); 
        BasicStroke stroke1= new BasicStroke(6.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        Font font1 = new Font("Arial", 50, 50);
        int a1 = 1;
        int ax = 2;
        int a2 = 3;
        boolean az = true;
        int b1 = 0;
        int bx = 5;
        int b2 = 6;
        boolean bz = true;
        int c1 = 4;
        int cx = 7;
        int c2 = 8;
        boolean cz = true;
        int ex = 6;
        boolean ez = false;
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
} 
