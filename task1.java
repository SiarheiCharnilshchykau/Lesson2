import java.util.Scanner;

public class task1 { 
	
	public static void main(String[] args) { 
		int n = 10; // создаём целочисленную переменную n равную 10 
		Scanner sc = new Scanner(System.in); //инциализируем ввод с консоли
		String max = "", min = "", str = ""; // создаём строковые переменные с изначально пустыми значениями
		
		for (int i = 0; i < n; i++) { // цикл от 0 до n (у нас 10) 
		    System.out.print("> "); //печатаем > 
		    if (sc.hasNextLine()) { // условие для возможности ввода
			str = sc.nextLine(); // присваиваем переменной введённое значение
			if (i == 0) { 
				min = str; // условие при котором определяется min
			}
			if (str.length() > max.length()) { //условие при котором определяется max 
				max = str;     
			} else if (str.length() < min.length()) {    //сравнение min и max
				min = str;   
			}
			}
			
		}
		System.out.println("max string = " + max + " length=" + max.length()); //вывод max + длина строки
		System.out.println("min string = " + min + " length=" + min.length()); // вывод in + длина строки
		}
	} 
			
		
			

