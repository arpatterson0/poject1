/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dungeon;

/**
 *
 * @author apatt_000
 */
public class DungeonCrawler1 {
    
    String name = "HERO";
    int health = 100;
    int strength = 100;
    int attack = 100;
    void changeName (String n){
        name = n;
    }
    void changeHealth(int h){
        health = h;
    }
    void changeAttack (int a){
        attack = a;
    }
    void printStates(){
        System.out.println("Name"+name);
        System.out.println("health:"+health+"\t Strength:"+strength+"\t Attack"+attack); ;
    }
}

