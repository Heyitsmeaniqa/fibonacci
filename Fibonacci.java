/**
 * The Fibonacci class generates and prints the Fibonacci series up to a given number of terms.
 */
public class Fibonacci
{
    public static void main(String[] args) {

        int a = 10;
        int firstnum = 0, secondnum = 1;
        System.out.println("Fibonacci Series till " + a + " terms:");
    
        for (int i = 1; i <= a; ++i) {
          System.out.print(firstnum + ", ");
    
          
          int nextnum = firstnum + secondnum;
          firstnum = secondnum;
          secondnum= nextnum;
        }
      }
    }
