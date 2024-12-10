package main;

import java.util.Arrays;
import java.util.List;

public class PrintCSV {

	public void csvDataPrinter(List<String[]> data) {
    	for(String[] cell:data) {
    		System.out.println(Arrays.toString(cell));
    	}
    }
}
