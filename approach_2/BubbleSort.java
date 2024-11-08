class BubbleSort implements SortingStrategy {
    private Sorter context;

    public BubbleSort(Sorter context) {
        this.context = context;
    }

    public void sort() {
        int[] array = context.getData(); // Retrieve the array from the context
        System.out.println("Sorting using Bubble Sort");

        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        printArray(array);
    }

    private void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
