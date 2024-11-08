class Sorter {
    private SortingStrategy strategy;
    private int[] data;

    public Sorter(int[] data) {
        this.data = data;
    }

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public int[] getData() {
        return data; // The array is retrieved through this method
    }

    public void performSort() {
        strategy.sort(); // Strategy will retrieve the array from the context
    }
}
