import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("localhost",8989);
		
		InputStream in = s.getInputStream();
		InputStreamReader isr1 = new InputStreamReader(in);
		BufferedReader br1 = new BufferedReader(isr1);
		String msg1 = "";
		while((msg1 = br1.readLine())!=null) {
			System.out.println("messgae from server to client is:  "+msg1);
		}
	
		
		OutputStream os = s.getOutputStream();
		PrintStream out = new PrintStream(os);
		String msg2 = "hello Server ";
		out.println("message from client to server is : "+msg2);
		
		/*InputStreamReader isr2 = new InputStreamReader(System.in);
		BufferedReader br2 = new BufferedReader(isr2);
		String msg2 = "";
		while( !(msg2=br2.readLine()).equals("exit"))
		{
			out.println(msg2);
	
		}*/
	
		s.close();
	}

}