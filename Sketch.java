import processing.core.PApplet;

public class Sketch extends PApplet {
	
  
	int width = 400;
  int height = 400;
  
  public void settings() {
	// put your size call here
    size(width, height);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(43, 188, 217);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Size setting
    float floatCircleX = random(0, width);
    float floatCircleY = random(0, height);
    float floatCircleSize = random(25, 150);

    // Colour setting depending on quadrant of face
    if (floatCircleX > width/2 && floatCircleY > height/2) {
      fill(255, 0, 0);
    }
    else if (floatCircleX < width/2 && floatCircleY > height/2) {
      fill(255, 255, 0);
    }
    else if (floatCircleX < width/2 && floatCircleY < height/2) {
      fill(0, 255, 0);
    }
    else {
      fill(0, 255, 255);
    }

    // Head
    ellipse(floatCircleX, floatCircleY, floatCircleSize, floatCircleSize);

    // Eye whites
    fill(255);
    ellipse((floatCircleX - floatCircleSize/5), (floatCircleY - floatCircleSize/6), (floatCircleSize/5), (floatCircleSize/5));
    ellipse((floatCircleX + floatCircleSize/5), (floatCircleY - floatCircleSize/6), (floatCircleSize/5), (floatCircleSize/5));

    // Pupils
    fill(0);
    ellipse((floatCircleX - floatCircleSize/5), (floatCircleY - floatCircleSize/6), floatCircleSize/6, floatCircleSize/6);
    ellipse((floatCircleX + floatCircleSize/5), (floatCircleY - floatCircleSize/6), floatCircleSize/6, floatCircleSize/6);

    // Mouth
    fill(255, 191, 203);
    arc(floatCircleX, (floatCircleY + floatCircleSize/8), floatCircleSize/2, floatCircleSize/4, (float)0, (float)3.14);
    line((floatCircleX - floatCircleSize/4), (floatCircleY + floatCircleSize/8), (floatCircleX + floatCircleSize/4), (floatCircleY + floatCircleSize/8));

  }
  
  // define other methods down here.
}