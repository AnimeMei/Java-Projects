
public class Time {
    private int hours;
    private int mins;

    public Time(){
        hours = 0;
        mins = 0;
    }

    public Time(int hrs, int min){
        hours = hrs;
        mins = min;
        if(mins > 60){
            mins = mins - 60;
            hours++;
        }//end if
    }

    public int getMin(){
        return mins;
    }

    //not sure what am I doing
    public Time add(Time time){
        time.hours = this.hours + time.hours;
        time.mins = this.mins + time.mins;
        return time;
    }

    public int add(int val){
        hours = hours + val;
        return hours;
    }

    public void printTime(){
        System.out.println(hours + ":" + mins);
    }


}
