package com.me.gamePaco;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GamePacoPlayer extends GamePacoObject{
	private Sprite player;
	private int largo;
	private int alto;
	
	public GamePacoPlayer() {
		init();
	}
	
	private void init () {
		player=GamePacoLoader.instance.player;
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
		float relX = 50;
		float relY = 200;

		// Dibujamos el mapa
		player.setPosition(this.posicion.x + relX, this.posicion.y);
		player.draw(batch);
	}
}
