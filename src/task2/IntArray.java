package task2;

public class IntArray {
    private int[] data;
    private SortStrategy strategy;
    private boolean ascending = true;

    public IntArray(int[] data) {
        this.data = data;
    }

    public void setStrategy(SortStrategy s) { this.strategy = s; }
    public void setAscending(boolean asc) { ascending = asc; }

    public void sort() {
        if (strategy != null) strategy.sort(data, ascending);
    }

    public void print() {
        for (int x : data) System.out.print(x + " ");
        System.out.println();
    }
    public void setData(int[] newData) {
        this.data = newData;
    }
}
