package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
	
	public List<String []> csvReader(String csvFile, String delimiter) throws IOException {
		
    	List<String []> data = new ArrayList<>();
    	
    	try(BufferedReader br = new BufferedReader(new FileReader(csvFile))){
    		String line;
    		while((line = br.readLine())!=null) {
    			String[]fields = line.split(delimiter);
    			data.add(fields);
    		}
    	}catch (IOException e) {
            e.printStackTrace();
        }
    	return data;	
    }

}
