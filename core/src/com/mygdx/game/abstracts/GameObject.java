
package com.mygdx.game.abstracts;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.ui.Image;


public class GameObject extends Image{
    
    //Colisiones
    public Rectangle rectangle;
    public boolean isAlive=true;
    private Texture texture;
    
    public  GameObject (Texture textura){
    super(textura);
    
    this.texture=textura;
    
    //Origen
        setOrigin(getWidth()/2,getHeight()/2);
        
        rectangle =new Rectangle(this.getX(), this.getY(),
                this.getWidth(),this.getHeight());
    
    }
    

    @Override
    public void act (float delta) {
        super.act(delta);
    rectangle.setPosition(this.getX(),this.getY());
    }
   
    
}
