 //ARRAY

 // 1D Array
 static int[] reverseArray(int[] a) {
       
        int[] arr = new int[a.length];
        for(int i=0; i<a.length;i++){
            arr[i] = a[a.length-1-i];
        }

        return arr;
    }

// 2D Array
 static int array2D(int[][] arr) {
        int max = 0;
   
        for(int i=0;i<arr.length-2;i++){
            for(int j=0;j<arr[i].length-2;j++){
                int val = 0;
                for(int k=0;k<3;k++){
                    val =val + arr[i][j+k] + arr[i+2][j+k];
                }
                val = val + arr[i+1][j+1];
                if(i==0 && j==0){
                    max=val;
                }
                
                if(val>max){
                    max = val;
                }
            }
        }
        
        return max;
    }

// Dynamic Array - did not work
static int[] dynamicArray(int n, int[][] queries) {
        List<List<Integer>> seqList = new ArrayList<List<Integer>>();
        int lastAnswer = 0;
        int seqNo, lastAnswerIndex;
        List<Integer> seq = new ArrayList<Integer>();
        List<Integer> ansList = new ArrayList<Integer>();
        
        for(int i=0;i<n;i++){
            seqList.add(seq);
        }
        
        for(int i=0;i<queries.length;i++){
            seqNo = (queries[i][1]^lastAnswer) % n;
            // System.out.println(seqNo);

            seq = seqList.get(seqNo);
            
		// for (Integer temp : seq) {
		// 	System.out.println(temp);
		// }
            
            if(queries[i][0] == 1){
                seq.add(queries[i][2]);
                // System.out.println(queries[i][2]);
            }
            else if(queries[i][0] == 2){
                lastAnswerIndex = queries[i][2] % seq.size();
                lastAnswer = seq.get(lastAnswerIndex);
                ansList.add(lastAnswer);
                // System.out.println(lastAnswerIndex);

            }
        }
        seq = seqList.get(0);

        int[] ansArr = new int[ansList.size()];

        for(int i=0;i<ansList.size();i++){
            ansArr[i] = ansList.get(i);
        }
        
        return ansArr;
        
    }

// Left Rotation
public class Solution {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scan.nextLine().split(" ");

        int n = Integer.parseInt(nd[0].trim());

        int d = Integer.parseInt(nd[1].trim());

        int[] a = new int[n];
        int[] arr = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }
        
        int index;
        for(int i=0;i<n;i++){
            index = (n+i-(d%n))%n;
            arr[index] = a[i];
        }
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            if(i != n-1){
                System.out.print(" ");
            }
        }
    }
}

// or
   static int[] rotLeft(int[] a, int d) {
        int arrLength = a.length;
        int [] arr = new int[arrLength];
        int rotations = d % arrLength;
        for(int i=0;i<rotations;i++){
            arr[arr.length - rotations +i] = a[i];
        }
        for(int i=rotations;i<arr.length;i++){
            arr[i - rotations] = a[i];
        }
        return arr; 
    }

// or **********
   static int[] rotLeft(int[] a, int d) {
        int [] arr = new int[a.length];
        int index;
        for(int i=0;i<a.length;i++){
            index = (a.length - d + i)%a.length;
            arr[index] = a[i];
        }
        return arr;
    }



// Sparse Arrays (why Strings?)
static int findSuffix(String[] collections, String queryString) {
        int count = 0;
        for(int i=0;i<collections.length;i++){
            if(collections[i].equals(queryString)){
                count++;
            }
        }
        return count;

    }

// Array Manipulation (correct,wrong and timed out in test cases)
    static int arrayManipulation(int n, int[][] queries) {
        int[] arr = new int[n];
        int max = 0;
        
        for(int i=0;i<queries.length;i++){
            for(int j=queries[i][0];j<=queries[i][1];j++){
                arr[j-1] = arr[j-1] + queries[i][2];
                if(arr[j-1]>max){
                    max = arr[j-1];
                }
            }
        }

        return max;
    }

    // END OF ARRAY SUBDOMAIN

// LINKED LIST

// Print elements of a linked list
/*
  Print elements of a linked list on console 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
void Print(Node head) {
  
    Node node = head;
    while(node != null){
        System.out.println(node.data);
        node = node.next;
    }
  
}

// Insert Node at the end of a linked list and return head of the linked list
/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
    Node node = head;
    Node newNode = new Node();
    if(node == null){
        // node = newNode;
        newNode.data = data;
        newNode.next = null;
        
        return newNode;
    }
    
    while(node.next != null){
        node = node.next;
    }
    node.next = newNode;
    newNode.data = data;
    newNode.next = null;
  
    return head;
}


// Insert Node at the beginning of a linked list and return head of the linked list
/*
  Insert Node at the beginning of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
// This is a "method-only" submission. 
// You only need to complete this method. 

Node Insert(Node head,int x) {
    Node node = new Node();
    node.data = x;
    if(head == null){
        node.next = null;
        return node;
    }
    node.next = head;
    return node;
}

// Insert Node at a given position in a linked list and return head of linked list
/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   
    Node node = new Node();
    node.data = data;
    Node iNode = new Node();
    
    if(head == null && position==0){
        node.next = null;
        return node;
    }
    if(position == 0){
            node.next = head;
            return node;
        }
    iNode = head;
    for(int i=0;i<position-1;i++){
       iNode = iNode.next;
    }
    Node tempNode = new Node();
    tempNode = iNode.next;
    iNode.next = node;
    node.next = tempNode;
    return head;
}


   /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {

//         recursive way
        // if (position == 0){ return head.next; }
        // head.next = deleteNode(head.next, position-1);
        // return head;

        SinglyLinkedListNode node = null;
        SinglyLinkedListNode nodeNext = null;
        SinglyLinkedListNode nodeInPosition = null;

        if(head == null){
            return null;
        }
        
        if(position == 0){
            nodeNext = head.next;
            head.next = null;
            return nodeNext;
        }
        
        node = head;
        for(int i=1;i<position;i++){
            node = node.next;
        }
        nodeInPosition = node.next;
        nodeNext = nodeInPosition.next;
        
        node.next = nodeNext;
        nodeInPosition.next = null;

        return head;
        
    }

// Print in Reverse
      static void reversePrint(SinglyLinkedListNode head) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        SinglyLinkedListNode node = head;

            // arrList.add(head.data);
            while(node != null){
                arrList.add(node.data);
                node = node.next;
            }
            Collections.reverse(arrList);
        
            for(Integer i:arrList){
                System.out.println(i);
            }
        

    }


    // Reverse a linked list
     static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode node = head;
        SinglyLinkedListNode nodeNext, nodeCurrent;

        node = head;
        
        if(node == null){
            return null;
        }
        
        nodeCurrent = node.next;
        node.next = null;
        while(nodeCurrent != null){
            nodeNext = nodeCurrent.next;
            nodeCurrent.next = node;
            node = nodeCurrent;
            nodeCurrent = nodeNext;
        }
        return node;
    }


    // Compare two linked lists
        static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        
        SinglyLinkedListNode node1 = head1;
        SinglyLinkedListNode node2 = head2;
        while(node1 != null && node2 != null){
            if(node1.data != node2.data){
                return false;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        if(node1 == null && node2 == null){
            return true;
        }
        else{
            return false;
        }

    }