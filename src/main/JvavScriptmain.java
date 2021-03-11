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
		String temp;
		while(true)
		{
			temp = in.nextLine();
			if(temp.equals("input"))
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
			else
			{
					System.out.println("ERROR : unknown command!");
			}
			System.out.print("JvavScript>");
		}
		/// this is a easy java program
		/// and it is ~~reeeeeeeeeeeeeeeally useless~~
		/// \_(ツ)_/
	}
}
