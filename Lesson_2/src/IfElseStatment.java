
public class IfElseStatment {
	final static int RAIN = 0;
	final static int OVERCAST = 1;
	final static int SUNNY = 2;
	
	public static void main(String[] args) {
		int weather = SUNNY; // задаем сами
		
		// условие если 
		System.out.println("----==== if/else условие ====----");
		if (weather == SUNNY) {
			System.out.println("Идем на пляж");
		} else if (weather == OVERCAST) {
			System.out.println("Прогулямся в парке");
		} else if (weather == RAIN) {
			System.out.println("Сидим дома");
		} else {
			System.out.println("Непоятная какая-то погодка");
		}
		
		// switch
		System.out.println("---==== Тоже самое условие но со switch ====----");
		switch (weather) {
		case SUNNY:
			System.out.println("Идем на пляж");
			break;
		case OVERCAST:
			System.out.println("Прогулямся в парке");
			break;
		case RAIN:
			System.out.println("Сидим дома");
			break;
		default:
			System.out.println("Непоятная какая-то погодка");
			break;
		}

	}

}
