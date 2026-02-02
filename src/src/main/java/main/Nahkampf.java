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
           for (int i = 0; i< enemy.length; i++){ //Test für jeden Gegner innerhalb ddes Bildschirms
               if(
                   Math.sqrt(Math.pow(player.getX()-enemy[i].getX(), 2)+Math.pow(player.getY()-enemy[i].getY(), 2))<=rad //Abstand zum Gegner kleiner gleich Länge der Waffe
                   && player.getAngle-ang<=Math.atan((enemy[i].getY()-player.getY())/(enemy[i].getX()-player.getX()))<=player.getAngle+rad //Zuerst Blickrichtung Spieler bestimmen, dann den Winkel der Waffe in 
                   //beide Richtungen addiere, dann Testen für den Winkel des Gegners
               ){
                   enemy[i].setHealth(enemy[i].getHealth()-dmg);
               }
           }
            
        }
    }


