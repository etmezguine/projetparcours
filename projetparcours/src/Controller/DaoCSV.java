package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class DaoCSV {
	

	 private final static char SEPARATOR = ',';
	 private final static String RESOURCES_PATH = "src/main/resources/";
	 private final static String DATA_FILE_NAME = "eleves.csv";

	 public List<Integer> findData() throws IOException {
		 File file = new File(RESOURCES_PATH + DATA_FILE_NAME);
		 FileReader fr = new FileReader(file);
		 CSVReader reader = new CSVReader(new FileReader("yourfile.csv"),SEPARATOR);
		 return null;
					
					
		
		}
	    
}
