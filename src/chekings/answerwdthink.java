package chekings;
import java.util.*;
import tools;
public class answerwdthink //Вопросы связанные с "Что ты думаешь насчёт..."
{
	private static String[] wdthinkarrayask = new String[]{"что ты думаешь","как ты думаешь","как ты относишься", "как тебе","тебе нравится"};
	private static String[] wdthinkarrayansw = new String[]{"весьма неплохой","Очень неплохой", "Положительно", "Отрицательно", "Не очень хорошо", "Не очень"};
	public static boolean checkifthereswdthink(String tocheck){
			return tools.checkifoneofall(wdthinkarrayask,tocheck);
	}
	public static String genananswer(){
		return wdthinkarrayansw[new Random().nextInt(wdthinkarrayansw.length)];
	}
}
