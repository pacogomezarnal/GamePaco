package com.me.gamePaco;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;


public class GamePacoLoader {
	//Implementamos la clase con la t�cnica singleton
	public static final GamePacoLoader instance = new GamePacoLoader();
	//objetos
	public Sprite mapa;

	private GamePacoLoader () {}
	
	public void init () {
		TextureAtlas spriteSheet = new TextureAtlas("GamePacoPack_v3.txt");
		mapa=spriteSheet.createSprite("Mapa01");
	}

}
