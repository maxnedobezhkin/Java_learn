import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] newArray = new int[10];
		for (int i = 0; i < 10; i++) {
			newArray[i] = 0 + (int) (Math.random() * 10);
		}
		printArray(newArray);
		findMaxMinAverage(newArray);
		bubleSort(newArray);
		printArray(newArray);
		findSimpleNumber(newArray);
	}
	
	public static void printArray(int[] arrayToPrint) {
		for (int i:arrayToPrint) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void findMaxMinAverage(int[] arrayToFind) {
		int max, min;
		max = min = arrayToFind[0];
		double average = 0;
		for (int i:arrayToFind) {
			if (i > max) {
				max = i;
			} else if (i < min) {
				min = i;
			}
			average += i / arrayToFind.length;
		}
		System.out.format("Max:%d Min:%d Average:%f\n", max, min, average);
	}
	
	public static int[] bubleSort(int[] arrayToSort) {
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
	
	public static void findSimpleNumber(int[] arrayToFind) {
		Set<Integer> setSimpleNumber = new HashSet<Integer>();
		for (int i:arrayToFind) {
			boolean flagSimple = true;
			for (int j = 2; j < Math.abs(i); j++) {
				if (i % j == 0) {
					System.out.println(i + " " + j);
					flagSimple = false;
					break;
				}
			}
			if (flagSimple) {
				setSimpleNumber.add(i);
			}
		}
		if (setSimpleNumber.isEmpty()) {
			System.out.println("No simple numbers");
		} else {
			System.out.println(setSimpleNumber);
		}
	}
}


