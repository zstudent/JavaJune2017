package lesson170901;

public enum Seasons {
	WINTER("Low") {
		{
			System.out.println("зима близко!");
		}
		@Override
		public String getTemp() {
			return super.getTemp() + " ну оочень холодно!s";
		}
	}, 
	
	SPRING("Medium") {
		{
			System.out.println("зима прошла!");
		}
		
	}, 
	
	SUMMER("High"), AUTUMN("Medium");
	
	private String temperature;

	Seasons(String temperature) {
		this.temperature = temperature;
	}
	
	{
		
	}
	
	public String getTemp() {
		return temperature;
	}
}
