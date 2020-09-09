package File_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Range_lineread 
{
public static void main(String[] args) 
{
	String text = "";
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the range of lines needed to read");
	
	int range1 = in.nextInt();
	int range2 = in.nextInt();
		
	try
	{
		FileReader fr = new FileReader("D:\\JavaWorkspace\\Project_3\\file3.txt");
		BufferedReader br = new BufferedReader(fr);
		for (int i = 1; i <= range2; i++)
		{
			if ( i >= range1 && i <= range2  ) 
			{
				text = br.readLine();
				System.out.println(text);
			}
			else
				br.readLine();
		}
		br.close();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	in.close();
	
}

}
