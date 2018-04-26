import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 26.4.2018 г.
 * Time: 10:00 ч.
 */
public class _010SummationOfPrimes {

    public static void main(String[] args) {

        List<Integer> primes = new ArrayList<>();

        int n = 2;
        boolean isPrime = true;

        int thirdCount = 2;

        while (n < 2000000) {

            if (thirdCount == 3 && n != 3) {
                n++;
                thirdCount = 1;
                continue;
            }

            if (n != 5 && (String.valueOf(n).endsWith("0")
                    || String.valueOf(n).endsWith("5"))) {
                n++;
                thirdCount++;
                continue;
            }


            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes.add(n);
            }

            n++;
            thirdCount++;
            isPrime = true;
        }

        BigInteger result = BigInteger.ZERO;

        for (Integer prime : primes) {
            result = result.add(new BigInteger(String.valueOf(prime)));
        }

        System.out.println(result);
    }
}
