/**
 * @Description: Write a function/procedure/algorithm that
 * computes the sum of all even-valued fibonnaci terms
 * less than or equal to some positive integer k.
 * @Date: Oct. 18 2015
 */
public class ZhipengMei_Evenfibonnacisum_400 {

    public static void main(String[] args) {

        //set some integer k to 40
        int k = 400;
        //initialize sum to 0
        long sum = 0;

        //sequence start with position 0=1, position 1=1
        //based on Programming Project 1 instruction
        long[] series = new long [k];
        series[0] = 1;
        series[1] = 1;

        //for loop start i position at 2, it will keep on going forever
        //until something tells it to stop
        for(int i=2; i>1; i++ ){

            //figuring out the ith value from previous two terms
            series[i] = series[i-1] + series[i-2];

            //testing even values
            if((series[i] % 2)==0){
                //if the even value is less than k
                if(series[i]<=k){
                    //add up all the even values that is less than k
                    sum += series[i];
                    //printing out the values that is less than k
                    System.out.println(series[i]);
                }
                else{
                    //if the even values is more than k
                    //the loop will stop
                    break;
                }
            }
        }
        //printing out the sum of all added values within the k range
        System.out.println("The sum of all even-valued fibonnaci terms "
                         + "less than or equal to " + k + " is " + sum + ".");
    }

}
