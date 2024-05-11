import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
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

    public static void main(String[] args) {
        Snake2 snake1 = new Snake2();
    }
}
