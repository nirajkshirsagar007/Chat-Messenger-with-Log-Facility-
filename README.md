# 💬 Chat Messenger with Log Facility

A Java-based **Chat Messenger Application** designed to enable real-time communication between users with an integrated **logging system**.  
This project demonstrates client-server architecture, socket programming, and persistent logging of chat conversations.

---

## 🚀 Technology Stack
- **Language:** Java  
- **Concepts:** Socket Programming, Multithreading, File I/O  
- **Architecture:** Client-Server Model  

---

## 📖 Project Overview
The Chat Messenger provides a simple yet effective way for multiple clients to connect to a server and exchange messages.  
Every conversation is logged for future reference, ensuring transparency and accountability.

---

## ✨ Key Features
- **Client-Server Communication**
  - Multiple clients can connect to a central server
  - Real-time message exchange using sockets
- **Logging Facility**
  - All chat messages are stored in log files
  - Logs include timestamps and sender details
- **Multithreading**
  - Server handles multiple clients simultaneously
- **User-Friendly Interface**
  - Menu-driven console application
  - Clear prompts for sending and receiving messages
- **Persistence**
  - Chat history maintained in structured log files

---

## 🧑‍💻 Example Usage
### Server Startup
```bash
java ChatServer
Server started on port 8080...
java ChatClient

Client Connection
Connected to server at localhost:8080
Enter message: Hello!

Sample Log File
[2025-11-23 16:30] Niraj: Hello!
[2025-11-23 16:31] Piyush: Hi Niraj, how are you?

🎯 Learning Outcomes
Practical understanding of socket programming in Java

Experience with multithreaded server applications

Knowledge of file handling and logging mechanisms

Exposure to client-server communication models
