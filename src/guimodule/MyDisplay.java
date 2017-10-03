package guimodule;

import processing.core.PApplet;

public class MyDisplay extends PApplet{

    @Override
    public void setup() {
        size(400,400);
        background(200, 200, 200);
    }

    @Override
    public void draw() {
        fill(255,255,0);
        ellipse(this.width / 2, this.height / 2, this.width - 10, this.height - 10);
        fill(0, 0, 0);
        ellipse(this.width / 3, this.width / 3, 70, 90);
        ellipse(this.width / 3 + this.width / 3, this.width / 3, 70, 90);

        arc(this.width / 2, this.height*2 / 3, 80, 80, 0, PI);
    }
}
