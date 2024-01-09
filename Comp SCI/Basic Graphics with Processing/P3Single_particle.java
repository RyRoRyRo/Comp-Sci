//P3 Particle
//December 11
//Ryan KS
float x, y = 20;

void setup() {
  size(500, 500);
  x = 250; 
  y = 250; 
}

void draw() {
  background(255); //reset backround

    x += random(-5, 5);
    y += random(-5, 5);

  //draw the particle
  fill(0, 150, 255); 
  ellipse(x, y, 20, 20);
}
