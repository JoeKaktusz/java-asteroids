package asteroids;


/**
 * Flying entity class will be the parent class of the non-static elementy like ammo, asteroids, spaceship.
 */
public abstract class FlyingEntity extends Entity {
    
    protected Vec2 vel;

    protected FlyingEntity(double posX, double posY, double velX, double velY){
        super(posX, posY);
        vel.setX(velX);
        vel.setY(velY);
    }

    public void move(){
        pos.add(vel);
    }

}
