import java.util.*;
import chekings.*;
import java.io.*;
public class ChBot
{
	public static void processstring(String s) throws IOException{
		s = s.toLowerCase();
		s = s.trim();
		
		if(Greetings.checkifgreeting(s)){
			System.out.println(Greetings.makeananswer());
		}
		if(answerwdthink.checkifthereswdthink(s)){
			System.out.println(answerwdthink.genananswer());
		}
		if(misc.checkifmisc(s)){
			System.out.println(misc.genanswer(s));
		}
		if(bye.byecheck(s)){
			System.out.println(bye.genanswer());
			System.exit(0);
		}
	}
}
