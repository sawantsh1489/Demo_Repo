package coImport;

public class CsvWriteReadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String fileName = "C://TD//student.csv";
		
		System.out.println("Write CSV file:");
		CsvFileWriter.writeCsvFile(fileName);
		
		//System.out.println("\nRead CSV file:");
		//CsvFileReader.readCsvFile(fileName);

	}

}
