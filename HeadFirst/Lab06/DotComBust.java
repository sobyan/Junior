import java.util.*;

public class DotComBust {
	
	// Объявляем и инициализируем переменные
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;
	
	private void setUpGame() {
		
		// Создаём три объекта DotCom, даём им имена и помещаем в ArrayList
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
		dotComList.add(one);
		dotComList.add(two);
		dotComList.add(three);
		
		// Выводим краткие инструкции для пользователя
		System.out.println("Your goal is to sink three sites");
		System.out.println("Pets.com, eToys.com, Go2.com");
		System.out.println("Try to sink them for the minimum number of moves");
		
		// Запрашиваем для каждого объекта адрес сайта
		// Передаём значение сеттеру
		for(DotCom dotComToSet : dotComList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationsCells(newLocation);
		}
	}
	
	private void startPlaying() {
		
		// Получаем пользовательский ввод, пока dotComList не станет пустым
		// Вызываем метод checkUserGuess
		while(!dotComList.isEmpty()) {
			String userGuess = helper.getUserInput("Make the move");
			checkUserGuess(userGuess);
		}
		// Вызываем метод finishGame
		finishGame();
	}
	
	private void checkUserGuess(String userGuess) {
		
		// инкрементируем количество попыток, которые сделал пользователь
		numOfGuesses++;
		// Подразумеваем промах, пока не выяснили обратного
		String result = "Fail";
		
		// Проверяем попадания, повторяем для всех объектов DotCom
		for(DotCom dotComToTest : dotComList) {
			result = dotComToTest.checkYourself(userGuess);
			if(result.equals("Catch")) {
				break;
			}
			if(result.equals("Drowned")) {
				dotComList.remove(dotComToTest);
				break;
			}
		}
		System.out.println(result);
	}
	
	// Выводим сообщения, как пользователь провёл игру
	private void finishGame() {
		System.out.println("All sites are gone to the bottom! Your stocks are now worthless.");
		if(numOfGuesses <= 18) {
			System.out.println("It took you only " + numOfGuesses + " attempts.");
			System.out.println("You managed to get out before your investments drowned.");
		} else {
			System.out.println("It took you quite a lot of time. "  + numOfGuesses + " attempts.");
			System.out.println("Fish lead roundelays around your investments.");
		}
	}
	
	public static void main(String[] args) {
		// Создаём игровой объект
		DotComBust game = new DotComBust();
		// Говорим игровому объекту подготовить игру
		game.setUpGame();
		// Говорим игровому объекту начать игру
		game.startPlaying();
	}
}