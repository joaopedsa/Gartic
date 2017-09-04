package miniPaint;

import java.awt.Graphics;
public class Fig implements Reproduzivel{
private int x1,y1;
public Fig(int x1,int y1){
this.x1 = x1;
this.y1 = y1;
}
	public void reproduzir(Graphics g){
		g.fillRect(x1, y1, 2, 2);
	}
}