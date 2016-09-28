import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		while(true){
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String input = br.readLine();
			ChBot.processstring(input);
		}
	}
}
