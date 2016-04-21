
package com.mygdx.game.actors;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.game.LoadResources;





public class Fly1 extends Actor{
    
protected Texture texture;
protected TextureRegion currentFrameRegion;
protected TextureRegion[] idleFrames;
protected Animation idleAnimation,currentAnimation;
private float time;
public int x,y;



    public Fly1(int x,int y) {
        final int FRAME_COLS=2,FRAME_ROWS=1;
        
        this.x=x;
        this.y=y;
            
        texture = LoadResources.fly1;
        idleFrames = new TextureRegion[FRAME_COLS];
        
        TextureRegion[][] temp = TextureRegion.split(texture
                , texture.getWidth() / FRAME_COLS, texture.getHeight()/FRAME_ROWS);
        
        
     for (int j = 0; j < FRAME_COLS; j++) {
        idleFrames[j] = temp[0][j];
     }

         idleAnimation = new Animation(0.5f,idleFrames);
        time =0;
     }
    
    
    @Override
    public void act(float delta) {
        super.act(delta); 
        currentFrameRegion = idleAnimation.getKeyFrame(delta, true);           
    }
    
   public void render(final SpriteBatch batch){
   time+=Gdx.graphics.getDeltaTime();
   currentFrameRegion = idleAnimation.getKeyFrame(time, true); 
   batch.draw(currentFrameRegion, x, y, getWidth()/2, getHeight()/2, 30, 30, 1, 1, 0);
   
   }
    
   
    
}
