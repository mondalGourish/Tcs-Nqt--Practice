//linear search
// import java.util.*;
// public class basics{
//   public static int linearSearch(int arr[], int key){
//     for(int i=0; i<arr.length; i++){
//       if(arr[i] == key){
//         return i;
//       }
//     }
//     return -1;
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     for(int i=0; i<n; i++){
//       arr[i] = sc.nextInt();
//     }
//     int key = sc.nextInt();

//     int index = linearSearch(arr,key);
//     System.out.print(index);
//   }
// }

//binary search
// import java.util.*;
// public class basics{
//   public static int binarySearch(int arr[], int key){
//     int start = 0, end = arr.length-1;
//     while(start<=end){
//       int mid = (start+end)/2;
//       if(arr[mid] == key){
//         return mid;
//       }else if(arr[mid]<key){
//         start = mid+1;
//       }else{
//         end = mid-1;
//       }
//     }
//     return -1;
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     for(int i=0; i<n; i++){
//       arr[i] = sc.nextInt();
//     }
//     int key = sc.nextInt();
//     System.out.print(binarySearch(arr,key));

//   }
// }

//bubble sort
//bubble sort
// import java.util.*;
// public class basics{
//   public static void bubbleSort(int arr[]){
//     int n = arr.length;
//     for(int i=0; i<n-1; i++){
//       int swap = 0;
//       for(int j=0; j<n-1-i; j++){
//         if(arr[j]>arr[j+1]){
//           int temp = arr[j];
//           arr[j] = arr[j+1];
//           arr[j+1] = temp;
//           swap++;
//         }
//       }
//       if(swap == 0){
//         break;
//       }
//     }
    
//     for(int i=0; i<n; i++){
//       System.out.print(arr[i]+" ");
//     }
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     for(int i=0; i<n; i++){
//       arr[i] = sc.nextInt();
//     }
//     bubbleSort(arr);
//   }
// }

//selection sort
// import java.util.*;
// public class basics{
//   public static void selectionSort(int arr[]){
//     int n = arr.length;
//     for(int i=0; i<n-1; i++){
//       int minPos = i;
//       for(int j=i+1; j<n; j++){
//         if(arr[minPos]>arr[j]){
//           minPos = j;
//         }
//       }
//       int temp = arr[minPos];
//       arr[minPos] = arr[i];
//       arr[i] = temp;
//     }
//     for(int i=0; i<n; i++){
//       System.out.print(arr[i]+" ");
//     }
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     for(int i=0; i<n; i++){
//       arr[i] = sc.nextInt();
//     }
//     selectionSort(arr);
//   }
// }

//find average of the elements of an array

// import java.util.*;
// public class basics{
//   public static void average(int arr[]){
//     int n = arr.length;
//     float sum = 0;
//     float average = 0;
//     for(int i=0; i<n; i++){
//       sum += arr[i];
//     }
//     average = (sum/n);
//     System.out.println(sum);
//     System.out.printf("%.1f",average);
//   }
  
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     for(int i=0; i<n; i++){
//       arr[i] = sc.nextInt();
//     }
//     average(arr);
//   }
// }

//find the median of an array
// import java.util.*;
// public class basics{
//   public static void sort(int arr[]){
//     for(int i=0; i<arr.length-1; i++){
//       int minPos = i;
//       for(int j=i+1; j<arr.length; j++){
//         if(arr[minPos]>arr[j]){
//           minPos = j;
//         }
//       }
//       int temp = arr[minPos];
//       arr[minPos] = arr[i];
//       arr[i] = temp;
//     }
//   }
//   public static void findMedian(int arr[]){
//     int n = arr.length;
//     sort(arr);
//     if(n%2 == 0){
//       int mid1 = (n/2);
//       int mid2 = (n/2)-1;
//       System.out.print((float)(arr[mid1]+arr[mid2])/2);
//     }else{
//       System.out.print(arr[n/2]);
//     }
//   }
  
  
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     for(int i=0; i<n; i++){
//       arr[i] = sc.nextInt();
//     }
//     findMedian(arr);
//   }
// }

//remove duplicates
// import java.util.*;
// public class basics{
//   public static int removeDuplicates(int arr[]){
//     HashSet<Integer> set = new HashSet<>();
    
//     int index = 0;
    
//     for(int i=0; i<arr.length; i++){
//       if(!set.contains(arr[i])){
//         set.add(arr[i]);
//         arr[index] = arr[i];
//         index++;
//       }
//     }
//     return index;
//   }
  
  
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     for(int i=0; i<n; i++){
//       arr[i] = sc.nextInt();
//     }
//     int m = removeDuplicates(arr);
//     for(int i=0; i<m; i++){
//       System.out.print(arr[i]+" ");
//     }
//   }
// }

//optimized using 2pointer(as array is sorted)