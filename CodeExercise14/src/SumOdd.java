public class SumOdd {

    public static boolean isOdd(int number) {

        if(number > 0 && number % 2 != 0) {
            return true;
        }


        return false;
    }

  /*  public static int sumOdd(int start, int end) {
        int sum=0;

        if((start > 0) && (end > 0) && (end >= start)) {
            for (int x = start; x <= end; x++) {

                if (isOdd(x) == true) {
                    sum += x;
                }
            }
            return sum;
        } else {
            return -1;
        }

    }  */

    public static int sumOdd(int start, int end) {
        int sum=0;

            for (int x = start; x <= end; x++) {
                if((start > 0) && (end > 0) && (end >= start)) {
                    if (isOdd(x) == true) {
                        sum += x;
                    }
                } else {
                    return -1;
                }
            }
            return sum;
        }

}
