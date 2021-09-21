

/*public class Main
     public static void main(String [] args) throws IOException {

        FileInputStream fileByteStream = null; // File input stream
        Scanner inputFile = null;                   // Scanner object
        fileByteStream = new FileInputStream("input.txt");

        inputFile = new Scanner(fileByteStream);
        readArray(inputFile);

        //You can reuse variable fileByteStream for another file
        fileByteStream = new FileInputStream("input2.txt");
        //You can reuse variable fileByteStream for another file
        inputFile = new Scanner(fileByteStream);
        //You can pass a Scanner to a method
        readStudents(inputFile);

    }
    public static void readArray(Scanner inputFile){
        int intArray[] = new int[4];
        int i = 0;
        while(inputFile.hasNext()){
            intArray[i] = inputFile.nextInt();
            System.out.println(intArray[i]);
            i++;
        }
        System.out.println("Done");

    }

    public static void readStudents(Scanner inputFile){
        Student studentArray[] = new Student [20];

        int i = 0;
        while(inputFile.hasNextLine()){
            studentArray[i] = new Student ();
            studentArray[i].setLastName(inputFile.next());

            studentArray[i].setId(Integer.parseInt(inputFile.next()));

            System.out.println(studentArray[i].getLastName());

            System.out.println(studentArray[i].getId());

            i++;
        }

        System.out.println("Done");`

    }
     */


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random(14);
        int[] ar = new int[20];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = rnd.nextInt(100) + 1;
        }
        System.out.println("Unsorted Set 1");
        print(ar);
        System.out.println();
        System.out.println("Bubblesort");
        bubbleSort(ar);
        print(ar);

        for (int i = 0; i < ar.length; i++) {
           ar[i] = rnd.nextInt(100) + 1;
       }
       System.out.println();
        System.out.println("Unsorted Set 2");
        print(ar);
        System.out.println();
       System.out.println("Insertion sort");
       insertionSort(ar);
       print(ar);

    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for(int j = i; j >0;j--){
                if(arr[j]<arr[j-1]) {
                    int hold = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = hold;
                }

            }
            /* int numToPlace = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > numToPlace) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = numToPlace;*/
        }
    }


    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int indexOfLargest = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                if (arr[j] > arr[j + 1]) {
                    indexOfLargest = j;

                }
            }
           /*swap
           int temp = arr[indexOfLargest];
           arr[indexOfLargest] = arr[arr.length - 1 - i];*/
        }
    }

    public static void print ( int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
