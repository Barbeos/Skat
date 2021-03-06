package fileimport;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

import model.SkatteProcenter;

public class SkatteProcenterImportFile {
	static ArrayList<String> strings;
	
	public static ArrayList<SkatteProcenter> cSVReader() {
		
		 try {
			BufferedReader reader = new BufferedReader(new FileReader("skatteprocenter.txt"));
			strings = new ArrayList<String>();	
			
			while(reader.ready()){
				strings.add(reader.readLine());
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		 ArrayList<SkatteProcenter> lines = new ArrayList<SkatteProcenter>();
		 ArrayList<String[]> tempLines = new ArrayList<String[]>();
		 for(String s: strings) {
			 tempLines.add(s.split(","));
		 }

		 for(String[] s: tempLines) {
			 lines.add(new SkatteProcenter(s[0], Integer.parseInt(s[1]), new BigDecimal(s[2]), new BigDecimal(s[3]), new BigDecimal(s[4]), new BigDecimal(s[5]), new BigDecimal(s[6])));
		 }
		 return lines;
	 }
	
}
