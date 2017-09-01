package lesson170901;

import lesson170828.concurrency.Utils;

public class EnumExamples {

	// public final static int WINTER = 0;
	// public final static int SPRING = 1;
	// public final static int SUMMER = 2;
	// public final static int AUTUMN = 3;

//	static enum XX implements Runnable {
//		;
//
//		@Override
//		public void run() {
//			// TODO Auto-generated method stub
//
//		}
//	}

	public static void main(String[] args) {
		
		System.out.println("start");
		
		Seasons s;
		
		Utils.pause(5000);
		
		Seasons summer = Seasons.valueOf("SUMMER");
		
		Utils.pause(5000);

		Seasons[] values = Seasons.values();

		Utils.pause(5000);

		for (Seasons season : Seasons.values()) {
			System.out.println(season + " " + season.ordinal());
		}
		
//		new Seasons("hhh");  FORBIDDEN!

		Seasons currentSeason = Seasons.valueOf(args[0]);

		switch (currentSeason) {
		case WINTER:
			System.out.println("Бери зонтик");
			break;

		case SPRING:
			System.out.println("Достань зонтик");
			break;

		case SUMMER:
			System.out.println("Не убирай зонтик");
			break;

		case AUTUMN:
			System.out.println("Пора по грибы! Не забудь зонтик!");
			break;

		default:
			break;
		}
		
		Singleton.INSTANCE.getState();

	}

}
