package asteroids;

import javax.swing.*;

/**
 * This class is the Entity class. Everything that is renderable inherits from this class.
 */
public abstract class Entity extends JPanel{
    
    protected Vec2 pos;    

    /**
     * Consturctor
     * @param x
     * @param y
     */
    protected Entity(double x, double y){
        pos.setX(x);
        pos.setY(y);
    }

    /**
     * pos vector getter
     * @return position vector
     */
    public Vec2 getPos(){
        return pos;
    }

    /**
     * set the position vector
     * @param newVec the new position vector
     */
    public void setPos(Vec2 newVec){
        pos.setX(newVec.getX());
        pos.setY(newVec.getY());
    }
}