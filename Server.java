import java.io.BufferedReader;
import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
	
	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(8989);
		System.out.println("connecting....");
		
		Socket s = ss.accept();
		System.out.println("connected");
		
		OutputStream os = s.getOutputStream();
		PrintStream out = new PrintStream(os);
		
		InputStreamReader isr1 = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(isr1);
		
		String msg1 = "";
		while( !(msg1=br1.readLine()).equals("exit"))
		{
			out.println("message to client from server is : "+ msg1);
	
		}
		
		
		InputStream in = s.getInputStream();
		InputStreamReader isr2 = new InputStreamReader(in);
		BufferedReader br2 = new BufferedReader(isr2);
		String msg2 = br2.readLine();
		System.out.println("message to server from client is : "+msg2);
		
		/*String msg2 = "";
		while((msg2 = br2.readLine())!=null) {
			System.out.println("messgae is:  "+msg2);
		}*/
		
		ss.close();
		s.close();
	}

}