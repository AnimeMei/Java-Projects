
public class Recursive_Payment {

    public static void Recursive_Payment (int totalDays){
        int totalPay = 1;
        int pay = 1;
        int day = 1;
        Recursive_Payment(1,totalDays, day, totalPay);
    }

    private static void Recursive_Payment(int pay, int totalDays,int day, int totalPay ){

        if (totalDays > 0){
                System.out.println("Day " + day + ": Your paycheck is " + pay + " cents");
                pay = pay * 2;
                totalDays = totalDays-1;
                day++;
                Recursive_Payment(pay,totalDays, day, totalPay );
        }
    }
}
