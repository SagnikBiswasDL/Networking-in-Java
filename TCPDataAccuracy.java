import java.io.*;
import java.net.*;
import java.util.Arrays;

public class TCPDataAccuracy {

    static class Server implements Runnable {
      public void run() {
          try (ServerSocket serverSocket = new ServerSocket(5000)) {
              Socket socket = serverSocket.accept();
              DataInputStream input = new DataInputStream(socket.getInputStream());
  
              // Receive data from the client
              byte[] receivedData = new byte[1024];
              input.readFully(receivedData);
  
              // Simulate data verification
              byte[] originalData = new byte[1024];
              Arrays.fill(originalData, (byte) 1); // Original data pattern
  
              // Calculate accuracy
              int correctBytes = 0;
              for (int i = 0; i < receivedData.length; i++) {
                  if (receivedData[i] == originalData[i]) {
                      correctBytes++;
                  }
              }
              double accuracy = ((double) correctBytes / receivedData.length) * 100;
              System.out.println("Data received with accuracy: " + accuracy + "%");
  
              input.close();
              socket.close();
          } catch (IOException e) {
              e.printStackTrace();
          }
      }
    }

    static class Client {
      public void sendData() {
          try (Socket socket = new Socket("localhost", 5000);
               DataOutputStream output = new DataOutputStream(socket.getOutputStream())) {
  
              // Generate and send data
              byte[] dataToSend = new byte[1024];
              Arrays.fill(dataToSend, (byte) 1); // Fill with some pattern
  
              output.write(dataToSend);
              System.out.println("Data sent.");
  
          } catch (IOException e) {
              e.printStackTrace();
          }
      }
    }

    
  
    public static void main(String[] args) {
        try {
            // Start the server on a separate thread
            Thread serverThread = new Thread(new Server());
            serverThread.start();

            // Give the server some time to start up
            Thread.sleep(1000);

            // Start the client
            Client client = new Client();
            client.sendData();

            // Wait for the server to finish
            serverThread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
