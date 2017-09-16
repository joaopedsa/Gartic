package Gartic;
import java.awt.Point;

import javax.swing.JPanel;

public class Percurso implements Runnable{
JPanel editor;
ImagemGartic imagem;
Clique clicou;
	public Percurso(JPanel editor,ImagemGartic imagem,Clique clicou){
	this.editor = editor;
	this.imagem = imagem;
	this.clicou = clicou;
	}
	@Override
	public void run() {
		while(true){
			try{
				if(clicou.clique){
					Point ponto = editor.getMousePosition();
					imagem.addFigura(new Fig(ponto.x,ponto.y));
				}
			}
			catch(Exception error){}
			editor.repaint();
		}
	}
}
