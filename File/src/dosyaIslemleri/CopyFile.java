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
		File asýl = new File("file.txt");

		// dosyaya kopyalama
		File copy = new File("copy.txt");
		BufferedReader reader = null;
		PrintWriter writer = null;
		reader = new BufferedReader(new FileReader(asýl));
		writer = new PrintWriter(new FileWriter(copy));
		String satir;
		while ((satir = reader.readLine()) != null) {
			writer.println(satir);
		}
		System.out.println("kopyalama baþarýlý");
		writer.close();

		// dosyaya veri yazdýrma
		File yaz = new File("yaz.txt");
		// if(!yaz.exists())
		// yaz.createNewFile();
		String veri = "yaz.txt'ye yazdýrýldý    ";
		FileWriter fw = new FileWriter(yaz, true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(veri);
		bw.close();

		// dosyadan satýr silme
		BufferedReader reader2=new BufferedReader(new FileReader(copy));
		String ara=reader2.readLine();
		System.out.println(ara);
		String sil = "yola çýkarak";
		String last = "";
		 if(ara.contains(sil)){
	           int ind = ara.indexOf("yola çýkarak");
	           last = ara.substring(0, ind);
	           last += ara.substring(ind+sil.length(),ara.length()-1);
	       }
		 System.out.println(last);
	}
}
