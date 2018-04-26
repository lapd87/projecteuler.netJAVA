/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 26.4.2018 г.
 * Time: 09:23 ч.
 */
public class _009SpecialPythagoreanTriplet {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;

        boolean isFound = false;
        int sum = 1000;

        for (int i = c; i <= sum - b - c; i++) {

            for (int j = b; j <= sum - a - c; j++) {

                for (int k = c; k <= sum - a - b; k++) {

                    if (a + b + c == sum
                            && Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                        isFound = true;
                        break;
                    }

                    c++;
                }
                if (isFound) {
                    break;
                }

                b++;
                c = b + 1;
            }
            if (isFound) {
                break;
            }

            a++;
            b = a + 1;
            c = b + 1;
        }

        System.out.println(a * b * c);
    }
}

