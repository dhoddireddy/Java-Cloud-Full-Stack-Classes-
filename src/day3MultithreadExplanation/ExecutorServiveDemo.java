package day3MultithreadExplanation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiveDemo {
	
	public static void main(String[] args) {

        LifeRoutine obj = new LifeRoutine();

        ExecutorService service = Executors.newFixedThreadPool(3);

        service.submit(() -> obj.drinkTea());
        service.submit(() -> obj.watchNews());
        service.submit(() -> obj.checkWhatsApp());

		service.shutdown();
	}

}