package com.me.gamePaco;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Pixmap.Format;

public class GamePacoController {
	private Pixmap plataforma;
	public Texture textura;
	
	public GamePacoController() {
		init();
	}
	
	public void init(){
		this.initPlataformas();
	}
	
	public void update(float deltaTime){
		
	}
	
	private void initPlataformas(){
		//crear nuestra plataforma
		plataforma=new Pixmap(32,32,Format.RGBA8888);
		plataforma.setColor(1, 0, 0, 0.5f);
		plataforma.fill();
		plataforma.setColor(1, 1, 0, 1);
		plataforma.drawLine(0, 0, 32, 32);
		plataforma.drawLine(32, 0, 0, 32);
		plataforma.setColor(0, 1, 1, 1);
		plataforma.drawRectangle(0, 0, 32, 32);
		
		//Cargar textura
		textura =new Texture(plataforma);
		plataforma.dispose();
		//sprite = new Sprite (textura);
	}
	
}
