package ua.lviv.lgs;

public class PersonFactory {

//	Inner class
	private class SportsMan implements Personable {
		@Override
		public void eat() {
			System.out.println("Sportsman is eating");

		}

		@Override
		public void move() {
			System.out.println("Sportsman is moving");
		}

		@Override
		public void sleep() {
			System.out.println("Sportman is sleeping");
		}
	}

	public SportsMan createSportsMan() {
		return new SportsMan();
	}

	// Local class
	public Personable createHouseWifeLocal() {
		class HouseWife implements Personable {

			@Override
			public void eat() {
				System.out.println("HouseWife is eating");
			}

			@Override
			public void move() {
				System.out.println("HouseWife is moving");
			}

			@Override
			public void sleep() {
				System.out.println("HouseWife is sleeping");
			}

		}

		return new HouseWife();
	}

	// Anonymous class
	public Personable createAnonymous() {
		return new Personable() {

			@Override
			public void eat() {
				System.out.println("Anonymous is eating");
			}

			@Override
			public void move() {
				System.out.println("Anonymous is moving");
			}

			@Override
			public void sleep() {
				System.out.println("Anonymous is sleeping");
			}
		};
	}

	//static neasted
	private static class GolfPlayer implements Personable {

		@Override
		public void eat() {
			System.out.println("Golf player is eating");
		}

		@Override
		public void move() {
			System.out.println("GolfPlayer is moving");
		}

		@Override
		public void sleep() {
			System.out.println("Golf player is sleepinh");
		}
	}
	
	public static GolfPlayer createGolfPlayer() {
		return new GolfPlayer();
	}
	
}
