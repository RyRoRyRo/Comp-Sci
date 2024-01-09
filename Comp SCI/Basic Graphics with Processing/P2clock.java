//P2 Clock
//December 10
//Ryan KS
void setup() {
  size(500, 500);
  background(200, 200, 200); //grey backround
  fill(255, 255, 255);
  ellipse(250, 250, 450, 450); //draws circle


  for (int i = 0; i < 60; i++) { //loop for each tick
    float angle = map(i, 0, 60, 0, TWO_PI);  //map i to an angle between 0 and 2*PI
    float x1 = 250 + cos(angle) * 225;  //calculate start cords
    float y1 = 250 + sin(angle) * 225;  
    float x2 = 250 + cos(angle) * (225 - 15);  //calculate end cords
    float y2 = 250 + sin(angle) * (225 - 15);  

    if (i % 5 == 0) {
      stroke(0);
      strokeWeight(5); //makes major points thicker and black
    } else {
      stroke(0, 255, 0);
      strokeWeight(2); //makes other points green
    }

    line(x1, y1, x2, y2);  //actually draw points
  }
}
