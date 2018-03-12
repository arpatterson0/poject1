
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import Dungeon.DungeonCrawler2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apatt_000
 */
public class ServerBasic {
     public static void main(String[] args) throws SocketException, UnknownHostException, IOException{
    
         InetAddress lh = InetAddress.getLocalHost();

         DatagramSocket serversocket = new DatagramSocket(8000, lh);
         
         
         byte[] buffer = new byte[256];
         DatagramPacket recieve = new DatagramPacket(buffer, buffer.length);

         serversocket.receive(recieve);
         
         System.out.println("Villian lost 50 health");
         System.out.println(recieve.getPort());
         System.out.println(new String(recieve.getData()));
       byte[] b="Villian loss 50 Health".getBytes();
        DatagramPacket send= new DatagramPacket(b, b.length, lh,8001);
serversocket.send(send);
     }
}
