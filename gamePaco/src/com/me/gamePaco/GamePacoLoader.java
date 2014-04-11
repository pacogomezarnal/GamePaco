package com.me.gamePaco;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;


public class GamePacoLoader {
	//Implementamos la clase con la técnica singleton
	public static final GamePacoLoader instance = new GamePacoLoader();
	//objetos
	public Sprite mapa;
	public Sprite mesa;
	public Sprite player;

	private GamePacoLoader () {}
	
	public void init () {
		TextureAtlas spriteSheet = new TextureAtlas("GamePacoPack_v4.txt");
		mapa=spriteSheet.createSprite("Mapa01");
		mesa=spriteSheet.createSprite("Mesa");
		player=spriteSheet.createSprite("player");
	}

}
