//***************************************************************
// Lab 5		
// Class: CS 111C		Date:	 5/16/16
//***************************************************************
public abstract class KeyedItem<KT extends Comparable<? super KT>> {

    private KT searchKey;

    public KeyedItem(KT key) {
        searchKey = key;
     }  // end constructor

    public KT getKey() {
        return searchKey;
    } // end getKey

} // end KeyedItem
