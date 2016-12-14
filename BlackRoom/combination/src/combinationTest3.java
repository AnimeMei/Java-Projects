
import java.util.Collections;
import java.util.LinkedList;

public class combinationTest3{

        public static void main(String[] args){
            System.out.println(combinationNR(5,2));
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
