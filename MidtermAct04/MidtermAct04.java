import java.io.*;
import java.util.*;

public class MidtermAct04
{
	public static void main(String[] args) {
		try {
			File infile = new File("phonebook.txt");
			Scanner input = new Scanner(infile);
			String sdata = "";

			while (input.hasNext()) {
				sdata = input.next();

				if(sdata.equals("1001-11")) {
					System.out.println("Code Found!");
					System.out.println("Code: " +sdata);
					System.out.println("First Name: " +input.next());
					System.out.println("Last Name: " +input.next());
					System.out.println("CP No.: " +input.next());
					continue;
				}
			}
			input.close();

		File recfile = new File("recordfound.txt");
		File tempfile = new File("temp.txt");

		PrintWriter formattemp = new PrintWriter(tempfile);
		formattemp.print("");
		formattemp.close();
	
		PrintWriter wrtemp = new PrintWriter(tempfile);
		Scanner readfile = new Scanner(recfile);
		String wrdata = "";

		while (readfile.hasNextLine()) {
			wrdata = readfile.nextLine();
			wrtemp.println(wrdata);
		}
		wrtemp.close();
		readfile.close();

		Scanner outtemp = new Scanner(tempfile);
		PrintWriter wr = new PrintWriter(recfile);
		Scanner output = new Scanner(infile);

		while (outtemp.hasNextLine()) {
			wrdata = outtemp.nextLine();
			wr.println(wrdata);
		}
		outtemp.close();
		wr.println();

		while (output.hasNext()) {
			sdata = output.next();

			if(sdata.equals("1001-11")) {
				wr.println("Code: " +sdata);
				sdata = output.next();
				wr.println("First Name: " +sdata);
				sdata = output.next();
				wr.println("Last Name: " +sdata);
				sdata = output.next();
				wr.println("CP No.: " +sdata);
				continue;
			}
		}
		output.close();
		wr.close();

		PrintWriter formattemp2 = new PrintWriter(tempfile);
		formattemp2.print("");
		formattemp2.close();

		} catch (IOException e) {
            System.out.println(e);
        }
	}
}
