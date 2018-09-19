import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class HTTPServer {
    public static void main(String args[]) throws IOException{
        int portnum;
        Scanner scan = new Scanner(System.in);+
        ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for connection on port " + portnum);
        while(true){
            try(Socket socket = server.accept()){
                Date today = new Date();
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
                socket.getOutputStream().write(httpResponse.getBytes()"UTF-8"));
            }
        }
    }
}
