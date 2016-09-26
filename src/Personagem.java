import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Personagem extends Sprite {
	
	BufferedImage img;
	
	int frametimer = 0;
	int frame = 0;
	int intervalo = 250;
	int anim = 0;
	
	int charx = 0;
	int chary = 0;
	int charw = 72;
    int charh = 128;

	public Personagem(BufferedImage img,int x,int y, int character) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.img = img;
		
		charx = character%4;
		chary = character/4;
	}
	
	@Override
	public void simulaSe(long DiffTime) {
		// TODO Auto-generated method stub
		frametimer+=DiffTime;
		frame = (frametimer/intervalo)%3;
	}

	@Override
	public void desenhaSe(Graphics2D dbg,int telax,int telay){
		// TODO Auto-generated method stub
		dbg.drawImage(img, (int)x-telax,(int)y-telay,(int)x+24-telax,(int)y+32-telay,charx*charw+frame*24,chary*charh+anim*32,charx*charw+frame*24+24,chary*charh+anim*32+32,null);
	}

}
