
package com.mygdx.game.abstracts;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.mygdx.game.SpaceInvaders;
import com.mygdx.game.levels.Level1;



public abstract class Bullet extends Image {
    
    int speed =0;
    //Colisiones
    public Rectangle rectangle;
    
    
    public  Bullet (Texture texture,int x,int y,int speed){
    super(texture);
    this.speed=speed;
        setPosition(x, y);
    
    //Origen
        setOrigin(getWidth()/2,getHeight()/2);
        
        rectangle =new Rectangle(this.getX(), this.getY(),
                this.getWidth(),this.getHeight());
        Level1.stage.addActor(this);
        
    }
    
    
    @Override
    public void act (float delta) {
        super.act(delta);
        rectangle.setPosition(this.getX(),this.getY());
        moveBy(0, speed*delta);  
        if(getY()>SpaceInvaders.HEIGHT+100||getY()<-100){
        destroy();
        
        }
        
    }
    
    
    
    public void destroy(){
    this.remove();
    }
    
}
