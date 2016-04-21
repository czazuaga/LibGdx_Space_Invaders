
package com.mygdx.game.abstracts;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.SpaceInvaders;



public abstract class BaseScreen implements Screen{
    
    protected SpaceInvaders game;
    protected SpriteBatch batch;
    
    
    public  BaseScreen (SpaceInvaders spaceInvaders){
    this.game=spaceInvaders;
    }

    @Override
    public void show() {
       
    }

    @Override
    public void render(float f) {
        
    }

    @Override
    public void resize(int i, int i1) {
        
    }

    @Override
    public void pause() {
       
    }

    @Override
    public void resume() {
        
    }

    @Override
    public void hide() {
        
    }

    @Override
    public void dispose() {
        
    }
    
}
