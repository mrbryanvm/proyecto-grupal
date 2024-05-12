import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
public class Snake2 extends JFrame {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public Snake2() {
        setTitle("Snake");

        setSize(WIDTH, HEIGHT);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame.setDefaultLookAndFeelDecorated(false);
        setUndecorated(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        setVisible(true);

    }

    public static void main(String[] args) {
        Snake2 snake1 = new Snake2();
    }
}

public class Teclas extends java.awt.event.KeyAdapter {
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (direccion != "LEFT") {
                direccion = "RIGHT";
            }
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (direccion != "RIGHT") {
                direccion = "LEFT";
            }
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (direccion != "DOWN") {
                direccion = "UP";
            }
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (direccion != "UP") {
                direccion = "DOWN";
            }
        } else if (e.getKeyCode() == KeyEvent.VK_N) {
            gameOver = false;
            startGame(); // Aquí se llama al método startGame para reiniciar el juego
        }
        // Resto del código para manejar eventos de teclado
    }
}
