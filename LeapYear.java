public class LeapYear {

    public static void main(String[] args) {
        int year = 2021;

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Leap year "+year);
        }
        else{
            System.out.println("Not year "+year);
        }
    }
}
