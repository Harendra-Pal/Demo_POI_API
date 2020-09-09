package File_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read_line 
{
	public static void main(String[] args)
	{
		String text = "";
		boolean empty = false  ;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter line number to print that line");
		int ln = in.nextInt();
		
		try
		{
			FileReader fr = new FileReader("D:\\JavaWorkspace\\Project_3\\file3.txt");
			BufferedReader br = new BufferedReader(fr);
			for (int i = 1; i <= ln; i++)
			{
				if (i == ln ) 
				{
					text = br.readLine();
					empty ="".equals(text);
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
		
		System.out.println(" The specific Line is: \n" + (empty? " empty" : text));
		in.close();
		
	}

}
