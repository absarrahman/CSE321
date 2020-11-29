package Lab3.Task4;

public class Task4 {
    public static void main(String[] args) {
        int arr[] = {5,4,2,6,10};

        QuickSort quickSort = new QuickSort(arr,0,arr.length-1);
        quickSort.start();
        try {
            quickSort.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Sorted value");
        for (int i :
                arr) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
