package com.me.gamePaco;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class GamePacoMesa extends GamePacoObject{
	private Sprite reg;
	private int largo;
	
	public GamePacoMesa() {
		init();
	}
	
	private void init () {
		dimension.set(100, 1.5f);
		TextureAtlas spriteSheet = new TextureAtlas("GamePacoPack.txt");
		reg = spriteSheet.createSprite("table");;
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
		relY -= this.dimension.y / 4;
		reg.setPosition(this.posicion.x, this.posicion.y + relY);
		reg.draw(batch);
		// Dibujamos el resto
		relY = 0;
		for (int i = 0; i < largo; i++) {
			reg.setPosition(this.posicion.x, this.posicion.y + relY);
			reg.draw(batch);
			relY += this.dimension.y;
		}
	}
}
