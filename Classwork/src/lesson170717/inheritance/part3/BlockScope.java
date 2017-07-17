package lesson170717.inheritance.part3;

public class BlockScope {
	
	public static void main(final String[] args) {
		
		
		final int y = 0;
		
		{
			final int x = 10;
			{
				final int z = 10;
				
			}
			
//			System.out.println(z);  SYNTAX ERROR
			
		}
		
		
	}

}
