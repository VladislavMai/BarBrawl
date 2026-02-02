/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.util.concurrent.*;
import assets.actors.*;
import java.awt.event.*;

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
    public void angriff(Player player, Nahkampf weapon, Enemy[] enemy){
           for (int i = 0; i< enemy.length; i++){
               if(
                   Math.sqrt(Math.pow(player.getX()-enemy[i].getX(), 2)+Math.pow(player.getY()-enemy[i].getY(), 2))<=rad
                   && player.getAngle-ang<=Math.atan((enemy[i].getY()-player.getY())/(enemy[i].getX()-player.getX()))<=player.getAngle+rad
               ){
                   enemy[i].setHealth(enemy[i].getHealth()-dmg);
               }
           }
            
        }
    }


