import java.io.*;
import java.util.*;

public class GameHelper {
	
	private static final String alphabet = "abcdefg";
	private int gridLength = 7;
	private int gridSize = 49;
	private int [] grid = new int[gridSize];
	private int comCount = 0;
	
	public String getUserInput(String prompt) {
		String inputLine = null;
		System.out.print(prompt + " ");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if(inputLine.length() == 0) return null;
		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}
		return inputLine.toLowerCase();
	}
	
	public ArrayList<String> placeDotCom(int comSize) {
		ArrayList<String> alphaCells = new ArrayList<String>();
		// Хранит координаты типа f6
		String[] alphacoords = new String[comSize]; 
		// Временная строка для конкатенации
		String temp = null;
		// Координаты текущего "сайта"
		int[] coords = new int[comSize];
		// Счётчик текущих попыток
		int attempts = 0;
		// Нашли подходящее местоположение?
		boolean success = false;
		// Текущее начальное местоположение
		int location = 0;
		
		// Энный "сайт" для размещения
		comCount++;
		// Устанавливаем горизонтальный инкремент
		int incr = 1;
		// Если нечётный(размещаем вертикально)
		if ((comCount % 2) == 1) {
		// Устанавливаем вертикальный инкремент
		incr = gridLength;
		}
		
		// Главный поисковый цикл(32)
		while(!success & attempts++ < 200) {
			// Получаем случайную стартовую точку
			location = (int) (Math.random() * gridSize);
			//System.out.println("try " + location);
			
			// Энная позиция в "сайте", которую нужно разместить
			int x = 0;
			// Предполагаемый успешный исход
			success = true;
			// ищём соседнюю неиспользованную ячейку
			while(success && x < comSize) {
				// Если ещё не используется
				if (grid[location] == 0) {
					// Сохраняем местоположение
					coords[x++] = location;
					// Пробуем "следующую" соседнюю ячейку
					location += incr;				
					// Вышли за рамки - низ
					if(location >= gridSize) {
						// Неудача
						success = false;
					}
					// Вышли за рамки - правый край
					if (x > 0 && (location % gridLength == 0)) {
					// Неудача
						success = false;
					}
				// Нашли уже использующееся местоположение
				} else {				
				// System.out.print("is used " + location);
				// Неудача
					success = false;
				}
			}
		} // Конец while
		
		// Переводим местоположение в символьные координаты
		int x = 0;
		int row = 0;
		int column = 0;
		// System.out.println("\n");
		while (x < comSize) {
			// Помечаем ячейки на главной сетке как "использованные"
			grid[coords[x]] = 1;
			// Получаем значение строки
			row = (int) (coords[x] / gridLength);			
			// Получаем числовое значение столбца
			column = coords[x] % gridLength;
			// Преобразуем его в строковый символ
			temp = String.valueOf(alphabet.charAt(column));
			
			alphaCells.add(temp.concat(Integer.toString(row)));
			x++;
			// Выражение говорит, где именно находится сайт
			// System.out.println("  coord " + x + " = " + alphaCells.get(x - 1));
		}
		// System.out.println(\n);
		
		return alphaCells;
	}	
 }