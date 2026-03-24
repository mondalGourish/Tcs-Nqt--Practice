//smallest and largest
// import java.util.*;
// public class basics{
//   public static int smallest(int arr[]){
//     int min = Integer.MAX_VALUE;
//     for(int i=0; i<arr.length; i++){
//       if(arr[i]<min){
//         min = arr[i];
//       }
//     }
//     return min;
//   }
//   public static int largest(int arr[]){
//     int max = Integer.MIN_VALUE;
//     for(int i=0; i<arr.length; i++){
//       if(arr[i]>max){
//         max = arr[i];
//       }
//     }
//     return max;
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     for(int i=0; i<n; i++){
//       arr[i] = sc.nextInt();
//     }
//     System.out.println(smallest(arr));
//     System.out.print(largest(arr));
//   }
// }

//smallest and largest
// import java.util.*;
// public class basics{
//   public static int[] largestAndSmallest(int arr[]){
//     if(arr.length == 0){
//       return new int[]{-1,-1};
//     }
//     int max = Integer.MIN_VALUE;
//     int min = Integer.MAX_VALUE;
//     for(int i=0; i<arr.length; i++){
//       if(arr[i]>max){
//         max = arr[i];
//       }
//       if(arr[i]<min){
//         min = arr[i];
//       }
//     }
//     return new int[]{max,min};
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     for(int i=0; i<n; i++){
//       arr[i] = sc.nextInt();
//     }
//     int result[] = largestAndSmallest(arr);
//     if(result[0] == -1){
//       System.out.print("0");
//     }else{
//       System.out.println(result[0]);
//       System.out.print(result[1]);
//     }
//   }
// }

//second smallest and second largest
// import java.util.*;
// public class basics{
//   public static int[] secMinAndSecMax(int arr[]){
//     if(arr.length < 2){
//       return new int[]{-1,-1};
//     }
    
//     int max = Integer.MIN_VALUE;
//     int secMax = Integer.MIN_VALUE;
//     int min = Integer.MAX_VALUE;
//     int secMin = Integer.MAX_VALUE;
    
//     for(int i=0; i<arr.length; i++){
//       if(arr[i]>max){
//         secMax = max;
//         max = arr[i];
//       }else if(arr[i]>secMax && arr[i] != max){
//         secMax = arr[i];
//       } 
//       if(arr[i]<min){
//         secMin = min;
//         min = arr[i];
//       }else if(arr[i]<secMin && arr[i] != min){
//         secMin = arr[i];
//       }
//     }
//     if(secMax == Integer.MIN_VALUE || secMin == Integer.MAX_VALUE){
//       return new int[]{-1, -1};
//     }
//     return new int[]{secMax,secMin};
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     for(int i=0; i<n; i++){
//       arr[i] = sc.nextInt();
//     }
//     int result[] = secMinAndSecMax(arr);
//     if(result[0] == -1){
//       System.out.print("0");
//     }else{
//       System.out.println(result[0]);
//       System.out.print(result[1]);
//     }
//   }
// }

//reverse a given array
// import java.util.*;
// public class basics{
//   public static void reverse(int arr[]){
//     int left = 0, right = arr.length-1;
//     while(left<right){
//       int temp = arr[left];
//       arr[left] = arr[right];
//       arr[right] = temp;
//       left++;
//       right--;
//     }
//     for(int i=0; i<arr.length; i++){
//       System.out.print(arr[i]+" ");
//     }
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     for(int i=0; i<arr.length; i++){
//       arr[i] = sc.nextInt();
//     }
//     reverse(arr);
//   }
// }
