package dosyaIslemleri;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.xml.stream.util.StreamReaderDelegate;

public class CopyFile {
	public static void main(String[] args) throws IOException {
		File as�l = new File("file.txt");

		// dosyaya kopyalama
		File copy = new File("copy.txt");
		BufferedReader reader = null;
		PrintWriter writer = null;
		reader = new BufferedReader(new FileReader(as�l));
		writer = new PrintWriter(new FileWriter(copy));
		String satir;
		while ((satir = reader.readLine()) != null) {
			writer.println(satir);
		}
		System.out.println("kopyalama ba�ar�l�");
		writer.close();

		// dosyaya veri yazd�rma
		File yaz = new File("yaz.txt");
		// if(!yaz.exists())
		// yaz.createNewFile();
		String veri = "yaz.txt'ye yazd�r�ld�    ";
		FileWriter fw = new FileWriter(yaz, true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(veri);
		bw.close();

		// dosyadan sat�r silme
		BufferedReader reader2=new BufferedReader(new FileReader(copy));
		String ara=reader2.readLine();
		System.out.println(ara);
		String sil = "yola ��karak";
		String last = "";
		 if(ara.contains(sil)){
	           int ind = ara.indexOf("yola ��karak");
	           last = ara.substring(0, ind);
	           last += ara.substring(ind+sil.length(),ara.length()-1);
	       }
		 System.out.println(last);
	}
}
