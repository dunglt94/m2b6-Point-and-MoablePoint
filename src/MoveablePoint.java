public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {}

    public MoveablePoint(float xSpeed, Float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Float[] getSpeeds() {
        Float[] speeds = { xSpeed, ySpeed };
        return speeds;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + "), " +
                "speed = (" + this.xSpeed + ", " + this.ySpeed + ")";
    }

    public void move() {
        super.setX(super.getX() + this.xSpeed);
        super.setY(super.getY() + this.ySpeed);
    }
}
