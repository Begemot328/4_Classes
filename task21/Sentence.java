package by.module4.task21;

import java.util.ArrayList;
import java.util.Iterator;

public class Sentence {
	public final String SPACE = " ";
	private ArrayList<SentencePart> text;
	
	public Sentence() {
		text = new ArrayList<SentencePart>();
	}
	
	public Sentence(SentencePart ...parts ) {
		text = new ArrayList<SentencePart>();
		
		for (int i = 0; i < parts.length; i++) {
			text.add(parts[i]);
		}
	}
	
	public void addSentencePart(SentencePart part) {
		if(part != null) {
			text.add(part);
		}
	}
	
	public String toString() {
		String result;
		SentencePart part;
		if (text.isEmpty()) {
			return null;
		}
		Iterator iterator = text.iterator();
		result = iterator.next().toString();
		while (iterator.hasNext()) {
			part = (SentencePart) iterator.next();
			if (part instanceof Word) {
				result += SPACE;
			}
			result += part;
		}
		return result;
	}
}
