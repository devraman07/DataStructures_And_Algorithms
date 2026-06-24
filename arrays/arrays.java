

public class arrays {

    
    //Linear Scarch
    public static int LinearScarch(int arr[], int key) {

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }


    //Largest Element In an array
    public static int Largest(int arr[]) {
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
               
            }
        }
        return largest;
    }


    //Binary Scarch 
    public static int BinaryScarch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        
        while(start <= end) {
            int mid = (start + end) / 2;


            if(arr[mid] == key){
                return mid;
            }
            if(key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return - 1;

    }

    //Reverse An Array

    public static void Reverse(int arr[]) {
        int start = 0; int end = arr.length - 1;

        while(start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start ++;
            end --;


        }
        
    }

    //pairs In array 

    public static void Pairs(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for(int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + ")");
            }
        }
        System.out.println();
    }

    //Print Subarrays

    public static void Subarrays(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            
            for(int j = i; j < arr.length; j++ ) {
            for(int k = i; k <= j; k++) {
                System.out.print(arr[k]);
            }
            System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        // int key = 7;

        // System.out.println(LinearScarch(arr, key));

        // System.out.println(Largest(arr));

        // System.out.println(BinaryScarch(arr, key));
    //    Reverse(arr);

    //    for(int i = 0; i < arr.length; i++) {
    //     System.out.print(arr[i] + " ");
    //    }
    //    System.out.println();

    // Pairs(arr);
    Subarrays(arr);
    }
}