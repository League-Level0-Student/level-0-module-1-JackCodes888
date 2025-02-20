boolean bitten = false;
void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(#FA0D20);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#16FF03);
    rect(176, 103, 12, 32);
    if(bitten){
      fill(200,200,200);
      ellipse(75,200,50,50);
    }
    if(mousePressed){
      bitten = true;
  
    }
}
