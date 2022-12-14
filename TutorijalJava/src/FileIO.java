import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
/**
 * moguce je napraviti fajlove i citati fajlove
 * @param args
 */
	public static void main(String[] args) {

		FileIO fio=new FileIO ();
		fio.write();
		fio.read();
	}

	public void write() {
		
		File myFile = new File("testFile.txt");
		try {
			FileWriter fw = new FileWriter(myFile.getAbsoluteFile());
			BufferedWriter bw =new BufferedWriter (fw);
			bw.write("Hello");
			bw.newLine();
			bw.write("Test automation");
			bw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	public void read () {
		
		File myFile= new File ("testFile.txt");
		FileReader fr;
		try {
			fr= new FileReader(myFile.getAbsolutePath());
			BufferedReader br = new BufferedReader(fr);
			String line= null;
			//da stampa svaki red sve dok u njemu ima reci tj dok broj  reci u redu ne bude jednak nuli
			while ((line= br.readLine()) !=null) {
			System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
