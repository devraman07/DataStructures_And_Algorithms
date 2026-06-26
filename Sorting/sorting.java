
public class sorting {
     //bubble sort
    public static void BubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
    //selection sort
    public static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int misPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[misPos] > arr[j]) {
                    misPos = j;
                }
            }
            int temp = arr[misPos];
            arr[misPos] = arr[i];
            arr[i] = temp;
        }
    }
   public static void insertionSort(int[] arr) {
    
    for(int i = 1; i < arr.length; i++) {
        int curr = arr[i];
        int prev = i - 1;

        while(prev >= 0 && arr[prev] > curr) {
            arr[prev + 1] = arr[prev];
            prev--;
        }

        arr[prev + 1] = curr;
    }
}


public static void countSort(int arr[]) {
    int largest = Integer.MIN_VALUE;
    for(int i =0; i < arr.length; i++) {
        largest = Math.max(largest, arr[i]);

    }

    int count[] = new int[largest + 1];

    for(int i = 0;  i < arr.length; i++) {
        count[arr[i]] ++;
    }


    int idx = 0;

    for(int i =0; i < count.length; i++) {
       while(count[i] > 0) {
        arr[idx] = i;
        idx++;
        count[i] --;
       }
    }
}







    // array printing statement
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 3, 1,6, 2, 5, 3, 6, 4, 7, 9, 3, 7, 8  };

        // BubbleSort(arr);
        countSort(arr);
        printArr(arr);
    }
}