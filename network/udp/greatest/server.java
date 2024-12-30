import java.net.*;

public class server {
    public static void main(String[] args) {
        try {
            // Create a DatagramSocket to listen on port 5000
            DatagramSocket serverSocket = new DatagramSocket(5000);
            System.out.println("Server is listening on port 5000...");

            // Buffer to receive data
            byte[] receiveBuffer = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);

            // Receive the packet from the client
            serverSocket.receive(receivePacket);
            String receivedData = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Received from client: " + receivedData);

            // Parse the received integers
            String[] numbers = receivedData.split(",");
            int num1 = Integer.parseInt(numbers[0].trim());
            int num2 = Integer.parseInt(numbers[1].trim());
            int greatest = Math.max(num1, num2);

            // Prepare the response
            String response = "The greatest number is: " + greatest;
            byte[] responseData = response.getBytes();

            // Get the client's address and port
            InetAddress clientAddress = receivePacket.getAddress();
            int clientPort = receivePacket.getPort();

            // Send the response back to the client
            DatagramPacket sendPacket = new DatagramPacket(responseData, responseData.length, clientAddress, clientPort);
            serverSocket.send(sendPacket);

            System.out.println("Response sent to client.");
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
