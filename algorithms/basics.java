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