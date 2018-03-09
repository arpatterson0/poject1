/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.net.*;
import java.util.Scanner;
/**
 *
 * @author apatt_000
 */
public class Clientbasic {
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException{
        DatagramSocket skt = new DatagramSocket(8001);
        byte[] b = "hey".getBytes();
        InetAddress lh = InetAddress.getLocalHost();
        DatagramPacket send= new DatagramPacket(b, b.length, lh,8000);
        skt.send(send);
DatagramPacket recieve = new DatagramPacket(b, b.length);
skt.receive(send);
    }
    
}
