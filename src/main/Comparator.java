package main;
import java.util.List;

import com.opencsv.exceptions.CsvException;

public class Comparator {

	    public static void main(String[] args) throws CsvException {
	    	String baseFile = "C:\\Users\\neena\\Downloads\\Sample.Data.v3\\Sample Data v3\\Contenders\\LocationBaseFile.csv"; 
	        String customerFile = "C:\\Users\\neena\\Downloads\\Sample.Data.v3\\Sample Data v3\\Contenders\\LocationCustomerFile.csv";
	        String delimiter = ","; 
	        //ReadCSV readCSVObj = new ReadCSV();
	        ReadCSVWithOpenCSV openCSVReader = new ReadCSVWithOpenCSV();
	        //PrintCSV printCSVObj = new PrintCSV();
	        
	        CompareCSV compareCSVObj = new CompareCSV();
	        
	        try {
				List<String[]> baseFileList = openCSVReader.csvReader(baseFile, delimiter);
				List<String[]> customerFileList = openCSVReader.csvReader(customerFile, delimiter);
				
				String[]headers = baseFileList.get(0);
		
				//printCSVObj.csvDataPrinter(file1);
				//printCSVObj.csvDataPrinter(file2);
				
				// Compare the two files
				compareCSVObj.csvComparator(baseFileList, customerFileList, headers);
				
				
			} catch (CsvException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
}