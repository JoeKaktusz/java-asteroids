package asteroids;


/**
 * Flying entity class will be the parent class of the non-static elementy like ammo, asteroids, spaceship.
 */
public abstract class FlyingEntity extends Entity {
    
    protected Vec2 vel; //this is in m/s
    protected double radius;
    /**
     * Constructor for flying entity
     * @param posX
     * @param posY
     * @param velX
     * @param velY
     */
    protected FlyingEntity(double posX, double posY, double velX, double velY,double radius){
        super(posX, posY);
        vel.setX(velX);
        vel.setY(velY);
        this.radius = radius;
    }

    /**
     * Velocity vector getter
     * @return
     */
    public Vec2 getVel(){
        return vel;
    }

    /**
     * Velocity vector setter
     * @param newVel
     */
    public void setVel(Vec2 newVel){
        vel = newVel;
    }

    /**
     * Radius getter
     * @return
     */
    public double getRadius(){
        return radius;
    }

    /**
     * Radius setter
     * @param newRadius
     */
    public void setRadius(double newRadius){
        radius = newRadius;
    }

    /**
     * Moves the flying-entity.
     */
    public void move(){
        pos.add(vel.getMultipliedVecByLambda(1.0/60.0)); //multiplied by 60 because it is 60 frame per second.
    }

}
