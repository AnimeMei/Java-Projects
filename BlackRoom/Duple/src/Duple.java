
public class Duple {
    //storage of duple values
    private int val1;
    private int val2;

    public Duple(){
        val1 = 0;
        val2 = 0;
    }

    public Duple(int value){
        val1 = value;
        val2 = value;
    }

    //needs to fix
    public Duple(int val1, int val2){
        this.val1 = val1;
        this.val2 = val2;
    }

    //getters
    public int get1(){
        return this.val1;
    }

     public int get2(){
        return this.val2;
    }

     //setters
     public void set1(int val1){
         this.val1 = val1;
     }
     public void set2(int val2){
         this.val2 = val2;
     }

     public Duple add(Duple other){
        Duple temp = new Duple();
        temp.val1 = val1+ other.val1;
        temp.val2 = val2+ other.val2;
        return temp;

     }

    public Duple add(int other){
        Duple temp = new Duple();
        temp.val2 = val2 + other;
        return temp;
    }

    public Duple diff(Duple other){
        Duple temp;
        temp = new Duple();
        temp.val1 = val1 - other.val1;
        temp.val2 = val2 - other.val2;
        return temp;
    }

    public boolean equals(Duple other){
        if(this.val1 == val1 && this.val2==val2){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean greater(Duple other){
        if(this.val1 > val1 && this.val2 > val2){
            return true;
        }
        else{
            return false;
        }
    }

    public void printDuple(){
        System.out.println("Val1: " + get1() + " , Val2: " + get2()+"\n");
    }
}
