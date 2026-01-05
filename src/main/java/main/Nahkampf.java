/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbrawl;
import java.util.concurrent.*;

/**
 *
 * @author guest-fqynm5
 */
public class Nahkampf {
    String name;
    String beschreibung;
    int dmg;
    int rad;
    int ang;
    double time;

    public Nahkampf(String name, String beschreibung, int dmg, int rad, int ang, double speed) {
        this.name = name;
        this.beschreibung = beschreibung;
        this.dmg = dmg;
        this.rad = rad;
        this.ang = ang;
        this.time = time;
    }
    public void angriff(spieler player, Nahkampf weapon, gegner[] enemy){
           for (int i = 0; i< enemy.length; i++){
               if(
                   Math.sqrt(Math.pow(player.x-enemy[i].x, 2)+Math.pow(player.y-enemy[i].y, 2))<=rad
                   && player.angle-ang<=Math.atan((enemy[i].y-player.y)/(enemy[i].x-player.x))<=player.angle+rad
               ){
                   enemy[i].health = enemy[i].health-dmg;
               }
           }
            
        }
    }

