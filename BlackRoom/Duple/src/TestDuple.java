
public class TestDuple {
	  public static void main(String args[]) {

    Duple a, b, c, d, e, f;
    a = new Duple();
    b = new Duple(10);
    c = new Duple(3, 6);

    a.printDuple();
    b.printDuple();
    c.printDuple();

    d = a.add(b);
    if (d.equals(b)){
        System.out.println("The Duples are equal.");
    }
    else{
        System.out.println("The Duples are not equal.");
        }


    e = c.add(4);
    e.printDuple();

    f = c.diff(e);
    if (f.greater(e)){
       System.out.println("The Duples are equal.");
    }
    else{
        System.out.println("The Duples are not equal.");
     }


    a.set1(7);
    a.set2(11);
    a.printDuple();

    System.out.println("f.val1 = " + f.get1());
    System.out.println("f.val2 = " + f.get2());

  }
};
