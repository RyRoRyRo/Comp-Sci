//P6 Clock
//December 20
//Ryan KS
float startTime;
void setup() {
  size(500, 500);
  startTime = millis();
  startTime = 0;
  background(200, 200, 200); //grey backround
  fill(255, 255, 255);
  ellipse(250, 250, 450, 450); //draws circle
}
void clear(){
  background(200, 200, 200); //grey backround
  fill(255, 255, 255);
  stroke(0);
  strokeWeight(1);
  ellipse(250, 250, 450, 450); //draws circle
}
void draw(){
  float elapsedTime = millis() - startTime;

  int minutes = int(elapsedTime / 60000);
  int seconds = int((elapsedTime % 60000) / 1000);
  clear();
  drawTicks();
  drawHands(radians(second() * 6), 200, 2, color(255, 0, 0)); // Seconds arm in red
  drawHands(radians((minute() * 6) - HALF_PI), 180, 4, color(0, 0, 255)); // Minutes arm in blue

}

void drawTicks(){
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
void drawHands(float angle, float length, float weight, color col) {
  stroke(col);
  strokeWeight(weight);
  line(250, 250, 250 + cos(angle) * length, 250 + sin(angle) * length);
}
