
/*
 * Write a Java program to print the following columns of values. Use \t for the tabs between the columns.
 * Cost      Quantity   Total
 * $1,000.00   4       $4,000.00
 * $   50.00   8         $400.00
 * ______________________________
 * TOTAL:      12      $4,400.00
 *
 */

public class EscapeSequences2 {
    public static void main(String[] arg){
        System.out.println("Cost\tQuantity\tTotal");
        System.out.println("$1,000.00\t4\t\t$4,000.00");
        System.out.println("$   50.00\t8\t\t  $400.00");
        System.out.println("______________________________");
        System.out.println("TOTAL:\t\t12\t\t$4,400.00");
    }

}
