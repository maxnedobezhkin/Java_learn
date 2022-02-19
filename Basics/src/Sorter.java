
public class Sorter {
	public int[] bubleSort(int[] arrayToSort) {
		for (int i = 0; i < arrayToSort.length - 1; i++) {
			for (int j = 0; j < arrayToSort.length - 1; j++) {
				if (arrayToSort[j + 1] < arrayToSort[j]) {
					int temp = arrayToSort[j];
					arrayToSort[j] = arrayToSort[j + 1];
					arrayToSort[j + 1] = temp;
				}
			}
		}
		return arrayToSort;
	}
}
