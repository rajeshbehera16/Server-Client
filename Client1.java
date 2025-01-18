import java.net.*;
class Client1
{ 
    public static void main(String args[])
    {
        try{
            Socket s =new Socket("localhost",777);
            System.out.println("Client Started");
            s.close();
        }
        catch(Exception e)
        {
            System.out.println(e);






        }
    }
}
