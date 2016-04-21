
package com.mygdx.game.levels;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.mygdx.game.SpaceInvaders;
import static com.mygdx.game.SpaceInvaders.HEIGHT;
import static com.mygdx.game.SpaceInvaders.WIDTH;
import com.mygdx.game.abstracts.BaseScreen;
import com.mygdx.game.actors.Ship;


public class Level1 extends BaseScreen{

    public static Stage stage;
    //public static SpriteBatch batch;
        
    //public static Fly1 fly1;
    public static Ship shipPlayer;
    
    public Level1(SpaceInvaders spaceInvaders) {
        super(spaceInvaders);
    }
    
    
    
    public void createActors(){
    shipPlayer = new Ship();
    //fly1 = new Fly1(100,100);
      
    }
    
    public void addActors(){
    stage.addActor(shipPlayer);
    //stage.addActor(fly1);
    }
    
    public void startGame() {          
createActors();
    addActors();
    
        }

    @Override
    public void show() {
        //batch = new SpriteBatch();
        stage = new Stage();
        
        startGame();    
        
        
    }

    
    @Override
    public void render(float delta) {
        
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); 
           stage.act();
             //batch.begin();                
             //fly1.render(batch);     
             //batch.end();
             stage.draw();
    }

    @Override
    public void resize(int i, int i1) {
        stage.setViewport(new ExtendViewport(WIDTH,HEIGHT,stage.getCamera()));
           
    }

    @Override
    public void pause() {
        
    }

    @Override
    public void resume() {
        
    }

    @Override
    public void hide() {
        stage.dispose();
    }

    @Override
    public void dispose() {
        stage.dispose();
    }
    
    
    
}
