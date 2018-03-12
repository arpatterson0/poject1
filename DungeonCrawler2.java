/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dungeon;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;
/**
 *
 * @author apatt_000
 */
public class DungeonCrawler2 {
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException{
        Scanner myScanner = new Scanner(System.in);
        
        DungeonCrawler1 hero = new DungeonCrawler1();
        DungeonCrawler1 villian = new DungeonCrawler1();
        
        hero.changeName("Hero");
        hero.changeAttack(50);
        hero.changeHealth(100);
        hero.printStates();
        
        villian.changeName("Villian");
        villian.changeAttack(100);
        villian.changeHealth(100);
        villian.printStates();
        
       System.out.println();
       String name = myScanner.nextLine();
       System.out.println("Get Ready"+ name+"your game begin");
        
        Scanner subtract = new Scanner(System.in);
        System.out.println("press a to attack!");
        
           DatagramSocket skt = new DatagramSocket(8001);              
        byte[] b = "a".getBytes();
        InetAddress lh = InetAddress.getLocalHost();
        DatagramPacket send= new DatagramPacket(b, b.length, lh,8000);
        skt.send(send);
 byte[] buffer = new byte[256];
         DatagramPacket recieve = new DatagramPacket(buffer, buffer.length);

         skt.receive(recieve);
         System.out.println(villian.health- hero.attack);
         System.out.println(recieve.getPort());
         System.out.println(new String(recieve.getData()));
        
        
        
       
    }
}
