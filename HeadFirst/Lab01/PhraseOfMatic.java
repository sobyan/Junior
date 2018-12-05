public class PhraseOfMatic {
	public static void main (String[] args) {
		String[] wordListOne = {"современный", "технологичный", "экологичный", "экономный", "многофункциональный", "быстрый", "красивый", "динамичный", "винтажный", "новый"};
		String[] wordListTwo = {"концептуальный", "модный", "дизайнерский", "расщеплённый", "распределённый", "высокий", "беспринципный", "художественный", "влиятельный", "собранный"};
		String[] wordListThree = {"предмет", "подход", "план", "стол", "пылесос", "хроматограф", "дверь", "подшипник", "кошелёк", "мост"};
		
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		System.out.println("Всё, что нам нужно - это " + phrase);
	}
	
}