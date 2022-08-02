public class sortingMethods {
    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    static int[] insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        return arr;
    }

    public static void conquer(int[] arr, int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int i = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[i++] = arr[idx1++];
            } else {
                merged[i++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged[i++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            merged[i++] = arr[idx2++];
        }

        for (int j = 0, k = si; j < merged.length; j++, k++) {
            arr[k] = merged[j];
        }
    }

    public static void mergeSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static int partition(int[] arr, int low, int high) {
        int i = low-1;
        int pivot = arr[high];
        for(int j = 0; j< high ;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pidx = partition(arr,low, high);
            quickSort(arr, low, pidx-1);
            quickSort(arr, pidx+1, high);
        }
    }

    public static void main(String[] args) {
        // int arr[] = { 7, 8, 3, 1, 5 };
        int arr[] = { 6,3,9,5,8};
        // int sortedArray[] = selectionSort(arr);
        // int sortedArray[] = insertionSort(arr);
        // printArray(sortedArray);
        // mergeSort(arr, 0, arr.length - 1);
        // printArray(arr);
        quickSort(arr,0,arr.length-1);
        printArray(arr);
    }
}