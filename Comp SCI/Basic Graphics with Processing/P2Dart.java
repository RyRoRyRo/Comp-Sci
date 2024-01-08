//P2Dart
//December 10
//Ryan KS
void setup() {
        size(500, 500);
        background(255, 255, 255);
        float r;
        float r2;
        float r3;
        // loop to draw the rings
        for (int i = 400; i >= 20; i -= 40){
        r = random(0, 255);
        r2 = random(0, 255);
        r3 = random(0, 255); // random colours

        fill(r, r2, r3);
        ellipse(250, 250, i, i);     // draws a circle
        }

}