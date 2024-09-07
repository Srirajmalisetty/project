package third;

import java.util.Scanner;

class palindrome {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        mergeSort(a, 0, n - 1);

        System.out.println("Sorted array:");
        printArray(a);
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] a, int low, int mid, int high) {
        int[] b = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;

        while (i <= mid && j <= high) {
            if (a[i] <= a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
            k++;
        }

if(i>mid)
{
for(int m=j;j<=high;j++)
{
b[k]=a[m];
k++;
}
}
else
{
	for(int n=i;i<=mid;i++)
	{
		b[k]=a[n];
		k++;
	}

}
	for (i = low; i <= high; i++) {
            a[i] = b[i-low];
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

	        }

	        
	}


