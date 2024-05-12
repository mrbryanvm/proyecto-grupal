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








	public class Momento extends Thread {
		
		private long last = 0;
		public Momento() {	
		}
		public void run() {
			while(true) {
				if((java.lang.System.currentTimeMillis() - last) > frequency) {
					if(!gameOver) {

                        if(direccion == "RIGHT") {
                            snake.x = snake.x + widthPoint;
                            if(snake.x > width) {
                                snake.x = 0;
                            }
                        } else if(direccion == "LEFT") {
                            snake.x = snake.x - widthPoint;
                            if(snake.x < 0) {
                                snake.x = width - widthPoint;
                            }                        
                        } else if(direccion == "UP") {
                            snake.y = snake.y - heightPoint;
                            if(snake.y < 0) {
                                snake.y = height;
                            }                        
                        } else if(direccion == "DOWN") {
                            snake.y = snake.y + heightPoint;
                            if(snake.y > height) {
                                snake.y = 0;
                            }                        
                        }
				}

			}
		}
	}

}
