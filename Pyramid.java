import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pyramid {
	public static void main(String args[]) throws IOException {
		InputStreamReader ip = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(ip);
		String str = reader.readLine();
		int k = Integer.parseInt(str);
		for (int i=1;i<=k;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}