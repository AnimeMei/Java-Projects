/**
 * @Description: This test application is to
 * test the "PhoneNumber" class I created
 * @Date: Nov. 7 2015
 */
public class testerApp_Mei {
    public static void main(String [] args){

        //1st object jane with default phone number info
        PhoneNumber_Mei jane = new PhoneNumber_Mei();
        jane.printNumber();
        jane.printPhoneNumberStats();

        //2nd object sara with override phone number info
        PhoneNumber_Mei sara = new PhoneNumber_Mei(11,415,3986619,'C',2015);
        sara.printNumber();
        sara.printPhoneNumberStats();

        //3rd object sophia override number and type
        PhoneNumber_Mei sophia = new PhoneNumber_Mei(3236969,'B');
        sophia.printNumber();
        sophia.printPhoneNumberStats();

        //4th object stephani override area code, number and type
        PhoneNumber_Mei stephani = new PhoneNumber_Mei(610,3236969,'B');
        stephani.printNumber();
        stephani.printPhoneNumberStats();

    }
}
