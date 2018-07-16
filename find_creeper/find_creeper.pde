int creeperx=30;
int creepery=40;
PImage creeper;    
void setup(){
  size(1000,563);
PImage minecraft = loadImage("creeperbackground.png");     
minecraft.resize(width, height);         
background(minecraft);
creeper=loadImage("Creeper.png");  
creeper.resize(20,40);
}
void draw(){
image(creeper, creeperx, creepery);
if (isNear(mouseX,0)&&isNear(mouseY,0)){
  fill(0,119,0); 
}
else if(isNear(mouseX,creeperx)&&isNear(mouseY,creepery)){
  fill(0,119,0);
  text("Creeper is found",500,281);
}
else {
  fill(187,0,0);
}
 ellipse(mouseX,mouseY,20,30);
}
boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}