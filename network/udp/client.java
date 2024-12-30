package network.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet6Address;
import java.net.InetAddress;

import javax.xml.crypto.Data;

public class client {
    public static void main(String[] args)throws IOException {
     DatagramSocket socket = new DatagramSocket();
     InetAddress serverAdress = InetAddress.getByName("localhost"); 
     int port = 8000;

String message =  "Hello server";
byte[] messageData = message.getBytes();

DatagramPacket sendPacket = new DatagramPacket(messageData,messageData.length,serverAdress, port);
socket.send(sendPacket);


byte[] buffer = new byte[1024];
DatagramPacket recievePacket = new DatagramPacket(buffer, buffer.length);


socket.receive(recievePacket);
String ServerMsg = new String(recievePacket.getData(),0,recievePacket.getLength());
System.out.println("server message:"+ ServerMsg);

socket.close();



    }
}
