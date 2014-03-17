package com.me.gamePaco;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public class GamePacoCamera {
	private Sprite objetivo;
	private Vector2 posicion;

	public GamePacoCamera() {
		posicion=new Vector2();
	}
	
	public void init()
	{
		
	}
	
	public void setSprite(Sprite objetivo)
	{
		this.objetivo=objetivo;
	}

	public void update(){
		posicion.x=objetivo.getOriginX()+objetivo.getX();
		posicion.y=objetivo.getOriginY()+objetivo.getY();
	}
	
	public void moverCamera(OrthographicCamera camera)
	{
		camera.position.x=posicion.x;
		camera.position.y=posicion.y;
		camera.update();
	}
}
