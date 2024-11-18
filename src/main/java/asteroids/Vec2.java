package asteroids;

/**
 * Ez az osztály felel a 2 dimenziós vektor megvalósításáért. Az alapvető műveleteket lehet végre hajtani vele.
 */
public class Vec2 {
    private double x;
    private double y;
    
    /**
     * Constructor
     * @param x
     * @param y
     */
    public Vec2(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    /**
     * X getter
     * @return x
     */
    public double getX(){
        return x;
    }
    
    /**
     * Y getter
     * @return y
     */
    public double getY(){
        return y;
    }
    
    /**
     * get x's rounded value
     * @return x's rounded value
     */
    public int getRoundedX(){
        return (int) Math.round(x);
    }
    
    /**
     * get y's rounded value
     * @return y's rounded value
     */
    public int getRoundedY(){
        return (int) Math.round(y);
    }
    
    /**
     * x setter
     * @param x x's new value
     */
    public void setX(double x){
        this.x = x;
    }
    
    /**
     * y setter
     * @param y y's new value
     */
    public void setY(double y){
        this.y = y;
    }
    
    /**
     * Add the vector to the current one.
     * @param vec   
     */
    public void add(Vec2 vec){
        x += vec.x;
        y += vec.y;
    }
    
    /**
     * Multiplies the vector by lambda
     * @param lambda lambda value
     */
    public void multiplyBylambda(double lambda){
        x*=lambda;
        y*=lambda;
    }
    
    /**
     * multiplies the vector by lambda and return it as a new vec2
     * @param lambda
     * @return the new vec2
     */
    public Vec2 getMultipliedVecByLambda(double lambda){
        return new Vec2(x*lambda, y*lambda);
    }
    
    

    /**
     * return the negated of the vector.
     * @return
     */
    public Vec2 negative(){
        return this.getMultipliedVecByLambda(-1);
    }
        
    /**
     * subtract the vec parameter with 
     * @param vec
     */
    public void subtract(Vec2 vec){
        add(vec.getMultipliedVecByLambda(-1));
    }

    /**
     * Converts degree to radian for the built in Math.sin/cos functions which takes radians as its parameters
     * @param degree
     * @return
     */
    private double degToRad(double degree){
        return (Math.PI / 180) * degree;
    }

    /**
     * rotate the vector by degree clock wisely.
     * @param degree
     */
    public void rotate(double degree){
        double newX = (Math.cos(degToRad(degree))) * x - (Math.sin(degToRad(degree))*y);
        double newY = (Math.sin(degToRad(degree))) * x + (Math.cos(degToRad(degree))*y);
        x = newX;
        y = newY;
    }

    /**
     * Returns the absolute value of the vector.
     * @return
     */
    public double abs(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y,2));
    }

    /**
     * Set the length (absolute value) of the vector to 1.
     */
    public void normalize(){
        double abs = abs();
        if(abs != 0){
            x *= (1/abs);
            y *= (1/abs);
        }
    }

    /**
     * Transform the vector's absolute value (length) to the new value.
     * @param newAbs
     */
    public void setAbs(double newAbs){
        normalize();
        if (abs() != 0){
            multiplyBylambda(newAbs);
        }
    }

}
