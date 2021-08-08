import java.util.*; // import all the Java classes in java.util Package
public class SameNumberRowWise
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int rows = scan.nextInt(); // take input for number of rows
        
        // outer for-loop to control
        for(int i = 1; i <= rows; i++){
            // inner for-loop to print 1 until limit
            for(int j = 1; j <= i; j++){
                System.out.print("1");
            }
            // go to next line after each iteration
            System.out.println();
        }
    }
}
