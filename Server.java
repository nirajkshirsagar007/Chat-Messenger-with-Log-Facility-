import java.net.*;
import java.io.*;

class Server
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Server Application is Running...");

        ServerSocket ssobj = new ServerSocket(2200);
        System.out.println("Server is waiting for client at port number 2200.");

        Socket sobj = ssobj.accept();   // Accept the request from the client
        System.out.println("Connection established with the client..");

        PrintStream ps = new PrintStream(sobj.getOutputStream());
        BufferedReader br1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String str1, str2;
        System.out.println("Marvellous chat messenger application started...");
        while((str1 = br1.readLine())!= null)
        {
            System.out.println("Client says : "+str1);
            System.out.println("Enter the messege for Client : ");
            str2 = br2.readLine();
            ps.println(str2);
        }
        System.out.println("Thank you for using the Marvellous Chat Application..");

    }
}