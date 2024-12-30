package network.tcp;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class clientDemo {
    public static void main(String[] args) throws IOException{
        Socket socket = new Socket("localhost",8000);
        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("enter First number");
        int num1 = Integer.parseInt(reader.readLine());
             System.out.println("enter second number");
        int num2 = Integer.parseInt(reader.readLine());
        output.writeInt(num1);
        output.writeInt(num2);
        int s =input.readInt();
        System.out.println("Number from server: "+ s);
        socket.close();
        input.close();
        output.close();
    }
}
