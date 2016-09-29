package chekings;
import java.util.*;
import tools;
public class bye
{
	private static String[] byeings = new String[]{"пока", "прощай","досвид","до свид","дотвид"};
	public static boolean byecheck(String source){
		return tools.checkifoneofall(byeings,source);
	}
	public static String genanswer(){
		return beginwords.genbegword() + byeings[new Random().nextInt(byeings.length)] + ".";
	}
	}
