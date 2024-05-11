import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.util.ArrayList;
import java.util.Random;
public class Snake2 extends JFrame {
   ImagenSnake imagenSnake;
    Point snake;
    Point comida;
    ArrayList<Point> listaPosiciones = new ArrayList<Point>();

    int longitud = 2;

    int width = 640;
    int height = 480;

    int widthPoint = 10;
    int heightPoint = 10;

    String direccion = "RIGHT";
    long frequency = 50;

    boolean gameOver = false;

    public Snake2() {
        setTitle("Snake");

        startGame();
        imagenSnake = new ImagenSnake();

        this.getContentPane().add(imagenSnake);

        setSize(width,height);

        this.addKeyListener(new Teclas());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame.setDefaultLookAndFeelDecorated(false);
        setUndecorated(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        setVisible(true);
        Momento momento = new Momento();
        Thread trid = new Thread(momento);
        trid.start();
    }
    public void startGame() {
        comida = new Point(200,100);    
        snake = new Point(320,240);
        listaPosiciones = new ArrayList<Point>();
        listaPosiciones.add(snake);

        longitud = listaPosiciones.size();        
    }
   public void generarComida() {
        Random rnd = new Random();

        comida.x = (rnd.nextInt(width)) + 5;
        if((comida.x % 5) > 0) {
            comida.x = comida.x - (comida.x % 5);
        }

        if(comida.x < 5) {
            comida.x = comida.x + 10;
        }
        if(comida.x > width) {
            comida.x = comida.x - 10;
        }

        comida.y = (rnd.nextInt(height)) + 5;
        if((comida.y % 5) > 0) {
            comida.y = comida.y - (comida.y % 5);
        }    

        if(comida.y > height) {
            comida.y = comida.y - 10;
        }
        if(comida.y < 0) {
            comida.y = comida.y + 10;
        }

    }
   public void actualizar() {

        listaPosiciones.add(0,new Point(snake.x,snake.y));
        listaPosiciones.remove(listaPosiciones.size()-1);

        for (int i=1;i<listaPosiciones.size();i++) {
            Point point = listaPosiciones.get(i);
            if(snake.x == point.x && snake.y  == point.y) {
                gameOver = true;
            }
        }

        if((snake.x > (comida.x-10) && snake.x < (comida.x+10)) && (snake.y > (comida.y-10) && snake.y < (comida.y+10))) {
            listaPosiciones.add(0,new Point(snake.x,snake.y));
            System.out.println(listaPosiciones.size());
            generarComida();
        }
        imagenSnake.repaint();

    }

    public static void main(String[] args) {
        Snake2 snake1 = new Snake2();
    }
}
