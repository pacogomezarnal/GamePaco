package com.me.gamePaco;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public abstract class GamePacoObject {
	//Almacenará dimerentes atributos del objeto
	public Vector2 posicion;
	public Vector2 dimension;
	public Vector2 origen;
	public Vector2 escala;
	public float rotacion;
	

	public GamePacoObject() {
		posicion = new Vector2();
		dimension = new Vector2(1, 1);
		origen = new Vector2();
		escala = new Vector2(1, 1);
		rotacion = 0;
	}
	
	public void update (float deltaTime) {
		
	}
	public abstract void render (SpriteBatch batch);

}
