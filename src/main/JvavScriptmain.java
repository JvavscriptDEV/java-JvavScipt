package main;
import java.util.*;

public class JvavScriptmain {
	
	public static final String VERSION = "2.0.4"; //define constant
	
	public static void cout(Object whattooutput) { // use Object to let this parameter can be any data type like boolean, int etc.
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
				case "input":
					cout("Inputing>");
					temp=in.nextLine();
					break;
				case "output":
					cout("Enter the word you want output>");
					temp=in.nextLine();
					System.out.println(temp);
					break;
				case "exit":
				case "exit()":
					return;
				case "help":
					System.out.println("JvavScript Java Help:\n");
					cout("version\t:\toutput version of Java-Jvavscript.\n");
					cout("input\t:\tinput a string for nothing.\n");
					cout("output\t:\toutput a string.\n");
					cout("exit or exit()\t:\texit.\n");
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
