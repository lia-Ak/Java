public class CharExamples {
    public static void main(String[] args) {
        char q = 't';
        char w = 169;
        char e = '\u00AE';


        System.out.println((char) (int) q);
        System.out.println((char) (q + w));
        System.out.println((char) (q - w));
        System.out.println((char) (q * w));
        System.out.println((char) (q / w));
        System.out.println((char) (q % w));

        char r = 'ܮ';
        int rInt = (int) r;
        System.out.println(rInt);

        char t = '9';
        int result = Integer.parseInt(String.valueOf(t));



        //String preResult = String.valueOf(t);
       //int result = Integer.parseInt(preResult);
       // System.out.println(preResult);
        System.out.println(result + 1);




       // System.out.println(preResult + 1);

      //  System.out.println(t + 1);

        char y = 'b';

       double result3 = Character.getNumericValue(y);
        System.out.println(result3 + 2);
    }
}
