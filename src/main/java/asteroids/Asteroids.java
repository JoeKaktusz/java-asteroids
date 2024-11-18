package asteroids;

import javax.swing.JFrame;

public class Asteroids extends FlyingEntity{
    double rad;
    public Asteroids(double velX, double velY, Vec2 shipPos){
        super(0,0,0,0);
        rad = Math.random()*20.0 + 20;

    }
}
