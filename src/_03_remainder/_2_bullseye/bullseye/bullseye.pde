
void setup() {
  size(500,500);
  // set the size of your sketch
  
}

void draw() {
  int startingX = 500;
  int startingY = 500;
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for (int i = 0; i < 8; i++) {
    if (i % 2 == 0){
      fill(255, 0, 0);
      ellipse(250, 250, startingX, startingY);
    }
    else{
      fill(0, 0, 0);
      ellipse(250, 250, startingX, startingY);
    }
    startingX -= 60;
    startingY -= 60;
  }
  //Use an if statement and remainder to alternate the color of your rings.
  
  
}
