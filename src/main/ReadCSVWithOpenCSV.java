package main;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class ReadCSVWithOpenCSV {
	
	public List<String []> csvReader(String csvFile, String delimiter) throws CsvException {
		
    	List<String []> data = new ArrayList<>();
    	
    	try(CSVReader reader = new CSVReader(new FileReader(csvFile))){
    		data = reader.readAll();
    	}catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    	return data;	
    }

}
