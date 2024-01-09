//P3 Many Random Colored Particle
//December 11
//Ryan KS
class Particle {
  float x, y;

  Particle(float startX, float startY) {
    x = startX;
    y = startY;
  }

  void update() {
    x += random(-5, 5);
    y += random(-5, 5); //move the particles

  }

  void display() {
    float r = random(0, 255);
    float r2 = random(0, 255);
    float r3 = random(0, 255);
    fill(r, r2, r3);
    ellipse(x, y, 20, 20); //draw particle
  }
}

Particle[] particles = new Particle[15]; //array to store particles

void setup() {
  size(500, 500);

  //init
  for (int i = 0; i < particles.length; i++) {
    particles[i] = new Particle(250, 250);
  }
}

void draw() {
  background(255); //reset backround

  //update and display particles
  for (Particle particle : particles) {
    particle.update();
    particle.display();
  }
}
