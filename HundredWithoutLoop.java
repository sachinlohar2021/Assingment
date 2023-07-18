public class HundredWithoutLoop {

    static int num = 1;
    public static void printNumbers(){

        if(num  <= 100){
            System.out.println(num);
            num++;
            printNumbers();
        }
    }

    public static void main(String[] args) {

        printNumbers();

    }

}
