import processing.core.PApplet;
public class FourBalls  extends  PApplet{
    Ball ball1;
    Ball ball2;
    Ball ball3;
    Ball ball4;
    public static final int WIDTH = 1080;
    public static final int HEIGHT = 800;

    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ball1= new Ball(0,HEIGHT/5 ,20,1,this);
        ball2= new Ball(0,(HEIGHT*2)/5 ,20,2,this);
        ball3= new Ball(0,(HEIGHT*3)/5 ,20,3,this);
        ball4= new Ball(0,(HEIGHT*4)/5,20,4,this);
    }

    @Override
    public void draw() {
        ball1.draw();
        ball1.increaseSpeed();
        ball2.draw();
        ball2.increaseSpeed();
        ball3.draw();
        ball3.increaseSpeed();
        ball4.draw();
        ball4.increaseSpeed();
    }

}
