package ss6_inheritance.bai_tap;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    public MovablePoint() {

    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeeds() {
        return new float[] { xSpeed, ySpeed };
    }
    public MovablePoint move(){
        setXY(getX()+ xSpeed, getY()+ ySpeed);
        return this;
    }
    @Override
    public String toString() {
        return super.toString() + ", xSpeed=" + xSpeed + ", " + ySpeed + ")";
    }
}
