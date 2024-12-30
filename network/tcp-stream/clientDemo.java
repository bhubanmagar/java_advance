package network.udp;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.net.Socket;

public class clientDemo {
    public static void main(String[] args)throws IOException {
        Socket socket = new Socket("localhost",8000);
        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        output.writeUTF("hello server");
        String s = input.readUTF();
        System.out.println("from server:"+ s);
        socket.close();
        input.close();
        output.close();
        
    }
    
}
