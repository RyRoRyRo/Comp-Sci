//P5 Progress Bar
//December 14
//Ryan KS
int startTime;
int duration = 10000; //10 seconds

void setup() {
  size(400, 200);
  startTime = millis(); //record start time
}

void draw() {
  background(0);

  //calculate elapsed time
  int elapsedTime = millis() - startTime;

  //update progress based on elapsed time
  float progress = map(constrain(elapsedTime, 0, duration), 0, duration, 0, 1);

  //draw the bar
  fill(200);
  rect(20, 80, 360, 40);

  //draw the progress part of the bar
  fill(0, 255, 0);
  rect(20, 80, 360 * progress, 40);

  //check if the progress is complete
  if (elapsedTime >= duration) {
    //print text
      fill(0, 255, 0);
      textSize(24);
      textAlign(CENTER, CENTER);
      text("Done!", 200, 170);
  }
}

