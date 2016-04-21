
package com.mygdx.game.actors;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.game.LoadResources;





public class Fly1 extends Actor{
    
protected Texture texture;
protected TextureRegion currentFrameRegion;
protected TextureRegion[] idleFrames;
protected Animation idleAnimation,currentAnimation;

public Rectangle rect;

private int speed=20;

public boolean isAlive = true;

private float time;
private final int x,y;
private final int xSize=30;
private final int ySize=30;
private final int Scale=1;
private int rotation=0;



    

    public Fly1(int x,int y) {
        int FRAME_COLS=2,FRAME_ROWS=1;
        
        this.x=x;
        this.y=y;
        
        init();
        
        idleFrames = new TextureRegion[FRAME_COLS];
        
        TextureRegion[][] temp = TextureRegion.split(texture
                , texture.getWidth() / FRAME_COLS, texture.getHeight()/FRAME_ROWS);
        
        
     for (int j = 0; j < FRAME_COLS; j++) {
        idleFrames[j] = temp[0][j];
     }

        idleAnimation = new Animation(0.5f,idleFrames);
        time =0;
        counter=0;
     }
    
    
    
    @Override
    public void act(float delta) {
        super.act(delta);    
        updateRect();
        idleMovement(delta);
        
    }
    
    @Override
    public void draw(Batch batch, float parentAlpha) {
        render(batch);
    }
    
    
   private void render(final Batch batch){
   time+=Gdx.graphics.getDeltaTime();
   currentFrameRegion = idleAnimation.getKeyFrame(time, true); 
       
   batch.draw(currentFrameRegion, getX(), getY(), getWidth()/2, getHeight()/2, xSize,
               ySize, Scale, Scale, rotation);
   
   }  
   
   private void init(){
       texture = LoadResources.fly1;  
       this.setPosition(x, y);
       this.setSize(xSize, ySize);
       this.setOrigin(getWidth()/2,getHeight()/2);
       
       rect =new Rectangle(this.getX(), this.getY(),
                this.getWidth(),this.getHeight());
   } 
   
   private void updateRect(){
   rect.setPosition(getX(),getY());
   }
   
   //Movements
   
   private boolean stopped=true;;
   private boolean stateAttack=false;
   private float counter;
   private byte dir=1;
   
   private void idleMovement(float delta){
       
        counter=counter+1*delta;
       if(counter>1){
           stopped=false;
           moveBy(speed*dir*delta, 0); 
       }
        
        if(!stateAttack&&!stopped){
        if(getX()>x+30){ 
            counter=0;
            dir=-1;
            stopped=true;
            
        }else if(getX()<x-30){
        counter=0;
        dir=1;
        stopped=true;
        
        }
        }
   }
   
   private void atackMovement(float delta){
       
       
   }
   
}
