import java.io.*;
public class tools
{
	public static void writeinfile(File s,String content) throws FileNotFoundException, IOException{
		FileOutputStream fos = new FileOutputStream(s);
		byte[] towrite = new byte[content.length()];
		char[] tobyte = content.toCharArray();
		for(int i = 0;i<tobyte.length;i++){
			towrite[i] = (byte) tobyte[i];
		}
		fos.write(towrite);
	}
	public static String readit() throws IOException{
		return new BufferedReader(new InputStreamReader(System.in)).readLine();
	}
	public static String filereader(File f) throws FileNotFoundException, IOException{
		String s = "";
		FileInputStream fis = new FileInputStream(f);
		for(int i=0;i<fis.available();i++){
			s = s+(char)fis.read();
		}
		return s;
	}
	public static boolean checkifoneofall(String[] array, String tocheck){
		for(String s:array){
			if(s.contains(tocheck)){
				return true;
			}
		}
		return false;
	}
	public static boolean checkifallthere(String[] array, String tocheck){
		for(int i = 0;i<array.length;i++){
			if(!tocheck.contains(array[i])){
				return false;
			}
		}
		return true;
	}
	public static int checkcount(String[] array, String source){ 
	//Считает сколько слов из массива есть в строке
		int result = 0;
		for(String s:array){
			if(source.contains(s)){
				result++;
			}
		}
		return result;
	}
}
