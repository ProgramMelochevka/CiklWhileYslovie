package by.home.maxzzzit;

import java.util.Scanner;

// Класс, который принимает с клавиатуры целые числа. Ввод данных завершится, когда с клавиатуры
// будет введено значение -1. Класс должен выводить на экран количество значений,
// которые были введены с клавиатуры, но не засчитывать значение -1.
public class CiklWhileYslovie {
	public static void main(String[]args) {
		Scanner scn = new Scanner(System.in);
		int chisla=0, kolvo=0;
		while (chisla!=-1) {
			System.out.print("Введите целое число: ");
			chisla = scn.nextInt();
			if (chisla==-1) break;
				kolvo++;
				System.out.println("Количество значений введенных с клавиатуры = "+kolvo);
		}

	}
}
