
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

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
         
         System.out.println(recieve.getAddress());
         System.out.println(recieve.getPort());
         System.out.println(new String(recieve.getData()));
     }
}
