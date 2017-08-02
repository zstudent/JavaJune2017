package lesson170731;

public class ReThrowExample {
	
	public static void main(String[] args) {
		try {
			buildHouse();
			
		} catch (Exception e) {
			e.printStackTrace();
//			Exception c = e;
//			while (c != null) {
//				c.printStackTrace();
//				c = (Exception) c.getCause();
//			}
		}
		
	}

	private static void buildHouse() {

		try {
			buildBasement();
		} catch (Exception e) {
			throw new ПроблемыСТехникой(e);
		}
		
	}

	private static void buildBasement() {
		
		try {
			digPit();
		} catch (Exception e) {
			throw new НетИнструмента(e);
//			// do something
//			throw e;
		}
		
	}

	private static void digPit() {
		throw new НетЛопаты();
	}

}
