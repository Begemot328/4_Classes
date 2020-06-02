package by.module4.task13;

public class Student {
	private String name;
	private int groupNumber;
	int[] marks = new int[5];
	
	

	public Student(String name, int number) {
		this.name = name;
		this.groupNumber = number;
	}
	
	public int getGroupNumber() {
		return groupNumber;
	}
	
	public String getName() {
		return name;
	}
	public int[] getMarks() {
		return marks;
	}
	
	public void addMark( int mark) throws Exception {
		boolean check;
		check = false;
		
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] != 0) {
				continue;
			}
			marks[i] = mark;
			check = true;
			break;
		}
		
		if (!check) {
			throw new Exception("array is full");
		}
	}
	
}
