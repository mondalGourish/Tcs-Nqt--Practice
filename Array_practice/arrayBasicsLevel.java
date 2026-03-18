//find the smallest and largest element in an array
// import java.util.*;

// public class arrayBasicsLevel{

//   public static void smallestAndLargest(int arr[]){

//     if(arr.length == 0){
//       System.out.println("0");
//       return;
//     }

//     int min = arr[0];
//     int max = arr[0];

//     for(int i = 1; i < arr.length; i++){
//       if(arr[i] < min){
//         min = arr[i];
//       }
//       if(arr[i] > max){
//         max = arr[i];
//       }
//     }

//     System.out.println(max + " " + min);
//   }

//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);

//     int n = sc.nextInt();
//     int arr[] = new int[n];

//     for(int i = 0; i < n; i++){
//       arr[i] = sc.nextInt();
//     }

//     smallestAndLargest(arr);
//   }
// }

//find the second smallest and the second largest
// import java.util.*;
// public class arrayBasicsLevel{
//   public static int[] secLargeAndSecSmall(int arr[]){
//     if(arr.length < 2){
//       return new int[]{-1,-1};
//     }
    
//     int small = Integer.MAX_VALUE;
//     int secSmall = Integer.MAX_VALUE;
//     int large = Integer.MIN_VALUE;
//     int secLarge = Integer.MIN_VALUE;
    
//     for(int i=0; i<arr.length; i++){
//       if(arr[i]>large){
//         secLarge = large;
//         large = arr[i];
//       }else if(arr[i]>secLarge && arr[i] != large){
//         secLarge = arr[i];
//       }
//       if(arr[i]<small){
//         secSmall = small;
//         small = arr[i];
//       }else if(arr[i]<secSmall && arr[i] != small){
//         secSmall = arr[i];
//       }
//     }
    
//     if(secLarge == Integer.MIN_VALUE || secSmall == Integer.MAX_VALUE){
//       return new int[]{-1, -1};
//     }else{
//       return new int[]{secLarge,secSmall};
//     }
    
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     for(int i=0; i<arr.length; i++){
//       arr[i] = sc.nextInt();
//     }
    
//     int result[] = secLargeAndSecSmall(arr);
    
//     if(result[0] == -1){
//       System.out.print("0");
//     }else{
//       System.out.print(result[0]+" "+result[1]);
//     }
    
//   }
// }

//reverse an given array
// import java.util.*;
// public class arrayBasicsLevel{
//   public static void reverse(int arr[]){
//     int start = 0; int end = arr.length-1;
//     while(start<end){
//       int temp = arr[start];
//       arr[start] = arr[end];
//       arr[end] = temp;
//       start++;
//       end--;
//     }
//     for(int i=0; i<arr.length; i++){
//       System.out.print(arr[i]+ " ");
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