package main;
import java.util.*;

public class JvavScriptmain {
	public static void main(String[] agrs) {
		System.out.println("===================JVAVSCRIPT=================");
		System.out.println("|            Joked BY Dr.HY_Z                |");
		System.out.println("|        Powered by JvavScript Team          |");
		System.out.println("|Enter input to get characters for processing|");
		System.out.println("|       Enter output output characters       |");
		System.out.println("==============================================");
		System.out.print("JvavScript>");
		Scanner in = new Scanner(System.in);
		String temp = null;
		while((temp = in.nextLine()) != null)
		{
			switch(temp) {
				case "":
					break;
				case "input":
					System.out.print("Inputing>");
					temp=in.nextLine();
					break;
				case "output":
					System.out.print("Enter the word you want output>");
					temp=in.nextLine();
					System.out.println(temp);
					break;
				case "exit":
				case "exit()":
					return;
				default:
					System.out.println("ERROR : unknown command!");
					break;
			}
			System.out.print("JvavScript>");
		}
		// \_(ツ)_/
	}
}
