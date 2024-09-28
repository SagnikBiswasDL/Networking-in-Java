# Fundamental Networking Demonstration with Java

This repository contains several networking projects that I developed using Java. These projects focus on how computers communicate over networks using common techniques like sending and receiving data between devices.

## Project Overview

### 1. Simple TCP Client-Server Communication
- **File**: `tcp_client_server.java`
- **What It Does**: A basic example where one computer (the client) sends a message to another computer (the server), and the server responds back.
- **Why It’s Useful**: This is how many online services work, where your device (the client) talks to a server (like when you check your email or visit a website).

### 2. File Transfer over UDP
- **File**: `udp_file_transfer.java`
- **What It Does**: This project transfers a file from one device to another using a network protocol called UDP.
- **Why It’s Useful**: File transfer is a common task, and this shows how to send data between computers quickly, even though UDP doesn’t guarantee every part of the file will arrive (this project includes error handling to deal with that).

### 3. Simulated Web Request (HTTP)
- **File**: `http_request_simulation.java`
- **What It Does**: This project simulates how your browser sends a request to a website and how the website responds back.
- **Why It’s Useful**: It demonstrates the basics of how the web works (HTTP requests) without needing to visit an actual website.

### 4. Real-Time Chat Application (TCP)
- **File**: `tcp_chat_application.java`
- **What It Does**: Multiple people can send messages to each other over a network in real-time, with a server handling all the connections.
- **Why It’s Useful**: Real-time communication is the backbone of apps like WhatsApp, Slack, and other messaging platforms.

### 5. Ping Client-Server (UDP)
- **File**: `udp_ping_client_server.java`
- **What It Does**: Simulates the ‘ping’ command, where one device sends a signal to another to see if it’s reachable.
- **Why It’s Useful**: This is useful for testing if a computer or server is online and how fast data can travel between them (used in network diagnostics).

### 6. TCP Data Accuracy Demonstration
- **File**: `tcp_data_accuracy.java`
- **What It Does**: This project tests how accurately data is transmitted over TCP by comparing the data sent from the client to what the server receives. It measures the accuracy of the transmission by calculating the percentage of matching bytes.
- **Why It’s Useful**: This simulates real-world network transmissions where data integrity is critical. The accuracy measurement helps verify the reliability of the network in maintaining the correctness of transmitted data.
- **Sample Output**:
