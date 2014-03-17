package com.me.gamePaco;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Disposable;

public class GamePacoRenderer implements Disposable{
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private GamePacoController gC;


	public GamePacoRenderer(GamePacoController gC)  {
		init();
		this.gC=gC;
	}
	private void init () { 
		//Camara de vision
		camera = new OrthographicCamera(480,320);
		camera.position.set(0,0,0);
		camera.update();
		
		//Escenario
		batch=new SpriteBatch();
		
	}
	public void render () { 
		batch.setProjectionMatrix(camera.combined);
		gC.gcCamera.moverCamera(camera);
		
		batch.begin();
			gC.cube.draw(batch);
			gC.platStatic1.draw(batch);
			gC.platStatic2.draw(batch);
		batch.end();

	}
	public void resize (int width, int height) { }
	@Override 
	public void dispose () { }
}
