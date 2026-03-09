import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class FileDemo{
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		File f = new File("PersonalJava");
		if (f.exists()){
			System.out.println("Directory already exists.");
		}
		else {
			f.mkdir();
			System.out.println("Directory is created.");
		}
		File f1 = new File(f,"Example.txt");
		if (f1.createNewFile()){
			System.out.println("File is created.");
			FileWriter fw = new FileWriter(f1);
			System.out.println("Enter the text you want to enter into the file: ");
			String str = sc.nextLine();
			fw.write(str);
			fw.close();
			FileReader fr = new FileReader(f1);
			int ch=0;
			while((ch=fr.read())!=-1){
				System.out.print((char)ch);
			}
			fr.close();
		}
		else {
			System.out.println("File already exists.");
			FileWriter fw = new FileWriter(f);
			System.out.println("Enter the text you want to enter into the file: ");
			String str = sc.nextLine();
			fw.write(str);
			fw.close();
			FileReader fr = new FileReader(f);
			int ch=0;
			while((ch=fr.read())!=-1){
				System.out.print((char)ch);
			}
			fr.close();
		}
	}
}
