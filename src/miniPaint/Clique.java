package miniPaint;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Clique implements MouseListener{
	boolean clique = false;
	@Override
	public void mouseClicked(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		clique = true;
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		clique = false;
	}
}
