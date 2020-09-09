package File_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class Line_no_reader 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("D:\\JavaWorkspace\\Project_3\\file3.txt");
		//FileInputStream fi = new FileInputStream(f);

		//if (!f.isFile() || !f.canRead())
		//throw new IOException("can't read " + args[0]);

		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		try(LineNumberReader lnr = new LineNumberReader(br))
		{
			String line = null;
			int lnum = 0;

			Scanner in = new Scanner(System.in);
			System.out.println("enter which line number to print");
			int s = in.nextInt();

			while ((line = lnr.readLine()) != null && (lnum = lnr.getLineNumber()) < s) 
			{
			
			}
			switch (lnum) 
			{
			case 0:
				System.out.println("the file has zero length");
				break;
			case 1:
				boolean empty = "".equals(line);
				System.out.println("line 1: " + (empty ? "empty" : line));
				break;
			case 2:
				boolean empty2 = "".equals(line);
				System.out.println("line 2: " + (empty2 ? "empty" : line));
				break;
			case 3:
				boolean empty3 = "".equals(line);
				System.out.println("line 3: " + (empty3 ? "empty" : line));
				break;
			case 4:
				boolean empty4 = "".equals(line);
				System.out.println("line 4: " + (empty4 ? "empty" : line));
				break;
			case 5:
				boolean empty5 = "".equals(line);
				System.out.println("line 8: " + (empty5 ? "empty" : line));
				break;
			case 6:
				boolean empty6 = "".equals(line);
				System.out.println("line 6: " + (empty6 ? "empty" : line));
				break;
			case 7:
				boolean empty7 = "".equals(line);
				System.out.println("line 7: " + (empty7 ? "empty" : line));
				break;
			case 8:
				boolean empty8 = "".equals(line);
				System.out.println("line 8: " + (empty8 ? "empty" : line));
				break;
			default:
				System.out.println("the file has only " + lnum + " line(s)");
			}
			in.close();
		}
		br.close();


	}

}

