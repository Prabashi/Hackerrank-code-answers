// Solve Me First
public class Solution {
    static int solveMeFirst(int a, int b) {
        return a+b;
   }
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
   }
}

// Simple Array Sum
static int simpleArraySum(int[] ar) {
        int sum = 0;
        for(int i:ar){
            sum += i;
        }
        return sum;
    }

// Compare the Triplets
 static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int diff;
        int aPoints = 0, bPoints = 0;
        List<Integer> points = new ArrayList<>();
        for(int i=0;i<a.size();i++){
            diff = a.get(i) - b.get(i);
            if(diff>0){
                aPoints += 1;
            }
            else if(diff<0){
                bPoints += 1;
            }
        }
        points.add(aPoints);
        points.add(bPoints);
        return points;
    }

// A Very Big Sum
static long aVeryBigSum(long[] ar) {
    long sum = 0;
    for(long i: ar){
        sum += i;
    }
    return sum;
}

// Diagonal Difference
static int diagonalDifference(int[][] arr) {
        int d1 = 0, d2 = 0;
        for(int i=0;i<arr.length;i++){
            d1 += arr[i][i];
            d2 += arr[arr.length-1-i][i];
        }
        return Math.abs(d1-d2);
    }

// Plus Minus
    static void plusMinus(int[] arr) {
        int pos = 0,neg = 0,zero = 0;
        for(int i:arr){
            if(i>0){
                pos += 1;
            }
            else if(i<0){
                neg += 1;
            }
            else{
                zero += 1;
            }
        }
        System.out.println(pos/(arr.length * 1.0));
        System.out.println(neg/(arr.length * 1.0));
        System.out.println(zero/(arr.length * 1.0));
    }

// Staircase ***************
    static void staircase(int n) {
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("#");                
            }
            System.out.println();
        }
    }


// Time Conversion
    static String timeConversion(String s) {
        String amOrPm = s.substring(8,10);
        String time = s.substring(0,8);
        String hr = s.substring(0,2), newHr;
        int h;
        if(amOrPm.equals("AM")){
            if(hr.equals("12")){
                time = time.replace(hr, "00");
            }
        }
        else if(amOrPm.equals("PM")){
            if(!hr.equals("12")){
                h = Integer.parseInt(hr);
                h += 12;
                newHr = Integer.toString(h);
                time = time.replace(hr,newHr);
            }
        }   
        return time;
    }

// Apple and Orange
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int val, noOfApples = 0, noOfOranges = 0;
        for(int d: apples){
            val = a+d;
            if((val == s || val > s) && (val == t || val < t)){
                noOfApples += 1;
            }
        }
        System.out.println(noOfApples);
        for(int d: oranges){
            val = b+d;
            if((val == t || val < t) && (val == s || val > s)){
                noOfOranges += 1;
            }
        }
        System.out.println(noOfOranges);

    }

// Kangaroo
    static String kangaroo(int x1, int v1, int x2, int v2) {
        while(x1 != x2){
            if((x1 > x2 && (v1 == v2 || v1 > v2)) || (x2 > x1 && (v2 == v1 || v2 > v1))){
                return "NO";
             }
            x1 += v1;
            x2 += v2;
        }        
        return "YES";
    }

// Circular Array Rotation
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int [] arr = new int[a.length];
        int [] res = new int[queries.length];
        int index;
        for(int i=0;i<a.length;i++){ //right rotation
            index = (i+k)% a.length;
            arr[index] = a[i];
        }
        for(int i=0;i<queries.length;i++){ //queries
            res[i] = arr[queries[i]];
        }
        return res;
    }

// Intro to Tutorial Challenges
     static int introTutorial(int V, int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i] == V){
                return i;
            }
        }
        return 0;
    }

// Insertion sort part1 - insert last value at the appropriate place. Print array in each step.
     static void insertionSort1(int n, int[] arr) {
        int val = arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>val){
                arr[i+1] = arr[i];
                for(int j=0;j<n;j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }   
            else{
                arr[i+1] = val;
                for(int j=0;j<n;j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
                break;
            }
            if(i==0){
                arr[i] = val;
                for(int j=0;j<n;j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
        }
    }

// Insertion sort part2 - Insert at the appropriate places, starting from the beginning. Print array in each step.
  static void insertionSort2(int n, int[] arr) {
        int val;
        for(int i=1;i<n;i++){
            val = arr[i];
            for(int j=i-1;j>=0;j--){
                if(val<arr[j]){
                    arr[j+1] = arr[j];
                }
                else{
                    arr[j+1] = val;
                    break;  
                }  
                if(j==0){
                    arr[j] = val;
                }
            }
            for(int k=0;k<n;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
    }
// Insertion sort
// Correctness and the Loop Invariant
public static void insertionSort(int[] A){
        for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > value){
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;
        }

        printArray(A);
    }

static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }

// Quicksort1 - Partition
 static int[] quickSort(int[] arr) {
        int pivot = arr[0];
        List<Integer> leftA = new ArrayList<>();
        List<Integer> equalA = new ArrayList<>();
        List<Integer> rightA = new ArrayList<>();

        for(int i:arr){
            if(i < pivot){
                leftA.add(i);
            }
            else if(i == pivot){
                equalA.add(i);
            }
            else{
                rightA.add(i);
            }            
        }
        int [] ar = new int[arr.length];
        int index = 0;
        for(int i:leftA){
            ar[index] = i;
            index++;
        }
        for(int i:equalA){
            ar[index] = i;
            index++;
        }
        for(int i:rightA){
            ar[index] = i;
            index++;
        }
        return ar;
    }


// Counting sort1
    static int[] countingSort(int[] arr) {
        int[] result = new int[100];
        for(int i:arr){
            result[i]++;
        }
        return result;
    }

// Counting Sort2
     static int[] countingSort(int[] arr) {
        int[] ar = new int[100];
        for(int i:arr){
            ar[i]++;
        }
        int[] result = new int[arr.length];
        int index = 0;
        for(int i=0;i<100;i++){
            for(int j=ar[i];j>0;j--){
                result[index] = i;
                index++;
            }
        }
        
        return result;

    }

// Fibonacci Modified (BigInteger)
    static BigInteger fibonacciModified(int t1, int t2, int n) {
        BigInteger bigT1 = BigInteger.valueOf(t1);
        BigInteger bigT2 = BigInteger.valueOf(t2);
        if(n == 1){
            return bigT1;
        }
        else if(n == 2){
            return bigT2;
        }        
        return fibonacciModified(t1, t2, (n-2)).add(fibonacciModified(t1, t2, (n-1)).pow(2));
    }

    // Mini-max sum
       static void miniMaxSum(int[] arr) {
        long min=0, max=0;
        long sum;       
        for(int i=0;i<arr.length;i++){
            min += arr[i];
        }        
        for(int i=0;i<arr.length;i++){
            sum = 0;
            for(int j=0;j<arr.length;j++){
                if(j==i){
                    continue;
                }
                sum += arr[j];
            }
            if(sum>max){
                max=sum;
            }
            if(sum<min){
                min=sum;
            }
        }
        System.out.println(min+" "+max);
    }

// Birthday cake candles
    static int birthdayCakeCandles(int[] ar) {
        int max=0;
        int count=0;
        // for(int i=0;i<ar.length;i++){
        //     if(ar[i]>max){
        //         max = ar[i];
        //     }
        // }
        // for(int i=0;i<ar.length;i++){
        //     if(max == ar[i]){
        //         count++;
        //     }
        // }
        max = ar[0];
        for(int i=0;i<ar.length;i++){
            if(max<ar[i]){
                max = ar[i];
                count = 1;
            }
            else if(max == ar[i]){
                count++;
            }
        }

        return count;
    }

