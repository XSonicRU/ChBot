package chekings;
import java.util.*;
import tools;
public class Greetings
{
	private static boolean isalreadysaid=false;
	private static String[] greetings = new String[]{"привет","хай","здаров", "дратути", "здоров", "здравствуй"};
	public static boolean checkifgreeting(String tocheck){
		return tools.checkifoneofall(greetings,tocheck);
	}
	public static String makeananswer(){
		if(isalreadysaid == false){
			int rnumber = new Random().nextInt(greetings.length);
			isalreadysaid = true;
			return beginwords.genbegword() + greetings[rnumber] + '.';
		}else{
			return "Уже здоровались!";
		}
		
		
	}
}
