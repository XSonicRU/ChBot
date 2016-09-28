package chekings;
import java.util.*;

public class beginwords
{
	private static String[] begwords = new String[]{"Да, ", "Конечно, ", "О, ", "О, друг, "};
	public static String genbegword(){
		return begwords[new Random().nextInt(begwords.length)];
	}
}
