package exercises;

class PrintException extends Exception {}
class PaperPrintException extends PrintException {}
 
public interface Printer2 {
   abstract int printData() throws PrintException;
}

class Device implements Printer2 {

	@Override
	public int printData() throws PrintException {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] args) {
		
		Printer2 p = new Device();
		
		try {
			p.printData();
		} catch (PrintException e) {
			e.printStackTrace();
		}
		
		
	}
	
}