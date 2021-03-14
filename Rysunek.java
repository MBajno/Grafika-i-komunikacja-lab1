package Rysunek;

import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

class Surface extends JPanel {

    private void doDrawing(Graphics g) {
        //niebo
        g.setColor (new Color(0, 141, 255));
        g.fillRect (0,0,900,500);

        //słońce
        g.setColor (new Color(252, 212, 64));
        g.fillArc (100,33,90,90,0,360);

        //chmury
        g.setColor (Color.white);
        g.fillArc (660,130,80,50,0,360);
        g.fillArc (690,110,70,50,0,360);
        g.fillArc (730,130,80,50,0,360);

        g.fillArc (700,50,80,50,0,360);
        g.fillArc (740,30,70,50,0,360);
        g.fillArc (760,50,80,50,0,360);

        g.fillArc (50,50,80,50,0,360);
        g.fillArc (80,30,70,50,0,360);
        g.fillArc (100,40,80,50,0,360);

        g.fillArc (250,80,80,50,0,360);
        g.fillArc (280,60,70,50,0,360);
        g.fillArc (300,70,80,50,0,360);



        //dom
        g.setColor (new Color(238, 224, 176));
        g.fillRect (400,130,300,320);
        g.setColor (Color.black);
        g.fillRect (400,130,10,320);
        g.setColor (Color.black);
        g.fillRect (700,130,10,320);
        g.setColor (Color.black);
        g.fillRect (400,440,300,10);


        //drzwi
        g.setColor (new Color(105, 42, 42));
        g.fillArc (525,338,80,25,0,180);
        g.fillRect (525,350,80,90);
        g.setColor (Color.white);
        g.fillRect (533,403,10,2);


        //trawa
        g.setColor (Color.green);
        g.fillRect (0,450,900,50);

        //drzewa
        g.setColor (new Color(105, 42, 42));
        int a [] = {740,770,780,790};
        int b [] = {450,300,300,450};
        g.fillPolygon (a, b, 4);
        g.setColor (new Color(127,255,0));
        g.fillArc (710,300,120,80,0,360);
        g.fillArc (710,270,130,80,0,360);
        g.fillArc (720,240,110,100,0,360);
        g.fillArc (740,210,60,90,0,360);

        g.setColor (new Color(105, 42, 42));
        int c [] = {240,270,280,290};
        int d [] = {450,300,300,450};
        g.fillPolygon (c, d, 4);
        g.setColor (new Color(127,255,0));
        g.fillArc (210,300,120,80,0,360);
        g.fillArc (210,270,130,80,0,360);
        g.fillArc (220,240,110,100,0,360);
        g.fillArc (240,210,60,90,0,360);

        g.setColor (new Color(105, 42, 42));
        int e [] = {140,170,180,190};
        int f [] = {450,300,300,450};
        g.fillPolygon (e, f, 4);
        g.setColor (new Color(127,255,0));
        g.fillArc (110,300,120,80,0,360);
        g.fillArc (110,270,130,80,0,360);
        g.fillArc (120,240,110,100,0,360);
        g.fillArc (140,210,60,90,0,360);

        //dach
        g.setColor (new Color(105, 42, 42));
        int m [] = {450,650,750,350};
        int n [] = {70,70,130,130};
        g.fillPolygon (m, n, 4);
        g.setColor (Color.black);
        int q [] = {450,650,750,350};
        int z [] = {70,70,130,130};
        g.drawPolygon (q, z, 4);
        g.setColor (new Color(105, 42, 42));


        // okno górne prawe
        g.setColor (Color.black);
        g.fillRect (600,188,30,50);
        g.fillRect (630,188,31,50);
        g.setColor (Color.white);
        g.fillRect (602,190,26,46);
        g.fillRect (632,190,26,46);

        // okno górne lewe
        g.setColor (Color.black);
        g.fillRect (450,188,30,50);
        g.fillRect (480,188,31,50);
        g.setColor (Color.white);
        g.fillRect (452,190,26,46);
        g.fillRect (482,190,26,46);
/*
        //rolety w oknie góra
        g.setColor (new Color(105,105,105));
        g.drawRect( 402,191,55, 1);
        g.drawRect( 402,194,55, 1);
        g.drawRect( 402,197,55, 1);
        g.drawRect( 402,200,55, 1);
        g.drawRect( 402,203,55, 1);
        g.drawRect( 402,206,55, 1);
        g.drawRect( 402,209,55, 1);

        // dolne okno
        g.setColor (new Color(105,105,105));
        g.drawRect (395,335,60,8);
        g.drawRect (395,335,60,10);
        g.fillRect (395,345,30,50);
        g.fillRect (425,345,31,50);
        g.setColor (Color.white);
        g.fillRect (398,347,26,46);
        g.fillRect (427,347,26,46);

        // okno z lewej na pietrze
        g.setColor (new Color(105,105,105));
        g.drawRect (250,180,60,8);
        g.fillRect (250,188,30,50);
        g.fillRect (280,188,31,50);
        g.setColor (Color.white);
        g.fillRect (252,190,26,46);
        g.fillRect (282,190,26,46);
*/
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}
public class Rysunek extends JFrame {

    public Rysunek() {

        initUI();
    }

    private void initUI() {

        add(new Surface());

        setTitle("Rysunek");
        setSize(916, 539);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Rysunek ex = new Rysunek();
                ex.setVisible(true);
            }
        });
    }
}