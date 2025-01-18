import java.net.*;
class Server1
{
    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(777);
            System.out.println("server started...");
            Socket s=ss.accept();
            System.out.println("Client called");
            ss.close();
    }
    catch(Exception e) {
        System.out.println(e);
        }
    }
}

