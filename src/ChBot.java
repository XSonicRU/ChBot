import java.util.*;
import chekings.*;
public class ChBot
{
	public static void processstring(String s){
		s = s.toLowerCase();
		s = s.trim();
		//TODO:Реализовать класс(или массивы) и методы в нём такие как Greetings, Subjects(разговора) и т.д.
		//Чтобы бот умело определял о чём ему пишут.
		if(Greetings.checkifgreeting(s)){
			System.out.println(Greetings.makeananswer());
		}
		if(answerwdthink.checkifthereswdthink(s)){
			System.out.println(answerwdthink.genananswer());
		}
	}
}
