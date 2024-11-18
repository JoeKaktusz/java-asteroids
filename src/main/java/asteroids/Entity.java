package asteroids;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


/**
 * This class is the Entity class. Everything that is renderable inherits from this class.
 */
public abstract class Entity extends JPanel{
    
    private Vec2 pos;    

    /**
     * Consturctor
     * @param x
     * @param y
     */
    protected Entity(double x, double y){
        pos.setX(x);
        pos.setY(y);
    }
}