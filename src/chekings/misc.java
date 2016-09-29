package chekings;
import tools;
import java.io.*;
public class misc
{
	private static String[] miscauthorcheckings = new String[]{"кто тебя создал", "кем ты был создан", "кто твой творец"};
	private static String[] whoami = new String[]{"ты", "кто"};
	private static String[] name = new String[]{"имя","тебя","зовут","твоё","своё"};
	private static String[] username = new String[]{"имя","меня","зовут","моё"};
	public static boolean checkifmisc(String s){
		if(tools.checkifoneofall(miscauthorcheckings,s) | tools.checkifallthere(whoami,s)|tools.checkcount(name,s) >= 2|tools.checkcount(username,s) >= 2){
			return true;
		}else{
			return false;
		}
	}
	
	public static String genanswer(String source) throws IOException{
		for(String s:miscauthorcheckings){
			if(source.contains(s)){
				return "Я был создан Михаилом Смирновым";
			}
		}
		if(tools.checkcount(name,source) >= 2){
			return "Меня зовут ChBot";
		}
		if(tools.checkifallthere(whoami,source)){
			return "Я - ChBot, ваш верный друг и помощник";
		}
		if(tools.checkcount(username,source) >= 2){
			File s = new File("/sdcard/chbot.data");
			if(s.exists()){
				String name = tools.filereader(s);
				return "Тебя зовут " + name;
			}else{
				s.createNewFile();
				System.out.println("Я не знаю твоего имени.");
				System.out.println("Как тебя зовут?");
				String name = tools.readit();
				tools.writeinfile(s,name);
			}
			
		}
		return null;
	}
}
