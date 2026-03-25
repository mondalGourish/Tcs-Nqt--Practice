//maximum element
// Input: [3, 7, 2, 9, 5]
// Output: 9
// import java.util.*;
// public class arrayBasics{
//   public static int largest(int arr[]){
//     int largest = Integer.MIN_VALUE;
//     for(int i=0; i<arr.length; i++){
//       if(arr[i]>largest){
//         largest = arr[i];
//       }
//     }
//     return largest;
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     //size of array
//     int arr[] = new int[n];
//     //loop for input
//     for(int i=0; i<arr.length; i++){
//       arr[i] = sc.nextInt();
//     }
//     System.out.print(largest(arr));
//   }
// }

//smallest element using tcs format input(also handles -ve input as well)
// Input: [8, 4, 6, 1, 9]
// Output: 1
import java.util.*;
public class arrayBasics{
  public static int smallest(int arr[]){
    int smallest = Integer.MAX_VALUE;
    for(int i=0; i<arr.length; i++){
      if(arr[i]<smallest){
        smallest = arr[i];
      }
    }
    return smallest;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    String firstLine = sc.nextLine();
    String secondLine = "";
    
    // Check if first line is only one number (size)
    if(firstLine.trim().matches("\\d+")){
        secondLine = sc.nextLine();
        firstLine = secondLine;
    }
    
    // Clean input
    firstLine = firstLine.replaceAll("[^0-9\\- ]", " ");
    
    String[] parts = firstLine.trim().split("\\s+");
    
    int[] arr = new int[parts.length];
    
    for(int i = 0; i < parts.length; i++){
        arr[i] = Integer.parseInt(parts[i]);
    }

    System.out.print(smallest(arr));
  }
}

//sum of elements in an array
// Input: [1,2,3,4,5]
// Output: 15
// import java.util.*;
// public class arrayBasics{
//   public static int sumOfElements(int arr[]){
//     int sum = 0;
//     for(int i=0; i<arr.length; i++){
//       sum += arr[i];
//     }
//     return sum;
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     for(int i=0; i<arr.length; i++){
//       arr[i] = sc.nextInt();
//     }
//     System.out.print(sumOfElements(arr));
//   }
// }

//count even odd
// Input: [1,2,3,4,5,6]
// Output: Even=3, Odd=3
// import java.util.*;
// public class arrayBasics{
//   public static void count(int arr[]){
//     int countEven = 0;
//     int countOdd = 0;
//     for(int i=0; i<arr.length; i++){
//       if(arr[i] % 2 == 0){
//         countEven++;
//       }else{
//         countOdd++;
//       }
//     }
//     System.out.print("Even="+countEven+" "+"Odd="+countOdd);
//   }
  
  
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     for(int i=0; i<arr.length; i++){
//       arr[i] = sc.nextInt();
//     }
//     count(arr);
    
//   }
// }

//reverse an array
// Input: [1,2,3,4]
// Output: [4,3,2,1]
// import java.util.*;
// public class arrayBasics{
//   public static void reverseArray(int arr[]){
//     int left = 0;
//     int right = arr.length-1;
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
//     reverseArray(arr);
    
//   }
// }

//second largest in an array
// Input: [10, 20, 4, 45, 99]
// Output: 45
// import java.util.*;
// public class arrayBasics{
//   public static void secondLargest(int arr[]){
//     int largest = Integer.MIN_VALUE;
//     int secLargest = Integer.MIN_VALUE;
//     for(int i=0; i<arr.length; i++){
//       if(arr[i]>largest){
//         secLargest = largest;
//         largest = arr[i];
//       }else if(arr[i]>secLargest && arr[i] != largest){
//         secLargest = arr[i];
//       }
//     }
//     System.out.println(largest);
//     System.out.println(secLargest);
//   }
  
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     for(int i=0; i<arr.length; i++){
//       arr[i] = sc.nextInt();
//     }
//     secondLargest(arr);
    
//   }
// }

//remove duplicates
// Input: [1,1,2,2,3]
// Output: [1,2,3]
// import java.util.*;
// public class arrayBasics{
  //it takes O(n2) time and O(n) space
  // public static ArrayList<Integer> removeDuplicates(int arr[]){
  //   ArrayList<Integer> list = new ArrayList<>();
  //   for(int i=0; i<arr.length; i++){
  //     if(!list.contains(arr[i])){
  //       list.add(arr[i]);
  //     }
  //   }
  //   return list;
  // }
  
//two pointer approach which takes O(n) time and O(1) space
//best for sorted array
//   public static int removeDuplicates(int arr[]){
//     int j=0;
//     for(int i=1; i<arr.length; i++){
//       if(arr[i] != arr[j]){
//         j++;
//         arr[j] = arr[i];
//       }
//     }
//     return j+1;
//   }
  
//for unsorted array use hashset
//   public static ArrayList<Integer> removeDuplicates(int arr[]) {
//     HashSet<Integer> set = new HashSet<>();
//     ArrayList<Integer> result = new ArrayList<>();

//     for(int i = 0; i < arr.length; i++) {
//         if(!set.contains(arr[i])) {
//             set.add(arr[i]);
//             result.add(arr[i]);
//         }
//     }

//     return result;
// }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     for(int i=0; i<arr.length; i++){
//       arr[i] = sc.nextInt();
//     }
//     int newSize = removeDuplicates(arr);
//     for(int i=0; i<newSize; i++){
//       System.out.print(arr[i]+" ");
//     }
    
//   }
// }

//count the frequency of elmenets
// import java.util.*;
// public class basics{
//   public static void countFrequency(int arr[]){
//     HashMap<Integer,Integer> map = new HashMap<>();
    
//     for(int i=0; i<arr.length; i++){
//       map.put(arr[i], map.getOrDefault(arr[i],0)+1);
//     }
    
//     for(Map.Entry<Integer,Integer> entry: map.entrySet()){
//       System.out.println(entry.getKey()+" "+entry.getValue());
//     }
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     for(int i=0; i<n; i++){
//       arr[i] = sc.nextInt();
//     }
//     countFrequency(arr);
//   }
// }

////Rearrange array in increasing-decreasing order
//Input: [4 2 8 6 15 5 9 20]
//Output: [2 4 5 6 20 15 9 8]


// import java.util.*;
// public class basics{
//   public static void sort(int arr[]){
//     for(int i=0; i<arr.length-1; i++){
//       for(int j=0; j<arr.length-i-1; j++){
//         if(arr[j]>arr[j+1]){
//           int temp = arr[j];
//           arr[j] = arr[j+1];
//           arr[j+1] = temp;
//         }
//       }
//     }
//   }
//   public static void sortIncreasingDecreasing(int arr[]){
//     int n = arr.length;
//     sort(arr);
//     int left = n/2; 
//     int right = n-1;
//     while(left<right){
//       int temp = arr[right];
//       arr[right] = arr[left];
//       arr[left] = temp;
//       left++;
//       right--;
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
//     sortIncreasingDecreasing(arr);
//   }
// }

//sum of array elements
// import java.util.*;
// public class basics{
//   public static void sumOfArr(int arr[]){
//     int sum = 0;
//     for(int i=0; i<arr.length; i++){
//       sum += arr[i];
//     }
//     System.out.print(sum);
//   }
  
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     for(int i=0; i<n; i++){
//       arr[i] = sc.nextInt();
//     }
//     sumOfArr(arr);
//   }
// }
