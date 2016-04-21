
package com.mygdx.game.actors;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.mygdx.game.abstracts.Bullet;
import com.mygdx.game.abstracts.GameObject;
import com.mygdx.game.LoadResources;
import com.mygdx.game.SpaceInvaders;



public class Ship extends GameObject {
    
    private float speed=300;
    private byte dir;
    public static boolean canShoot = true,multyShoot = true;
       
    public Ship() {
        super(LoadResources.ship);
        
        setPosition((SpaceInvaders.WIDTH+getWidth())/2,30);
        setSize(30, 31); 
        
    }
    
    @Override
    public void  act (float delta){
        move(delta);
        shoot();
        
    }
    
    private void move(float delta){
    if(Gdx.input.isKeyPressed(Keys.RIGHT)&&getX()<SpaceInvaders.WIDTH-getWidth()-6){
            dir=1;   
        }else if(!Gdx.input.isKeyPressed(Keys.LEFT)){
        dir=0;
        }
        
        if(Gdx.input.isKeyPressed(Keys.LEFT)&&getX()>=6){   
            dir=-1;     
        }else if(!Gdx.input.isKeyPressed(Keys.RIGHT)){
        dir=0;
        }   
        
        if(Gdx.input.isKeyPressed(Keys.LEFT)&&Gdx.input.isKeyPressed(Keys.RIGHT)){
        dir=0;
        }
        
        this.moveBy(dir*speed*delta,0);
    }
    
    private void shoot(){
        
    if (Gdx.input.isKeyPressed(Keys.SPACE)){
        if(canShoot){
            if(multyShoot){
            Bullet bullet = new Bullet(LoadResources.bulletShip, (int) ((int) getX()+getWidth()/2),60,1000);
            Bullet bulletLaserLeft = new Bullet(LoadResources.bulletLaser, (int) ((int) getX()-1),50,1000);
            Bullet bulletLaserRight = new Bullet(LoadResources.bulletLaser, (int) ((int) getX()+29),50,1000);
            }else{
            Bullet bullet = new Bullet(LoadResources.bulletShip, (int) ((int) getX()+getWidth()/2),60,1000);
            }
            
    canShoot=false;}
    }else{
    canShoot=true;
    }
    }

    
    
}
