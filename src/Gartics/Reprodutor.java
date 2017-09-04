package Gartic;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

class Reprodutor extends JPanel {
  
  private ArrayList<Reproduzivel> figs = new ArrayList<>();

  //adicionar uma figura para reproducao
  void addFig(Reproduzivel fig) {
    this.figs.add(fig);
  }
  void removeFig(){
	  this.figs.clear();
  }
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
      for(int i = 0; i <figs.size(); i++) {
    	  figs.get(i).reproduzir(g);
      }

  }//()
    

}//

