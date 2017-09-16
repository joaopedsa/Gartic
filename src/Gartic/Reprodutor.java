package Gartic;


import java.awt.*;

import javax.swing.*;

class Reprodutor extends JPanel {
	ImagemGartic imagem = new ImagemGartic();
	public Reprodutor(ImagemGartic imagem){
		this.imagem = imagem;
	}
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
      for(int i = 0; i <imagem.figuras.length; i++) {
    	  for(int j = 0 ; j < imagem.figuras[0].length;j++)
    		  if(imagem.figuras[i][j]!=null)
    			  imagem.figuras[i][j].reproduzir(g);
      }
  }
}


