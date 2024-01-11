//P4 Bouncing Circle
//December 13
//Ryan KS
int xPos = 400;
int yPos = 200;

int xVelocity = -3;
int yVelocity = -3;

void setup() {
    size(500, 500);
}

void draw() {
    background(190, 190, 0);

    circle(xPos, yPos, 20);

    xPos += xVelocity;
    yPos += yVelocity;
    
    if (xPos <= 10) {
        // Switch the sign of the velocity to change directions
        xVelocity = -xVelocity;
    }
    if (xPos >= 490) {
        // Switch the sign of the velocity to change directions
        xVelocity = -xVelocity;
    }
    if (yPos <= 10) {
        // Switch the sign of the velocity to change directions
        yVelocity = -yVelocity;
    }
    if (yPos >= 490) {
        // Switch the sign of the velocity to change directions
        yVelocity = -yVelocity;
    }
}
