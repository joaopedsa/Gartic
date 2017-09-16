package Gartic;

import java.awt.Graphics;

public class Fig implements Desenho {
private int x,y;
public Fig(int x,int y){
	this.x = x;
	this.y = y;
}
public int getX(){
	return x;
}
public int getY(){
	return y;
}
public void reproduzir(Graphics g) {
	g.fillRect(x, y, 2, 2);
}
}
