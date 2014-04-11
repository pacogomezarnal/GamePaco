package com.me.gamePaco;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class GamePacoMapa  extends GamePacoObject{
	private Sprite mapa;
	private int largo;
	private int alto;

	public GamePacoMapa() {
		init();
	}
	
	private void init () {
		mapa=GamePacoLoader.instance.mapa;
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
		float relX = 0;
		float relY = 0;

		// Dibujamos el mapa
		mapa.setPosition(this.posicion.x + relX, this.posicion.y);
		mapa.draw(batch);
	}
}
