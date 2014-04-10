package com.me.gamePaco;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.Array;

public class GamePacoController extends InputAdapter {
	private Pixmap plataforma;
	public Texture texture,texture2,texture3;
	public Sprite cube,platStatic1,platStatic2;
	public GamePacoCamera gcCamera;
	public TextureAtlas spriteSheet;
	public Array<Sprite> objetos;
	
	public GamePacoMapa gcMapa;
	
	public GamePacoController() {
		init();
	}
	
	public void init(){
		this.initPlatforms();
		gcCamera = new GamePacoCamera();
		gcCamera.setSprite(cube);
		Gdx.input.setInputProcessor(this);		
	}
	
	public void update(float deltaTime){
		hdlControls(deltaTime);
		gcCamera.update();
	}
	
	//crea y coloca el cubo
	private void initPlatforms(){
		//cargar texturas
		GamePacoLoader.instance.init();
		
		//inicializamos paquete
		spriteSheet = new TextureAtlas("GameZPack.txt");
		objetos = spriteSheet.createSprites();
		
		//crear nuestra plataforma
		plataforma=new Pixmap(32,32,Format.RGBA8888);
		plataforma.setColor(1, 0, 0, 0.5f);
		plataforma.fill();
		plataforma.setColor(1, 1, 0, 1);
		plataforma.drawLine(0, 0, 32, 32);
		plataforma.drawLine(32, 0, 0, 32);
		plataforma.setColor(0, 1, 1, 1);
		plataforma.drawRectangle(0, 0, 32, 32);
		
		//Cargar textura
		texture =new Texture(plataforma);
		//cube=new Sprite(texture);
		cube=objetos.get(1);
		cube.setPosition(0, 0);
		plataforma.dispose();
		
		createPixmapsDebug();
		//sprite = new Sprite (textura);
		
		//Cargar Mapa
		gcMapa=new GamePacoMapa();
		gcMapa.setLargo(4);
	}
	
	//Controla la interacción con las teclas
	private void hdlControls(float deltaTime){
		//variable que controla la velocidad del movimiento
		float cubeSpeed=deltaTime*100;
		if(Gdx.input.isKeyPressed(Keys.A)){
			this.cube.translate(-cubeSpeed,0);
		}
		if(Gdx.input.isKeyPressed(Keys.D)){
			this.cube.translate(cubeSpeed,0);
		}
		if(Gdx.input.isKeyPressed(Keys.W)){
			this.cube.translate(0,cubeSpeed);
		}
		if(Gdx.input.isKeyPressed(Keys.S)){
			this.cube.translate(0,-cubeSpeed);
		}
	}
	
	private void createPixmapsDebug()
	{
		//crear nuestra plataforma
		plataforma=new Pixmap(32,32,Format.RGBA8888);
		plataforma.setColor(0.8f, 0.8f, 0.8f, 1f);
		plataforma.fill();
		plataforma.setColor(1, 1, 0, 1);
		plataforma.drawRectangle(0, 0, 32, 32);
		
		//Cargar textura
		texture2 =new Texture(plataforma);
		platStatic1=new Sprite(texture2);
		platStatic1.setPosition(-100, 0);
		plataforma.dispose();
		
		//crear nuestra plataforma
		plataforma=new Pixmap(32,32,Format.RGBA8888);
		plataforma.setColor(0.8f, 0.8f, 0.8f, 1f);
		plataforma.fill();
		plataforma.setColor(1, 1, 0, 1);
		plataforma.drawRectangle(0, 0, 32, 32);
		
		//Cargar textura
		texture3 =new Texture(plataforma);
		platStatic2=new Sprite(texture3);
		platStatic2.setPosition(100, 50);
		plataforma.dispose();
	}
	
	@Override
	public boolean keyUp (int keycode) {

		//Reiniciamos el juego
		if(keycode==Keys.ESCAPE)
		{
			this.init();
		}
		
		return true;

	}
	
}
