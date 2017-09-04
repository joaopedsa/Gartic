package miniPaint;

public class Jogador {
boolean desenha;
int pontuacao = 0;
public Jogador(boolean desenha){
	this.desenha = desenha;
}
public int pontuacaoJogador(){
	return pontuacao;
}
public void incrementoPonto(int ponto){
	pontuacao = pontuacao + ponto;
}
}
