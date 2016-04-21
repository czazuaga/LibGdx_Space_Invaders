package com.mygdx.game;


import com.badlogic.gdx.Game;
import com.mygdx.game.levels.Level1;


public class SpaceInvaders extends Game {
	
        public static final int WIDTH = 720/2,HEIGHT = 1280/2;
        
        private LoadResources loadResources; 
        final Level1 level1= new Level1(this);;
	
	@Override
	public void create () { 
        loadResources = new LoadResources();
        setScreen(level1);
	}
        
    
}
