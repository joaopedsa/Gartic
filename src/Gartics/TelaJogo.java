package Gartic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;

public class TelaJogo extends JInternalFrame implements ActionListener {
	private JTextField campoTentativa;
	private JButton btnConectar;
	private JButton btnLimpa;
	private JButton btnDesconectar;
	private Reprodutor rep;
	private GeradorPalavra palavras;
	public TelaJogo(JFrame frame) {
		
		setBounds(100, 100, 450, 300);
		frame.setLayout(new BorderLayout(0, 0));
		palavras = new GeradorPalavra();
		
		//Panel De Edição
		rep = new Reprodutor();
		frame.add(rep, BorderLayout.CENTER);
		Clique clique = new Clique();
		rep.addMouseListener(clique);
		new Percurso(rep,clique).start();
		
		JToolBar toolBar = new JToolBar();
		frame.add(toolBar, BorderLayout.NORTH);
		
		btnConectar = new JButton("Conectar");
		toolBar.add(btnConectar);
		btnConectar.addActionListener(this);
		
		btnLimpa = new JButton("Limpa");
		toolBar.add(btnLimpa);
		btnLimpa.addActionListener(this);
		
		btnDesconectar = new JButton("Desconectar");
		toolBar.add(btnDesconectar);
		btnDesconectar.addActionListener(this);
		
		
		JTextPane txtpnTempo = new JTextPane();
		txtpnTempo.setEditable(false);
		txtpnTempo.setText("	Tempo : ");
		toolBar.add(txtpnTempo);
		
		JTextPane tempo = new JTextPane();
		tempo.setEditable(false);
		toolBar.add(tempo);
		
		JToolBar toolBar_1 = new JToolBar();
		frame.add(toolBar_1, BorderLayout.SOUTH);
		
		campoTentativa = new JTextField();
		toolBar_1.add(campoTentativa);
		campoTentativa.setColumns(10);
		
		Random random = new Random();
		int i = random.nextInt(4);
		String palavraSorteada = palavras.retornaPalavras(i);
		
		JTextPane palavra = new JTextPane();
		palavra.setEditable(false);
		toolBar_1.add(palavra);
		palavra.setText(palavraSorteada);
		
		frame.revalidate();
		frame.repaint();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton botao = (JButton) e.getSource();
			if(botao == btnLimpa)
				rep.removeFig();
	}

}
