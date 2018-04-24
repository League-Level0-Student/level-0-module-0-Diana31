void setup(){
size(338,338);
PImage face = loadImage ("face.jpeg");
image (face, 0,0);
}
void draw(){
fill(255,255,255);
ellipse(129,150,55,50);
ellipse(215,150,55,50);
fill(mouseX,mouseY,19);
ellipse(129,150,20,20);
ellipse(215,150,20,20);



  
}
