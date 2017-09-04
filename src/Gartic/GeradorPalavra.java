package Gartic;

import java.io.BufferedReader;
import java.io.FileReader;

public class GeradorPalavra {
	String[] palavras;
	public GeradorPalavra(){
	try{
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Joao Pedro Santana\\workspace\\miniPaint\\src\\miniPaint\\arquivo.txt"));
	String texto = br.readLine();
	palavras = texto.split(",");
	br.close();
	}catch(Exception error){}
	}
public String retornaPalavras(int i){
	return palavras[i];
}
}



