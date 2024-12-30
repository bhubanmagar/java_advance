import java.net.*;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        try {
            // Create a DatagramSocket
            DatagramSocket clientSocket = new DatagramSocket();

            // Server details
            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 5000;

            // Input two integers
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            // Send the integers to the server as a comma-separated string
            String message = num1 + "," + num2;
            byte[] messageData = message.getBytes();

            DatagramPacket sendPacket = new DatagramPacket(messageData, messageData.length, serverAddress, serverPort);
            clientSocket.send(sendPacket);
            System.out.println("Numbers sent to server.");

            // Receive the response from the server
            byte[] receiveBuffer = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            clientSocket.receive(receivePacket);

            String serverResponse = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Server response: " + serverResponse);

            // Close the socket
            clientSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
