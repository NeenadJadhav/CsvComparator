package main;

public class CompareRows {

	public boolean rowsComparator(String[]row1, String[] row2, String[] headers, int rowIndex) {
    	if(row1 == null || row2 == null) {
    		System.out.println("Difference found at row " + rowIndex + ":");
            System.out.println("File 1: " + (row1 == null ? "null" : String.join(", ", row1)));
            System.out.println("File 2: " + (row2 == null ? "null" : String.join(", ", row2)));
            return false;
    	}
    	
    	boolean isRowIdentical = true;
    	
    	for (int i = 0; i < Math.min(row1.length, row2.length); i++) {
            if (!row1[i].trim().equalsIgnoreCase(row2[i].trim())) {
                System.out.println("Difference at row " + rowIndex + ", column '" + headers[i] + "':");
                System.out.println("Base file: " + row1[i]);
                System.out.println("Customer file: " + row2[i]);
                isRowIdentical = false;
            }
        }

        if (row1.length != row2.length) {
            System.out.println("Difference in number of columns at row " + rowIndex + ":");
            System.out.println("Base file:     " + String.join(", ", row1));
            System.out.println("Customer file: " + String.join(", ", row2));
            isRowIdentical = false;
        }
        return isRowIdentical;
    }
}
