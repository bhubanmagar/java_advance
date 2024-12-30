package network.udp;

import java.io.IOError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;

public class server {
    public static void main(String[] args) throws IOException{
        DatagramSocket serverSocket = new DatagramSocket(8000);
        byte[] buffer = new byte[1024];
        
        DatagramPacket recievemsg = new DatagramPacket(buffer, buffer.length);
        serverSocket.receive(recievemsg);

        String clientMsg = new String(recievemsg.getData(),0,recievemsg.getLength());
        System.out.println("client msg:"+ clientMsg);


        String response = "hello from server";
        byte[] responseData = response.getBytes();
        InetAddress clientAdress = recievemsg.getAddress();
        int clientport = recievemsg.getPort();

        DatagramPacket sendPacket = new DatagramPacket(responseData, responseData.length,clientAdress,clientport);
        serverSocket.send(sendPacket);


        serverSocket.close();

        
    }
    
}
