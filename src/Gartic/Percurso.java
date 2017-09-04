package Gartic;

import java.awt.Point;
import java.util.ArrayList;

public class Percurso extends Thread{
	Reprodutor rep;
	Clique clique;
	public Percurso(Reprodutor rep,Clique clique){
	this.rep = rep;
	this.clique = clique;
	}
	public void run() {
		while (true){
				if(clique.clique)
				try{
					Point ponto  = rep.getMousePosition();
					rep.addFig(new Fig(ponto.x,ponto.y));
				}catch(Exception error){}
				rep.repaint();
		}
	}
}