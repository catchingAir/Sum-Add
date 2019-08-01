public class Main {

    public static void main(String[] args) {

        SumOdd sumOdd = new SumOdd();

        System.out.println(sumOdd.isOdd(-1));
        System.out.println();
        System.out.println(sumOdd.sumOdd(1,100));
        System.out.println(sumOdd.sumOdd(-1,100));
        System.out.println(sumOdd.sumOdd(100,100));
        System.out.println(sumOdd.sumOdd(13,13));
        System.out.println(sumOdd.sumOdd(100,-100));
        System.out.println(sumOdd.sumOdd(100,1000));
        System.out.println(sumOdd.sumOdd(10,5));


    }

}
