PImage donkey;
PImage tail;
void setup(){
  size(550,406);
  donkey = loadImage("143568-004-DF87F418.jpg");   
tail = loadImage("Donkey-tail.png");  
tail.resize(360,360);
}
void draw(){
background (donkey);
image(tail, mouseX-10, mouseY-20);
rect(0,0,30,30,30);
rect(454,75,40,40);
}

  