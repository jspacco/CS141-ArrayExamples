//Array Excercises;
public class ArrayExercises
{
    public static void main (String[] args){
        
        // use this space to test your code with method calls 
        // we've provided some calls for you, but you can add your own
        // your tests will not be graded and TAs may use an entirely different set of tests to grade your code
        // so do whatever testing you need/want to make sure your functions work correctly

        System.out.println("==============================================");
        searchAndRescue(new String[] {"Jaime", "David", "Rik", "Vera"}, "Vera");//answer: Jaime David Rik
        searchAndRescue(new String[] {"Jaime", "David", "Rik", "Vera"}, "BillGates");//answer: Jaime David Rik Vera
        System.out.println("==============================================");
        System.out.println(nthLargest(new double[] {0,1,2,3,4,5,6,7,8,9,10},5));//answer=6
        System.out.println("----------------------------------------------");
        System.out.println(nthLargest(new double[] {40,-40,0},1));//answer=40
        System.out.println("==============================================");
        System.out.println(returnMedian(new int[] {3,4,2,1,5}));//answer=3
        System.out.println("----------------------------------------------");
        System.out.println(returnMedian(new int[] {0,-999,5}));//answer=0
        System.out.println("==============================================");
        reverseArray(new char[] {'y','l','f','e','r','i','f'});//answer=firefly
        System.out.println("==============================================");
        fakeFibonacciFirstN(10); //answer=1 1 5 13 41 121 365 1093 3281 9841
        System.out.println("==============================================");
        pivotClockwise(new char[][] {   {'A','B','C','D'},
                                        {'E','F','G','H'},
                                        {'H','I','J','K'}});//answer=   HEA
        //                                                              IFB 
        //                                                              JGC 
        //                                                              KHD
        System.out.println("==============================================");
        drawFlagX(new char [20][80]); //sample solution is in a comment above the function
        System.out.println("==============================================");
        drawFlagXOXO(new char [20][40]); //sample solution is in a comment above the function
        System.out.println("==============================================");

    }
    
    //take in a 2D array and rotate it clockwise, just like rotating a Picture full of pixels
    //first row becomes last column, second row becomes second to last column, etc.
    public static void pivotClockwise (char [][] letters){//assume all rows have same number of cols
        
        //put your code here!
        
        printPattern(letters);
    }
    
    //turn the array backwards so that first character is last, last is first ("abcde" --> "edcba")
    public static void reverseArray (char[] characters){
        
        //put your code here!
        
        printRow(characters);
    }
    
    //create and return an array with the first n fake-Fibonacci numbers
    //similar to regular Fibonacci but fib(n)=fib(n-1)*2 + fib(n-2)*3
    //so each value is a sum of the previous two values, but with some multiplications
    // if 4th value is 13 and 5th value is 41, then 6th value is 41*2+13*3=121
    public static int[] fakeFibonacciFirstN (int n){//n > 2   (prev1*2+prev2*3)
       
        // put your code here!
        // the 1st and 2nd values are both 1, so put those at the front of your array at [0] and [1]
        
        return(new int [n]);//REPLACE THIS to return YOUR new array
    }

    //find the provided String person (assume at most one present) and remove them from the String array
    //return the array of only remaining people
    // NOTE: This is no easy way to remove something from an array. Make a new array and copy over only
    // the things
    public static String[] searchAndRescue (String[] people, String person){
        
        // put your code here!
        
        printRow(people);
        return people;
    }

    //return the n-th largest value in the array
    public static double nthLargest(double[] numbers, int n){
       
        //put your code here!
        
        printRow(numbers);
        return -999.999; //REPLACE THIS WITH THE N-TH LARGEST VALUE
    }

    //return the median value (i.e. the value at the middle point between lowest and highest values)
    //a sort or a partial sort would help
    //you can assume the length of the array will always be odd so there will always be a unique median
    public static int returnMedian(int [] numbers){
        
        //put your code here!
        
        printRow(numbers);
        return -999;//REPLACE THIS WITH YOUR FOUND MEDIAN VALUE

    }
    //---------------------------------------------------------------------------
    /* draw a bumerang full of X chars (requires a 2D array [a][4a])
    X
      X X
        X X X
          X X X X
            X X X X X
              X X X X X X
                X X X X X X X
                  X X X X X X X X
                    X X X X X X X X X
                    X X X X X X X X X
                  X X X X X X X X
                X X X X X X X
              X X X X X X
            X X X X X
          X X X X
        X X X
      X X
    X
    
    
    HINT: fill in a 2D array with a triangle of 'X' chars 
    
    X
    X X X
    X X X X X
    X X X X X X X
    X X X X X X X X X
    X X X X X X X X X X X
    X X X X X X X X X X X X X
    X X X X X X X X X X X X X X X
    X X X X X X X X X X X X X X X X X
    X X X X X X X X X X X X X X X X X
    X X X X X X X X X X X X X X X
    X X X X X X X X X X X X X
    X X X X X X X X X X X
    X X X X X X X X X
    X X X X X X X
    X X X X X
    X X X
    X
    
    then fill over some of these X values with a smaller traingle full of ' ' blank chars    
    */    
    public static void drawFlagX(char[][] flagPattern){

        //put your code here!
        
        printPattern(flagPattern);
    }


    /* draw and xoxo gossip girl flag within a 2D array [a][2a], 
       so we will only test this with 2D arrays with second dimmension being twice as large as the first dimmension;
       i.e. twice the number of columns than rows
     
    X
    XOX
    XOXOX
    XOXOXOX
    XOXOXOXOX
    XOXOXOXOXOX
    XOXOXOXOXOXOX
    XOXOXOXOXOXOXOX
    XOXOXOXOXOXOXOXOX
    XOXOXOXOXOXOXOXOXOX
    XOXOXOXOXOXOXOXOXOX
    XOXOXOXOXOXOXOXOX
    XOXOXOXOXOXOXOX
    XOXOXOXOXOXOX
    XOXOXOXOXOX
    XOXOXOXOX
    XOXOXOX
    XOXOX
    XOX
    X
     
    */
    public static void drawFlagXOXO(char[][] flagPattern){

        //put your code here!
        
        printPattern(flagPattern);
    }
    
    
    // THERE IS NOTHING FOR YOU TO DO BELOW (THERE ARE CALLS TO THESE METHODS ABOVE TO CREATE SOME OUTPUTS)
  
    //----------------------- PRINTING TESTER METHODS -------------------
    // you can use these to test your code; choose which works for your needs; 
    // the above functions already call these; you can always call them yourself throughout as well to debug your code
    // choose which works for your needs: are you printing chars? ints? doubles? one dimensional array or two?
    //      method call: <nameoffunction>(variableName) <-- this variable datatype has to match the parameter type for the function
    // some of the functions below are overloaded: multiple functions with same name but different parameter types; this is legit and 
    //      Java will figure out which you meant to use by the type of thing you pass into the call

    //print a 2D char array
    public static void printPattern(char[][] pattern){
        for (int r=0; r<pattern.length; r++){
            printRow(pattern[r]);
        }
    }

    //print a 1D char array
    public static void printRow(char[] pattern){
        for (int c=0; c<pattern.length; c++)
            System.out.print(pattern[c]);
        System.out.println();
    }

    //print a 1D double array
    public static void printRow(int[] pattern){
        for (int c=0; c<pattern.length; c++)
            System.out.print(pattern[c]+" ");
        System.out.println();
    }

    //print a 1D double array
    public static void printRow(double[] pattern){
        for (int c=0; c<pattern.length; c++)
            System.out.print(pattern[c]+" ");
        System.out.println();
    }

    //print a 1D String array
    public static void printRow(String[] pattern){
        for (int c=0; c<pattern.length; c++)
            System.out.print(pattern[c]+" ");
        System.out.println();
    }
}
