package com.me.gamePaco;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class GamePacoMesa extends GamePacoObject{
	private Sprite mesa;
	private int largo;
	private int alto;
	
	public GamePacoMesa() {
		init();
	}
	
	private void init () {
		mesa=GamePacoLoader.instance.mesa;
		setLargo(1);
		setAlto(1);
	}
	
	public void setLargo (int l) {
		this.largo = l;
	}
	public void incrementaLargo (int cant) {
		setLargo(this.largo+ cant);
	}
	public void setAlto (int a) {
		this.alto = a;
	}
	public void incrementaAlto (int cant) {
		setLargo(this.alto+ cant);
	}
	
	@Override
	public void render (SpriteBatch batch) {
		float relX = 100;
		float relY = 100;

		// Dibujamos el mapa
		mesa.setPosition(this.posicion.x + relX, this.posicion.y);
		mesa.draw(batch);
	}
}
