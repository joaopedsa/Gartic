package miniPaint;


import javax.swing.JInternalFrame;
import javax.swing.JButton;


import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class TelaInicial extends JInternalFrame implements ActionListener {
	private JFrame frame;
	private JButton inicia;
	private JLabel foto;
	public TelaInicial(JFrame frame) {
		this.frame = frame;
		setBounds(0,0,1000, 700);
		frame.setLayout(null);
		
		inicia = new JButton("Iniciar Jogo");
		inicia.setIcon(new ImageIcon("src\\miniPaint\\iniciar.png"));
		inicia.setBounds(482, 453, 164, 55);
		inicia.addActionListener(this);
		frame.add(inicia);
		
		
		ImageIcon image = new ImageIcon(this.getClass().getResource("gartic.png"));
		foto = new JLabel();
		foto.setIcon(new ImageIcon("src\\miniPaint\\gartic.png"));
		foto.setBounds(-51, 0, 1035, 700);
		frame.add(foto);

		frame.repaint();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton botao =(JButton) e.getSource();
		if(botao == inicia){
			frame.remove(inicia);
			frame.remove(foto);
			frame.repaint();
			new TelaJogo(frame);
		}
		}
}
