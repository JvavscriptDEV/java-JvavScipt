package main;
import java.util.*;

public class JvavScriptmain {
	public static void cout(String whattooutput)
	{
		System.out.print(whattooutput);
		return;
	}
	public static void main(String[] agrs) {
		String version = "2.0.2";
		System.out.println("===================JVAVSCRIPT=================");
		System.out.println("|                                            |");
		System.out.println("|            Joked BY Dr.HY_Z                |");
		System.out.println("|         JvavScript Java 2021 (v2)          |");
		System.out.println("|          Type \"help\" for help            |");
		System.out.println("|                                            |");
		System.out.println("==============================================");
		System.out.print("JvavScript>");
		Scanner in = new Scanner(System.in);
		String temp;
		while(true)
		{
			temp = in.nextLine();
			if(temp.equals("help"))
			{
				System.out.println("JvavScript Java Help:\n");
				cout("version\t:\toutput version of Java-Jvavscript.\n");
				cout("input\t:\tinput a string for nothing.\n");
				cout("output\t:\toutput a strong.\n");
				cout("exit or exit()\t:\texit.\n");
			}
			else if(temp.equals("input"))
			{
					System.out.print("Inputing>");
					temp=in.nextLine();
			}
			else if(temp.equals("output"))
			{
					System.out.print("Enter the word you want output>");
					temp=in.nextLine();
					System.out.println(temp);
			}
			else if(temp.equals("exit") || temp.equals("exit()"))
			{
				return;
			}
			else if(temp.equals("version"))
			{
				System.out.println(version);
			}
			else
			{
					System.out.println("ERROR : unknown command!");
			}
			System.out.print("JvavScript>");
		}
		/// \_(ツ)_/
	}
}
