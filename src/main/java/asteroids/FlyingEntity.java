package asteroids;


/**
 * Flying entity class will be the parent class of the non-static elementy like ammo, asteroids, spaceship.
 */
public abstract class FlyingEntity extends Entity {
    
    protected Vec2 vel; //this is in m/s

    /**
     * Constructor for flying entity
     * @param posX
     * @param posY
     * @param velX
     * @param velY
     */
    protected FlyingEntity(double posX, double posY, double velX, double velY){
        super(posX, posY);
        vel.setX(velX);
        vel.setY(velY);
    }

    /**
     * Moves the flying-entity.
     */
    public void move(){
        pos.add(vel.getMultipliedVecByLambda(1/60)); //multiplied by 60 because it is 60 frame per second.
    }

}
