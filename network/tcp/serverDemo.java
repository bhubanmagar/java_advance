package network.tcp;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class serverDemo {
    public static void main(String[] args)throws IOException {
        ServerSocket ss = new ServerSocket(8000);
        Socket socket = ss.accept();
        DataInputStream input  = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());

        int num1  = input.readInt();
        int num2  = input.readInt();
        int greatest = Math.max(num1, num2);
        output.writeInt(greatest);
        System.out.println("Number from client is: "+ num1 + num2);
        ss.close();
        socket.close();
        input.close();
        output.close();
    }
    
}
