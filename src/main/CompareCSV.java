package main;

import java.util.List;

public class CompareCSV {
	
	CompareRows compareRows = new CompareRows();

	public void csvComparator(List<String[]>data1, List<String[]>data2, String[]headers) {
    	int maxRows = Math.max(data1.size(), data2.size());
        boolean isIdentical = true;
        
        for(int i=0; i<maxRows;i++) {
        	if(i<data1.size() && i<data2.size()) {
        		String[] row1 = data1.get(i);
        		String[] row2 = data2.get(i);
        		
        		if(!compareRows.rowsComparator(row1, row2, headers, i+1)) {
        			isIdentical = false;
        		}
        		
        	}
        }
        if (isIdentical) {
            System.out.println("The two CSV files are identical.");
        }
    }
}
