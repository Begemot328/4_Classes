package by.module4.task21;

import java.util.ArrayList;
import java.util.Iterator;

public class Text {
	public final String SPACE = " ";
	private ArrayList<Sentence> text;
	
	public Text() {
		text = new ArrayList<Sentence>();
	}
	
	public Text(Sentence ...parts ) {
		text = new ArrayList<Sentence>();
		
		for (int i = 0; i < parts.length; i++) {
			text.add(parts[i]);
		}
	}
	
	public void addSentence(Sentence part) {
		if(part != null) {
			text.add(part);
		}
	}
	
	public String toString() {
		String result;
		Sentence part;
		if (text.isEmpty()) {
			return null;
		}
		Iterator iterator = text.iterator();
		result = iterator.next().toString();
		while (iterator.hasNext()) {
			part = (Sentence) iterator.next();
			result += SPACE + part;
		}
		return result;
	}
}
