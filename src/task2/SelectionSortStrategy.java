package task2;

public class SelectionSortStrategy implements SortStrategy{
    public void sort(int[] data, boolean ascending) {
        System.out.println("Selection Sort використано");
        for (int i = 0; i < data.length-1; i++) {
            int index = i;
            for (int j = i+1; j < data.length; j++) {
                if ((ascending && data[j] < data[index]) ||
                        (!ascending && data[j] > data[index])) {
                    index = j;
                }
            }
            int tmp = data[i]; data[i] = data[index]; data[index] = tmp;
        }
    }
}
