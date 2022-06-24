package fortunecookiejar.server;

    import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
    import java.net.Socket;

public class ServerMain {
    public static void main(String[] args) throws IOException {

    int port = Integer.parseInt(args[0]);
    String cookiefilepath = args[1];
    

    try {
        

    } catch (Exception ex){

    }

// Create a server socket and listen to a port
ServerSocket server = new ServerSocket(port);

System.out.printf("Waiting for connection on port %...");
// Wait for incoming client connection
Socket sock = server.accept();
System.out.println("Connection accepted");

// Get the input and output stream - bytes
// Get the input stream
InputStream is = sock.getInputStream();
DataInputStream dis = new DataInputStream(is);

// Get the output stream
OutputStream os = sock.getOutputStream();
DataOutputStream dos = new DataOutputStream(os);

// Read request from client
String request = dis.readUTF();

System.out.printf("Received request: %s\n", request);

// Perform some operation on the request
request = "From the server: " + request.toUpperCase();


// Write back the data to the client
dos.writeUTF(request);

// close the strams
is.close();
os.close();

// close the socket
sock.close();
}

}