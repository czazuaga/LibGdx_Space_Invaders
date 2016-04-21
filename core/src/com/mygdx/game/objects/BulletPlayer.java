
package com.mygdx.game.objects;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.abstracts.Bullet;


public class BulletPlayer extends Bullet{
    
    
    public BulletPlayer(Texture texture, int x, int y, int speed) {
        super(texture, x, y, speed);
    }
 
    @Override
    public void act(float delta){
        super.act(delta);
        
    }
        
    }
    
   
    

