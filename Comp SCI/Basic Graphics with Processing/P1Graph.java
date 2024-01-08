void setup() {
        size(500, 500);
        background(255, 255, 255);

        float y;
        for (int i = 1; i <= 500; i+= 5){
        y = (-1*(3*(i*i*i))/87500) + ((58*(i*i))/2625) - ((302*i)/105) + 200;
        rect(i, y, 3, 3);
        }

        }