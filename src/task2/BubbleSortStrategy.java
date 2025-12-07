package task2;

public class BubbleSortStrategy implements SortStrategy{
    public void sort(int[] data, boolean ascending) {
        System.out.println("Bubble Sort використано");
        for (int i = 0; i < data.length-1; i++) {
            for (int j = 0; j < data.length-i-1; j++) {
                if ((ascending && data[j] > data[j+1]) ||
                        (!ascending && data[j] < data[j+1])) {
                    int tmp = data[j]; data[j] = data[j+1]; data[j+1] = tmp;
                }
            }
        }
    }
}
