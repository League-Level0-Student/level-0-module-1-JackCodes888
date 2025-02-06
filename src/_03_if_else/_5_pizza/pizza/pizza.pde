PImage pepperoni;
PImage mushroom;
PImage olive;

void setup() {
  size(1000, 1000); 
  pepperoni = loadImage("pepperoni.png");
  mushroom = loadImage("mushroom.png");
  olive = loadImage("olive.png");
}
void draw() {

  fill(#FCCA4A);
  ellipse(500, 500, 400, 400);
  fill(#FF0900);
  ellipse(500, 500, 300, 300);
  fill(#FEFF00);
  ellipse(500, 500, 250, 250);
  
  image(pepperoni,500,500);
  image(pepperoni,500,400);
  image(pepperoni,400,500);
  image(pepperoni,400,400);
  image(mushroom,500,450);
  image(mushroom,500,400);
  image(mushroom,400,500);
  image(mushroom,400,400);
  image(olive,500,450);
  image(olive,500,400);
  image(olive,400,450);
  image(olive,400,400);
  
}
