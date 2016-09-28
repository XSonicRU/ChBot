package chekings;
import java.util.*;

public class Greetings
{
	private static String[] greetings = new String[]{"привет","хай","здаров", "дратути", "здоров", "здравствуй"};
	public static boolean checkifgreeting(String tocheck){
		tocheck.toLowerCase();
		tocheck.trim();
		for(String s:greetings){
			if(tocheck.contains(s)){
				return true;
			}
		}
		return false;
	}
	public static String makeananswer(){
		int rnumber = new Random().nextInt(greetings.length);
		return beginwords.genbegword() + greetings[rnumber] + '.';
		
	}
}
