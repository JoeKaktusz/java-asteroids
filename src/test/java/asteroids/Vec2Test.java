package asteroids;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

class Vec2Test {
    private Vec2 vec0;
    private Vec2 vec1;
    private Vec2 vec2;
    private Vec2 vec3;
    private double delta;
    
    @BeforeEach
    void testPrep(){
        vec1 = new Vec2(1.3, 3.5);
        vec2 = new Vec2(4.2,7.3);
        vec3 = new Vec2(3,4);
        vec0 = new Vec2(0, 0);
        delta = 0.00000001;
    } 
    
    @Test
    void testGettersAndSetters(){
        int accIntiger = vec1.getRoundedX();
        assertEquals(1,accIntiger);
        accIntiger = vec1.getRoundedY();
        assertEquals(4,accIntiger);

        double accDouble = vec1.getX();
        assertEquals(1.3,accDouble);
        accDouble = vec1.getY();
        assertEquals(3.5,accDouble);

        vec1.setX(1.5);
        vec1.setY(9.4);

        assertEquals(1.5, vec1.getX());
        assertEquals(9.4, vec1.getY());
    }

    @Test
    void testLambda(){
        vec1.multiplyBylambda(2);
        assertEquals(2.6, vec1.getX());
        assertEquals(7, vec1.getY());
        vec1.multiplyBylambda(0);
        assertEquals(0, vec1.getX());
        assertEquals(0, vec1.getY());
    }

    @Test
    void testNegative(){
        vec2 = vec1.negative();
        assertEquals(-1.3, vec2.getX());
        assertEquals(-3.5, vec2.getY());
    }

    @Test
    void testAdd(){
        vec1.add(vec2);
        assertEquals(5.5, vec1.getX());
        assertEquals(10.8, vec1.getY());
    }

    @Test
    void testSubtract(){
        vec1.subtract(vec2);
        assertEquals(-2.9, vec1.getX(),delta);
        assertEquals(-3.8, vec1.getY(),delta);
    }

    @Test
    void testRotation(){
        vec1.rotate(90);
        assertEquals(-3.5, vec1.getX(),delta);
        assertEquals(1.3, vec1.getY(),delta);
        vec1.setX(Math.sqrt(2));
        vec1.setY(Math.sqrt(2));
        vec1.rotate(45);
        assertEquals(2.0, vec1.getY(),delta);
        assertEquals(0, vec1.getX(),delta);

    }

    @Test
    void testAbs(){
        assertEquals(5.0, vec3.abs());
    }

    @Test
    void testNormalize(){
        vec3.normalize();
        assertEquals(3.0/5.0, vec3.getX(),delta);
        assertEquals(4.0/5.0, vec3.getY(),delta);

        vec0.normalize();
        assertEquals(0, vec0.getX());
        assertEquals(0, vec0.getY());

        vec0.setX(2);
        vec0.normalize();
        assertEquals(1, vec0.getX());
        assertEquals(0, vec0.getY());

        vec0.setY(2);
        vec0.setX(0);
        vec0.normalize();
        assertEquals(0, vec0.getX());
        assertEquals(1, vec0.getY());
    }

    @Test
    void testSetAbs(){
        vec3.setAbs(10);
        assertEquals(6, vec3.getX(),delta);
        assertEquals(8, vec3.getY(),delta);

        vec0.setAbs(12);
        assertEquals(0, vec0.getX());
        assertEquals(0, vec0.getY());

        vec0.setX(2);
        vec0.setAbs(3);
        assertEquals(3, vec0.getX());
        assertEquals(0, vec0.getY());

        vec0.setY(2);
        vec0.setX(0);
        vec0.setAbs(3);
        assertEquals(0, vec0.getX());
        assertEquals(3, vec0.getY());
    }
}
