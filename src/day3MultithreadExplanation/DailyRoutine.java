package day3MultithreadExplanation;

public class DailyRoutine {

	void drinkTea() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Drinking tea... " + i);
			try {
				Thread.sleep(300);
			} catch (Exception e) {
			}
		}
	}

	void watchNews() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Watching news... " + i);
			try {
				Thread.sleep(300);
			} catch (Exception e) {
			}
		}
	}

	void checkWhatsApp() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Checking WhatsApp... " + i);
			try {
				Thread.sleep(300);
			} catch (Exception e) {
			}
		}
	}
}