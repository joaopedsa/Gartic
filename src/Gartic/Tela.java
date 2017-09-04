package Gartic;
import javax.swing.JFrame;
public class Tela extends JFrame{
	public Tela(){
		setSize(1000, 700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
		setResizable(false);
		setTitle("Gartic");
		new TelaInicial(this);
	}
	public static void main(String[] args){
		new Tela();
	}
}
