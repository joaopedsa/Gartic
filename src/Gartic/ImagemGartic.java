package Gartic;

public class ImagemGartic {
Fig[][] figuras = new Fig[1000][700];
	public void addFigura(Fig figura){		
		figuras[figura.getX()][figura.getY()] = figura;
		}
	public void limpaArray(){
		figuras = new Fig[1000][700];
			}
	}
//}