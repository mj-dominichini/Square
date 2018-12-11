/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marijana;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
/**
 *
 * @author MarijanaMac
 */
public class Square extends JFrame {
    public Square()
    {

  setSize(800,800);
  setVisible(true);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
   //drawRect(int xTopLeft, int yTopLeft, int width, int height);
}

public void paint(Graphics g){    
//drawing line 
g.drawLine(0, 400, 800, 400);
g.drawLine(440, 0, 440, 800);
g.drawLine(480, 0, 480, 800);
g.drawLine(520, 0, 520, 800);
g.drawLine(0, 520, 800, 520);
g.drawLine(0, 440, 800, 440);
g.drawLine(0, 480, 800, 480);
}
public static void main(String args[]){



Square s=new Square();

}}

