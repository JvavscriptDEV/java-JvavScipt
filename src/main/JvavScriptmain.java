package main;
import java.util.Scanner;

@Overview
public class JvavScriptmain {
	public static void main(String[] agrs) {
		System.out.println("================JVAVSCRIPT================");
		System.out.println("|            Joked BY Dr.HY_Z            |");
		System.out.println("|        Powered by JvavScript Team      |");
		System.out.println("|Enter 1 to get characters for processing|");
		System.out.println("|       Enter 2 output characters        |");
		System.out.println("==========================================");
		System.out.print("JvavScript>");
		Scanner input=new Scanner(System.in);
		int x=0,y=0;
		x=input.nextInt();
		switch(x) {
			case 1:
				Scanner in=new Scanner(System.in);
				System.out.print("Inputing>");
				y=in.nextInt();
				System.out.println("---------------------------------------------\n");
				System.out.println("Program exited with return value 0\n");
				break;
			case 2:
				System.out.print("Enter the word you want output>");
				Scanner ou=new Scanner(System.in);
				int zz=ou.nextInt();
				System.out.println("---------------------------------------------\n");
				System.out.println("Program exited with return value 3221225477\n");
				break;
			default:
				System.out.println("ERROR!!!Unknow value");
				System.out.println("---------------------------------------------\n");
				System.out.println("Program exited with return value 1\n");
				break;
		}
	}

}
