//***************************************************************
// Lab 5		
// Class: CS 111C		Date:	 5/16/16
//***************************************************************
public class StringItem extends KeyedItem<String>{
    public StringItem (String item){
        super(item);
    }

    public String toString(){
        return getKey();
    }
} //end StringItem
