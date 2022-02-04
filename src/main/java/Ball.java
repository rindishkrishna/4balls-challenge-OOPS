import processing.core.PApplet;
public class Ball {
    private int x;
    private int y;
    private int diameter;
    private int velocity;
    PApplet FourBalls;

    public Ball(int x, int y, int diameter, int velocity, PApplet FourBalls) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.velocity = velocity;
        this.FourBalls = FourBalls;
    }
    public void increaseSpeed(){
        this.x=this.x+this.velocity;
    }
    public void draw() {
        FourBalls.ellipse(this.x,this.y,this.diameter,this.diameter);
    }
}
