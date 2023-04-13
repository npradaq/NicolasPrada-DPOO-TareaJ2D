import javax.swing.JPanel;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;

import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;


public class PanelLienzo extends JPanel{

    public PanelLienzo() {

        setSize(700,700);

        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        Rectangle2D.Double rectangle = new Rectangle2D.Double(0,0,1000,1000);
        g2d.setColor(Color.GRAY);
        g2d.fill(rectangle);

        Ellipse2D.Double ellipse = new Ellipse2D.Double(350,70,100,100);
        g2d.setColor(Color.BLACK);
        g2d.fill(ellipse);

        rectangle = new Rectangle2D.Double(390,170,20,40);
        g2d.fill(rectangle);

        RoundRectangle2D.Double roundRectangle = new RoundRectangle2D.Double(320,210,25,180,20,20);
        g2d.fill(roundRectangle);

        roundRectangle = new RoundRectangle2D.Double(455,210,25,180,20,20);
        g2d.fill(roundRectangle);

        rectangle = new Rectangle2D.Double(335,210,130,40);
        g2d.fill(rectangle);

        roundRectangle = new RoundRectangle2D.Double(345,240,15,40,20,20);
        g2d.setColor(Color.GRAY);
        g2d.fill(roundRectangle);

        roundRectangle = new RoundRectangle2D.Double(440,240,15,40,20,20);
        g2d.fill(roundRectangle);

        rectangle = new Rectangle2D.Double(360,210,80,180);
        g2d.setColor(Color.BLACK);
        g2d.setColor(Color.GREEN);
        g2d.fill(rectangle);
        g2d.setColor(Color.BLACK);

        roundRectangle = new RoundRectangle2D.Double(360,370,35,180,20,20);
        g2d.fill(roundRectangle);

        roundRectangle = new RoundRectangle2D.Double(405,370,35,180,20,20);
        g2d.fill(roundRectangle);


        int[] arrX = {230,250,550,570};
        int[] arrY = {590,540,540,590};

        Polygon poly = new Polygon(arrX,arrY,4);

        g2d.fill(poly);

        rectangle = new Rectangle2D.Double(340,50,120,25);
        g2d.setColor(Color.BLUE);
        g2d.fill(rectangle);

        rectangle = new Rectangle2D.Double(375,15,50,35);
        g2d.fill(rectangle);

        ellipse = new Ellipse2D.Double(395,5,10,10);
        g2d.fill(ellipse);

        //RETO 1

        g2d.setStroke(new BasicStroke(3));

        g2d.setColor(Color.YELLOW);
        g2d.drawLine(460,50,490,20);

        g2d.setStroke(new BasicStroke(1));

        g2d.drawLine(480,30,480,25);
        g2d.drawLine(480,30,485,30);

        g2d.drawLine(485,25,490,25);
        g2d.drawLine(485,25,485,20);

        g2d.setColor(Color.RED);

        //RETO 2

        int x = 360;
        int y = 280;
        
        for (int i = 0; i <= 40; i++) {
            g2d.drawLine(x+i, y-i, x+i, y+i);
            g2d.drawLine(x+40+i, y-(40-i), x+40+i, y+(40-i));
        }

        for (int i = 40; i >= 0; i--) {
            g2d.drawLine(x+i, y-i, x+i, y+i);
        }

        //RETO 3

        g2d.setColor(Color.MAGENTA);

        int centroX = 700;
        int centroY = 300;

        int radio = 200;
        int cambio = 8;
        
        for (int i = 0; i <= radio; i+= cambio) {
            g2d.drawLine(centroX, centroY-radio+i, centroX+i, centroY);
            g2d.drawLine(centroX, centroY+radio-i, centroX+i, centroY);
            g2d.drawLine(centroX, centroY-radio+i, centroX-i, centroY);
            g2d.drawLine(centroX, centroY+radio-i, centroX-i, centroY);
        
        }



    }

}
