import processing.core.PApplet;
public class FourBalls  extends  PApplet{

    public static final int WIDTH = 800;
    public static final int HEIGHT = 800;
    public static final int DIAMETER = 100;

    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }
    int x1=0,x2=0,x3=0,x4=0;
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        drawBall1();
        drawBall2();
        drawBall3();
        drawBall4();
    }

    private void drawBall1() {
        ellipse(x1,HEIGHT/5  , DIAMETER,DIAMETER);
        x1++;
    }
    private void drawBall2() {
        ellipse(x2,(HEIGHT*2)/5  , DIAMETER,DIAMETER);
        x2=x2+2;
    }
    private void drawBall3() {
        ellipse(x3,(HEIGHT*3)/5  , DIAMETER,DIAMETER);
        x3=x3+3;
    }
    private void drawBall4() {
        ellipse(x4,(HEIGHT*4)/5  , DIAMETER,DIAMETER);
        x4=x4+4;
    }
}
