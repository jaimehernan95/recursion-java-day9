public class recursionDay9 {
    public static int Sumation(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + Sumation(n - 1);
        }
    }

    public static int Factotial ( int n) {

        if (n <=1 ) {
            return 1;
        }
        else {
            return n *  Factotial(n-1);
        }
    }

    public static int Exponentiation(int n, int p){

        if ( p <= 0) {
            return 1;
        }
        else {
            return n * Exponentiation(n, p-1);
        }
    }


  public static void main(String[] args) {
        // #to do code application

        System.out.println(Sumation(4));
        System.out.println(Factotial(4));
        System.out.println(Exponentiation(4,4));
    }
}
