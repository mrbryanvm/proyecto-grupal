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

ublic class ImagenSnake extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            if(gameOver) {
                g.setColor(new Color(0,0,0));
            } else {
                g.setColor(new Color(255,255,255));
            }
            g.fillRect(0,0, width, height);
            g.setColor(new Color(0,0,255));
    
            if(listaPosiciones.size() > 0) {
                for(int i=0;i<listaPosiciones.size();i++) {
                    Point p = (Point)listaPosiciones.get(i);
                    g.fillRect(p.x,p.y,widthPoint,heightPoint);
                }
            }
    
            g.setColor(new Color(255,0,0));
            g.fillRect(comida.x,comida.y,widthPoint,heightPoint);    
            
            if(gameOver) {
                g.setFont(new Font("TimesRoman", Font.BOLD, 40));
                g.drawString("GAME OVER", 300, 200);
                g.drawString("SCORE "+(listaPosiciones.size()-1), 300, 240);

                g.setFont(new Font("TimesRoman", Font.BOLD, 20));
                g.drawString("N to Start New Game", 100, 320);
                g.drawString("ESC to Exit", 100, 340);
            }

        }
    }
