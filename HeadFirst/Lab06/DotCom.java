import java.util.ArrayList;

public class DotCom {
	// Переменные экземпляра класса DotCom
	private ArrayList<String> locationCells;
	private String name;
	
	// Сеттер, обновляющие местоположение сайта
	public void setLocationsCells(ArrayList<String> loc) {
		locationCells = loc;
	}
	
	// Простой сеттер
	public void setName(String n) {
		name = n;
	}
	
	// 
	public String checkYourself(String userInput) {		
		String result = "Fail";
		// Если ход пользователя совпал, indexOf вернет местоположение
		int index = locationCells.indexOf(userInput);
		
		if(index >= 0) {
			// Удаление элемента из ArrayList
			locationCells.remove(index);
			
			// Проверяем, все ли адреса разгаданы
			if(locationCells.isEmpty()) {
				result = "Drowned";
				// Сообщаем пользователю о потоплении сайта
				System.out.println("Oh! You sank " + name + "  : ( ");
			} else {
				result = "Catch";
			}
		}
		// Возвращаем "Fail", "Drowned" или "Catch"		
		return result;

	}
}