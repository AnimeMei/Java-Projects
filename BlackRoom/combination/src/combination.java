/**
 * @Description: Combination, nCr
 * @Date: Dec. 9 2015
 */

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class combination{

        static Scanner in = new Scanner(System.in);

        public static void main(String[] args){
            System.out.println("Enter the desired C(n,r)");
            System.out.print("n = ");
            int n = in.nextInt();
            System.out.print("r = ");
            int r = in.nextInt();

            System.out.println(combinationNR(n,r));
        }

        public static String bitprint(int u){
                String s = "";
                for(int n = 0; u > 0; ++n, u>>= 1)
                        if((u & 1) > 0) s+= n + " ";
                return s;
        }

        public static int bitcount(int u){
                int n;
                for(n= 0; u>0; ++n, u&=(u - 1));
                return n;
        }

        public static LinkedList<String> combinationNR(int n, int r){
                LinkedList<String> s= new LinkedList<String>();
                for(int u= 0;u < 1 << n;u++)
                        if(bitcount(u) == r) s.push(bitprint(u));
                Collections.sort(s);
                return s;
        }


}
