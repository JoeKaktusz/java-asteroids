package asteroids;

/**
 * Ez az osztály felel a 2 dimenziós vektor megvalósításáért. Az alapvető műveleteket lehet végre hajtani vele.
 */
public class Vec2 {
    private double x;
    private double y;
    
    /**
     * 
     * @param x
     * @param y
     */
    public Vec2(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    /**
     * 
     * @return
     */
    public double getX(){
        return x;
    }
    
    /**
     * 
     * @return
     */
    public double getY(){
        return y;
    }
    
    /**
     * 
     * @return
     */
    public int getRoundedX(){
        return (int) Math.round(x);
    }
    
    /**
     * 
     * @return
     */
    public int getRoundedY(){
        return (int) Math.round(y);
    }
    
    /**
     * 
     * @param x
     */
    public void setX(double x){
        this.x = x;
    }
    
    /**
     * 
     * @param y
     */
    public void setY(double y){
        this.y = y;
    }
    
    /**
     * 
     * @param vec
     */
    public void add(Vec2 vec){
        x += vec.x;
        y += vec.y;
    }
    
    /**
     * 
     * @param lambda
     */
    public void multiplyBylambda(double lambda){
        x*=lambda;
        y*=lambda;
    }
    
    /**
     * 
     * @param lambda
     * @return
     */
    public Vec2 getMultipliedVecByLambda(double lambda){
        return new Vec2(x*lambda, y*lambda);
    }
    
    /**
     * 
     * @return
     */
    public Vec2 negative(){
        return this.getMultipliedVecByLambda(-1);
    }
        
    /**
     * 
     * @param vec
     */
    public void subtract(Vec2 vec){
        add(vec.getMultipliedVecByLambda(-1));
    }

    /**
     * 
     * @param vec1
     * @param vec2
     * @return
     */
    public static Vec2 add(Vec2 vec1, Vec2 vec2){
        return new Vec2(vec1.x + vec2.x, vec1.y + vec2.y);
    }

    private double degToRad(double angle){
        return (Math.PI / 180) * angle;
    }

    public void rotateByAngle(double angle){
        double newX = (Math.cos(degToRad(angle))) * x - (Math.sin(degToRad(angle))*y);
        double newY = (Math.sin(degToRad(angle))) * x + (Math.cos(degToRad(angle))*y);
        x = newX;
        y = newY;
    }

    public void rotateByRadian(double radian){
        double newX = (Math.cos(radian)) * x - (Math.sin(radian)*y);
        double newY = (Math.sin(radian)) * x + (Math.cos(radian)*y);
        x = newX;
        y = newY;
    }

}
