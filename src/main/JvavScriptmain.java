package main;
import java.util.*;

public class JvavScriptmain {
	
	public static final String VERSION = "2.1.0";
	public static String endl = "\n";
	private static ArrayList<String> pool = new ArrayList<>();
	
	public static void cout(Object whattooutput) {
		System.out.print(whattooutput.toString()); 
		return;
	}
	
	public static void main(String[] agrs) {
		System.out.println("===================JVAVSCRIPT=================");
		System.out.println("|                                            |");
		System.out.println("|            Joked BY Dr.HY_Z                |");
		System.out.println("|         JvavScript Java 2021 (v2)          |");
		System.out.println("|          Type \"help\" for help            |");
		System.out.println("|                                            |");
		System.out.println("==============================================");
		cout("JvavScript>");
		Scanner in = new Scanner(System.in);
		String temp = null;
		while((temp = in.nextLine()) != null)
		{
			switch(temp) {
				case "":   // if 'temp' is empty, do nothing
					break;
				case "store":
					cout("Inputting>");
					temp=in.nextLine();
					pool.add(temp);
					System.out.println("index"+pool.indexOf(temp)+":"+temp);
					break;
				case "output":
					cout("Enter the word you want output>");
					temp=in.nextLine();
					System.out.println(temp);
					break;
				case "get":
					cout("Index>");
					try{
						int index = Integer.parseInt(in.nextLine());
						temp = pool.get(index);
						System.out.println(temp);
					} catch(Exception e){
						cout(e + endl);
					}
					break;
				case "exit":
				case "exit()":
					return;
				case "help":
					cout("JvavScript Java Help:"+endl);
					cout("version\t:\toutput version of Java-Jvavscript."+endl);
					cout("store\t:\tinput a string and store it."+endl);
					cout("get\t:\tget the stored string and output it."+endl);
					cout("output\t:\toutput a string."+endl);
					cout("exit or exit()\t:\texit."+endl);
					break;
				case "version":
					System.out.println(VERSION);
					break;
				default:
					System.out.println("ERROR : unknown command!");
					break;
			}
			cout("JvavScript>");
			/// \_(ツ)_/
		}
	}
}
