// Hello World
public class Solution {
	public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
		Scanner scan = new Scanner(System.in); 
		
		// Read a full line of input from stdin and save it to our variable, inputString.
		String inputString = scan.nextLine(); 

		// Close the scanner object, because we've finished reading 
        // all of the input from stdin needed for this challenge.
		scan.close(); 
      
		// Print a string literal saying "Hello, World." to stdout.
		System.out.println("Hello, World.");
      
	    // TODO: Write a line of code here that prints the contents of inputString to stdout.
        System.out.println(inputString);
	}
}

// Data types
public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
           /* Declare second integer, double, and String variables. */
        int i2;
        double d2;
        String s2;

        i2 = scan.nextInt();
        d2 = scan.nextDouble();
        scan.nextLine();
        s2 = scan.nextLine();

        System.out.println(i+i2);
        System.out.println(d+d2);
        System.out.println(s+s2);
            

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
   scan.close();
    }
}
/*
a b c
d e
f
g
The breakdown below shows how a certain sequence of calls to a Scanner object, , will read the above input:

A call to scan.next(); returns the next token, a.
A call to scan.next(); returns the next token, b.
A call to scan.nextLine(); returns the next token, c. It's important to note that the scanner returns a space and a letter, because it's reading from the end of the last token until the beginning of the next line.
A call to scan.nextLine(); returns the contents of the next line, d e.
A call to scan.next(); returns the next token, f.
A call to scan.nextLine(); returns everything after f until the beginning of the next line; because there are no characters there, it returns an empty String.
A call to scan.nextLine(); returns g.

*/

// Operators
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        in.close();
        
        double tip = meal_cost * tip_percent/100;
        double tax = meal_cost * tax_percent/100;
        
        double meal = meal_cost + tip + tax;
        int meal_final = (int) Math.round(meal); //Math.round() results in a Long value, therefore is casted to int
        
        System.out.println("The total meal cost is "+meal_final+" dollars.");
    }
}

// Intro to Conditional Statements
public class Solution {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n%2==1){
         ans = "Weird";
      }
      else{
         // Complete the code 
          if(6<=n && n<=20){
              ans = "Weird";
          }
          else{
              ans = "Not Weird";
          }
      }
      System.out.println(ans);
   }
}


// Class vs. Instance
public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
        if(initialAge < 0){
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        else{
            this.age = initialAge;
        }
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        String ageStatus;
        if(this.age < 13){
            ageStatus = "You are young.";
        }
        else if(this.age < 18){
            ageStatus = "You are a teenager.";
        }
        else{
            ageStatus = "You are old.";
        }
        System.out.println(ageStatus);
	}

	public void yearPasses() {
  		// Increment this person's age.
        this.age++;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}

// Loops
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}

// Let's Review
// str.length(), str.charAt(i),str1=str2+str3
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String str,evenStr,oddStr;
        for(int i=0;i<t;i++){
            str = sc.nextLine();
            evenStr = "";
            oddStr = "";
            for(int j=0;j<str.length();j++){
                if(j%2 == 0){
                    evenStr = evenStr+str.charAt(j);
                }
                else{
                    oddStr = oddStr+str.charAt(j);
                }
            }
            System.out.println(evenStr + " " + oddStr);
        }
    }
}


// Arrays

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        scanner.close();
        
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}


// Dictionaries and Maps
class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap <String, Integer> phoneBook = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phoneBook.containsKey(s)){
                System.out.println(s+"="+phoneBook.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}


// Recursion 3
    static int factorial(int n) {
        if(n <= 1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }

    }


// Binary Numbers
    public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        int remain = n;
        int remainder;
        int count = 0;
        int max = 0;
        while (remain != 0) {
            remainder = remain % 2;
            remain = remain / 2;
            if(remainder == 1){
                count ++;
            }
            else{
                if(max < count){
                    max = count;
                }
                count = 0;
              
            }
            if(remain == 0){
               if(max < count){
                    max = count;
                } 
            }
        }
        System.out.println(max);
    }
}


// 2D Arrays
public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();
        
        int max = 0;
        int sum = 0;
        for(int i=0;i<arr.length-2;i++){
            for(int j=0;j<arr[i].length-2;j++){
                for(int k=0;k<=2;k++){
                    sum += arr[i][j+k];
                    sum += arr[i+2][j+k];
                }
                sum += arr[i+1][j+1];
                if(i==0 && j==0){
                    max = sum;
                }
                if(sum > max){
                    max = sum;
                }
                sum = 0;
            }
        }
        System.out.println(max);
    }
}

// Inheritance
class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}
class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int [] scores){
        super(firstName, lastName, id);
        this.testScores = scores;
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate(){
        int total = 0;
        for(int i=0;i<testScores.length;i++){
            total += testScores[i];
        }
        int avg = total/testScores.length;
        if(avg<40){
            return 'T';
        }
        else if(avg<55){
            return 'D';
        }
        else if(avg<70){
            return 'P';
        }
        else if(avg<80){
            return 'A';
        }
        else if(avg<90){
            return 'E';
        }
        else{
            return 'O';
        }
    }
}
class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}

// Abstract classes
abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}
class MyBook extends Book {
    
    // Declare the price instance variable
    private int price;
    
    /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    // Write your constructor here
    MyBook(String title, String author, int price){
        super(title, author);
        this.price = price;
    }
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    // Write your method here
    public void display(){
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Price: "+this.price);

    }
// End class
}
public class Solution {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}

// Linked List
class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
	public static  Node insert(Node head,int data) {
        //Complete this method
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node node;
            node = head;
            while(node.next != null){
                node = node.next;
            }
            node.next = newNode;
        }
        return head;
    }
    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}

