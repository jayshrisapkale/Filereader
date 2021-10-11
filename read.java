package Read;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//import com.sun.tools.sjavac.CopyFile;

public class read {
static File ob = new File("jawad.txt");
static Scanner a = new Scanner(System.in);

public static void create() throws Exception 
{
	if(ob.createNewFile()) {
		System.out.println("file created");
	}
}
public static void writing() throws IOException {
	FileWriter b = new FileWriter(ob);
	System.out.println("enter text");
	String c = a.nextLine();
	
	b.write(c);
	b.close();
}
	public static void main(String[] args) throws Exception {

		create();
		writein();
	}
	private static void writein() {
		
	}

}
