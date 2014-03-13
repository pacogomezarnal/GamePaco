package com.me.gamePaco;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class GamePacoController {
	private Pixmap plataforma;
	public Texture texture;
	public Sprite cube;
	
	public GamePacoController() {
		init();
	}
	
	public void init(){
		this.initPlatforms();
	}
	
	public void update(float deltaTime){
		hdlControls(deltaTime);
		
	}
	
	//crea y coloca el cubo
	private void initPlatforms(){
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
		texture =new Texture(plataforma);
		cube=new Sprite(texture);
		cube.setPosition(0, 0);
		plataforma.dispose();
		//sprite = new Sprite (textura);
	}
	
	//Controla la interacción con las teclas
	private void hdlControls(float deltaTime){
		//variable que controla la velocidad del movimiento
		float cubeSpeed=deltaTime*10;
		if(Gdx.input.isKeyPressed(Keys.A)){
			this.cube.translate(-cubeSpeed,0);
		}
		if(Gdx.input.isKeyPressed(Keys.D)){
			this.cube.translate(cubeSpeed,0);
		}
		if(Gdx.input.isKeyPressed(Keys.W)){
			this.cube.translate(0,cubeSpeed);
		}
		if(Gdx.input.isKeyPressed(Keys.S)){
			this.cube.translate(0,-cubeSpeed);
		}
	}
	
}
