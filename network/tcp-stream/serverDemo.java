package network.udp;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;

public class serverDemo {
    public static void main(String[] args) throws IOException {
        // DatagramSocket socket = new DatagramSocket(8000);
        // System.out.println("server is listening at port 8000");
        // byte[] buffer = new byte[1024] 
        ServerSocket ss = new ServerSocket(8000);
        Socket socket = ss.accept();
        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        output.writeUTF("hello from server");
       String s= input.readUTF();
       System.out.println("from client:"+s);
       ss.close();
       socket.close();
       input.close();
       output.close();
    }
}
