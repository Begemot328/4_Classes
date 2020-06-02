package by.module4.task21;

public class Mark implements SentencePart{
	private String text;

	public Mark(String text) {
		this.text = text.trim();
	}
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}	
}
