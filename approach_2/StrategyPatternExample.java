public class StrategyPatternExample {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 4, 2, 8};

        // Create a sorter with the array of numbers
        Sorter sorter = new Sorter(numbers);

        // Set the BubbleSort strategy and sort
        SortingStrategy bubbleSort = new BubbleSort(sorter);
        sorter.setStrategy(bubbleSort);
        sorter.performSort();

        // Set the QuickSort strategy and sort
        SortingStrategy quickSort = new QuickSort(sorter);
        sorter.setStrategy(quickSort);
        sorter.performSort();
    }
}