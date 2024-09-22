import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        // Step 1: Create a server socket that listens on a specific port (e.g., 8080)
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Server is running on port 8080...");

        // Step 2: Accept client connection
        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connected!");

        // Step 3: Create input and output streams to communicate with the client
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        // Step 4: Read data sent by the client
        String receivedMessage = in.readLine();
        System.out.println("Received from client: " + receivedMessage);

        // Step 5: Send a response back to the client
        out.println("Message received: " + receivedMessage);

        // Step 6: Close streams and sockets
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }
}
