package com.me.gamePaco;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class GamePaco implements ApplicationListener {
	private GamePacoController gameController;
	private GamePacoRenderer gameRenderer;
	
	@Override
	public void create() {	
		gameController=new GamePacoController();
		gameRenderer = new GamePacoRenderer(gameController);
	}

	@Override
	public void dispose() {

	}

	@Override
	public void render() {		
		gameController.update(Gdx.graphics.getDeltaTime());
		Gdx.gl.glClearColor(1f, 1f, 1f, 1f);
		// Clears the screen
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		// Render game world to screen
		gameRenderer.render();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
