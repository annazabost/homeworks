
import java.util.ArrayList;

public class Program {

    public static boolean isPrime(int num) {


        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        boolean result = false;
        int numberOfPrime = primeNumbers.size();
        if (num == 1) {
            result = false;
        } else {

            for (Integer i = 2; i <= num; i++) {

                //System.out.println("To jest i: " + i);
                boolean helpNumber = true;
                for (int j = 0; j < numberOfPrime; j++) {

                    //System.out.println("To jest j: " + j);

                    if (i % primeNumbers.get(j) == 0) {
                        // System.out.println("Break " + primeNumbers.get(j));
                        helpNumber = false;
                        break;
                    }

                }

                if (helpNumber) {
                    // System.out.println("HelpNumber " + i);
                    primeNumbers.add(primeNumbers.size(), i);
                    //System.out.println("ArrayList: " + primeNumbers.get(primeNumbers.size()-1));
                }

            }
        }
        for (int i = 0; i <= primeNumbers.size() - 1; i++) {
            //System.out.println("Liczba pierwsza: " + primeNumbers.get(i));
            if (num == primeNumbers.get(i)) {
                result = true;
            }
        }


        return result;
    }

}
