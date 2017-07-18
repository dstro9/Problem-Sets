import java.util.LinkedHashSet;

// Using LinkedHashSet to Remove Duplicates While Maintaining Item Order

class LinkedHashSetRemoveDuplicates {

   public static String[] unique(String[] filenames) {
       LinkedHashSet<String> uniqueFiles = new LinkedHashSet<String>();
       for(String filename: filenames)
           uniqueFiles.add(filename);
       return uniqueFiles.toArray(new String[0]);
   }

   public static void main(String[] args) {
       String[] dupNames = {"alice", "bob", "trudy", "bob", "alice"};
       for(String name: unique(dupNames))
           System.out.println(name);
   }
}


//Abstract classes, Subclasses, Overriding

class AbstractClass {

   abstract class Vessel {
       double contents;
       abstract double capacity();
       void fill(double amount) {
           contents = Math.min(contents + amount, capacity());
       }
   }

   class Tank extends Vessel {
       double length, width, height;
       Tank(double length, double width, double height) {
           this.length = length;
           this.width = width;
           this.height = height;
       }

       double capacity() {
           return length * width * height;
       }

       public String toString() {
           return "tank (" + length + ", " + width + ", " + height + ")";
       }
   }

   class Cube extends Tank {
       Cube(double side) {
           super(side, side, side);
       }

       public String toString() {
           return "cube (" + length + ")";
       }
   }

   class Barrel extends Vessel {
       double radius, height;
       Barrel(double radius, double height) {
           this.radius = radius;
           this.height = height;
       }

       double capacity() {
           return height * Math.PI * radius * radius;
       }

       public String toString() {
           return "barrel (" + radius + ", " + height + ")";
       }
   }
}
   

// Binary Search of Sorted Array, do not use java.util
class BinarySearchSortedArray {

    public static int binarySearch(double[] arr, double x) {
        int a = 0, b = arr.length - 1;

        while (a <= b) { // Loop invariant: arr[a-1] < x < arr[b+1]
            int i = (a + b) / 2;
            if (arr[i] < x)
                a = i + 1;
            else if (arr[i] > x)
                b = i - 1;
            else
                return i;   // because arr[i] == x
        }
        
        return -1;
    }

    public static void main(String[] args) {
        double[] arr = { 4, 5, 6, 7, 8, 10, 12, 14};
        System.out.println(binarySearch(arr, 6.0));
        System.out.println(binarySearch(arr, 9.0));
    }
}



// Enumeration with switch statement, determine days of each month
class SwitchOnEnum {
    enum Month {
        Jan(31), Feb(28), Mar(31), Apr(30), May(31), Jun(30),
        Jul(31), Aug(31), Sep(30), Oct(31), Nov(30), Dec(31);

        private final int days;
        private Month(int days) { this.days = days;}
        private static String days(Month m) {
            switch(m) {
                case Apr:case Jun:case Sep:case Nov:
                    return "30";
                case Feb:
                    return "28 for non leap, 29 for leap year.";
                default:
                    return "31";
            }
        }
    }

    public static void main(String[] args) {
        Month month=Month.Jun;
        System.out.println(Month.days(month));
    }
}
   



// Manual creation of LinkedList class, do not use java.util
class LinkedList{
    private Node head;
    private Node tail;
  
    public LinkedList(){
        this.head = new Node("head");
        tail = head;
    }
  
    public Node head(){
        return head;
    }
  
    public void add(Node node){
        tail.next = node;
        tail = node;
    }
  
    public static class Node{
        private Node next;
        private String data;

        public Node(String data){
            this.data = data;
        }
      
        public String data() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node next() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
      
        public String toString(){
            return this.data;
 }


