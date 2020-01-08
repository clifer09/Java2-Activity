import java.io.*;

public class Prelimact02
{
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("phonebook.txt"));
			int data = 0, colon = 0;;
			String sdata = "", fname = "", lname = "", cp = "";
			boolean hasFound = false;

			while ((data = in.read()) != -1) {
				String s = String.valueOf((char)data);
				sdata = sdata.concat(s);

				if (data == '\n') {
					sdata = "";
					colon = 0;
				}
				if (data == ':') {
					colon++;
				}
				if (sdata.equals("1001-11")) {
					System.out.println("We've found the record!");
					hasFound = true;
				}
				if (hasFound == true && data != ':') {
					if (colon == 1) fname = fname.concat(String.valueOf((char)data));
					if (colon == 2) lname = lname.concat(String.valueOf((char)data));
					if (colon == 3) cp = cp.concat(String.valueOf((char)data));
				}
				if (hasFound == true && data == '\n') hasFound = false;
			}
			in.close();

			System.out.println("Firstname:" +fname);
			System.out.println("Lastname:" +lname);
			System.out.println("CP#:" +cp);

		} catch (IOException e) {
            System.out.println(e);
        }
	}
}