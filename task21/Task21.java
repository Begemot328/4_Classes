package by.module4.task21;


/*
 * Task 2.1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на 
 * консоль текст, заголовок текста.  
 */
public class Task21 {

	public static void main(String[] args) {
		Text text;
		Sentence sentence = new Sentence(new Word("Мама"), new Word("мыла"), new Word("раму"), new Mark("."));
		text = new Text(sentence);
		sentence = new Sentence(new Word("Мойте "), new Mark(","), new Word("мама"), 
								new Mark(","), new Word("раму"), new Mark(". "));
		text.addSentence(sentence);
		
		System.out.println("Итоговый текст");
		System.out.println(text);
	}

}
