package main;
import java.util.concurrent.*;
import assets.actors.*;
import java.awt.event.*;

/**
 *
 * @author guest-fqynm5
 */
public class Fernkampf {
    String name;
    String beschreibung;
    int dmg;
    double time;

    public Nahkampf(String name, String beschreibung, int dmg, double speed) {
        this.name = name;
        this.beschreibung = beschreibung;
        this.dmg = dmg;

        this.time = time;
    }
    public void angriff(Player player, Nahkampf weapon, Enemy[] enemy){
           for (int i = 0; i< enemy.length; i++){
               if(
                   player.getAngle=Math.atan((enemy[i].getY()-player.getY())/(enemy[i].getX()-player.getX()))
               ){
                   enemy[i].setHealth(enemy[i].getHealth()-dmg);
               }
           }
            
        }
    }
