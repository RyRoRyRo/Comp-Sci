//P5 Stopwatch
//December 14
//Ryan KS
float startTime; 

void setup() {
  size(200, 100); //init
  startTime = millis(); 
}

void draw() {
  background(255);

  //calculate elapsed time in milliseconds
  float elapsedTime = millis() - startTime;

  //convert to minutes and seconds
  int minutes = int(elapsedTime / 60000);
  int seconds = int((elapsedTime % 60000) / 1000);

  //format as MM:SS
  String timeString = nf(minutes, 2) + " : " + nf(seconds, 2);

  //display text
  textAlign(CENTER, CENTER);
  textSize(32);
  fill(0);
  text(timeString, 100, 50);
}

