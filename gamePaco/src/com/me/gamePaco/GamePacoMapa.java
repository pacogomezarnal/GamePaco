package com.me.gamePaco;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class GamePacoMapa  extends GamePacoObject{
	private Sprite regIzq,regMedia,regDer;
	private int largo;

	public GamePacoMapa() {
		init();
	}
	
	private void init () {
		dimension.set(100, 500);
		TextureAtlas spriteSheet = new TextureAtlas("GamePacoPack.txt");
		regIzq = spriteSheet.createSprite("Left_wall");
		regDer = spriteSheet.createSprite("Rig_wall");
		regMedia = spriteSheet.createSprite("Mid_wall");
		// Start length of this rock
		setLargo(1);
	}
	
	public void setLargo (int l) {
		this.largo = l;
	}
	public void incrementaLargo (int cant) {
		setLargo(this.largo+ cant);
	}
	
	@Override
	public void render (SpriteBatch batch) {
		float relX = 0;
		float relY = 0;
		
		// Dibujamos el lado izquierdo
		regIzq.setPosition(this.posicion.x + relX, this.posicion.y);
		regIzq.draw(batch);
		// Dibujamos el centro
		relX += this.dimension.x;
		for (int i = 0; i < largo; i++) {
			regMedia.setPosition(this.posicion.x + relX, this.posicion.y);
			regMedia.draw(batch);
			relX += this.dimension.x;
		}
		// Dibujamos la derecha
		regDer.setPosition(this.posicion.x + relX, this.posicion.y);
		regDer.draw(batch);
	}
}
