
public class TestTime {
    public static void main (String [] args){
        Time firstTime = new Time(1,50);
        Time secondTime = new Time(2,34);
        Time thirdTime = new Time();

       firstTime.printTime();
        secondTime.printTime();
        thirdTime.printTime();

        //adding two of the Time objects
        thirdTime = firstTime.add(secondTime);
        thirdTime.printTime();

        thirdTime.add(8);
        thirdTime.printTime();



    }
}
