package asteroids;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class AcceleratedDrawing extends JPanel implements KeyListener {
    
    private Vec2 pos = new Vec2(0, 0);
    private boolean moveUp;
    private boolean moveDown;
    private boolean moveLeft;
    private boolean moveRight;
    
    public AcceleratedDrawing() {
        pos = new Vec2(0, 0);
        moveUp = false;
        moveDown = false;
        moveRight = false;
        moveLeft = false;
        
        // Register key listener
        this.addKeyListener(this);
        this.setFocusable(true);

        // Set up a timer to update the position at regular intervals
        Timer timer = new Timer(5, e -> {
            move();
            repaint();  // Repaint the component
        });
        timer.start();
    }

    private void move() {
        if (moveUp) {
            pos.add(new Vec2(0, 1));
        }
        if (moveDown) {
            pos.add(new Vec2(0, -1));
        }
        if (moveRight) {
            pos.add(new Vec2(1, 0));
        }
        if (moveLeft) {
            pos.add(new Vec2(-1, 0));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(pos.getRoundedX(), pos.getRoundedY(), 20, 20); // Draw a simple rectangle
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                moveDown = true;
                break;
            case KeyEvent.VK_DOWN:
                moveUp = true;
                break;    
            case KeyEvent.VK_RIGHT:
                moveRight = true;
                break;    
            case KeyEvent.VK_LEFT:
                moveLeft = true;
                break;    
            default:
                break;
        }
    }   

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                moveDown = false;
                break;
            case KeyEvent.VK_DOWN:
                moveUp = false;
                break;    
            case KeyEvent.VK_RIGHT:
                moveRight = false;
                break;    
            case KeyEvent.VK_LEFT:
                moveLeft = false;
                break;    
            default:
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Only here for the KeyListener interface.
    }

    public void printPosition() {
        System.out.println("The current Position: (" + pos.getX() + ";" + pos.getY() + ")");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hardware Accelerated Example");
        AcceleratedDrawing panel = new AcceleratedDrawing();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
