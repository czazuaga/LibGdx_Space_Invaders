
package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;


public class LoadResources {
    
    public static Texture bulletLaser,bulletShip,bulletFire,bulletGreen;
    public  static Texture ship,fly1,bee1,bee2,boss,fly2_1,fly2_2;
            
    public LoadResources(){
    init();
    }
    
    public void init(){
    bulletGreen = new Texture("sprites/bulletgreen.png");
    bulletFire = new Texture("sprites/bulletfire.png");
    bulletLaser = new Texture("sprites/bulletlaser.png");
    bulletShip = new Texture("sprites/bullet.png");
    
    ship = new Texture("sprites/ship.png");
    fly1 = new Texture("sheets/fly1.png");
    
    }
    
}
