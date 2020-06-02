package by.module4.task14;

public class TrainComparator {
	private TrainSortingIndex index;
	private static TrainComparator instance;

	private TrainComparator() {
		this.index = TrainSortingIndex.BY_NUMBER;
	}

	public static TrainComparator getInstance() {
		if (instance == null) {
			instance = new TrainComparator();
		}
		return instance;
	}

	public void setIndex(TrainSortingIndex index) {
		this.index = index;
	}

	public int compare(Train train1, Train train2) {
		switch (index) {
		case BY_NUMBER:
			return train1.getNumber() - train2.getNumber();
		case BY_PLACE:
			return train1.getDestination().compareTo(train2.getDestination());
		case BY_TIME:
			return (int) (train1.getTime().getTime() - train2.getTime().getTime());
		}
		return 0;
	}
}
