/**
 * @Description: This class is to store phone number information
 * @Date: Nov. 7 2015
 */

public class PhoneNumber_Mei {

    private int countryCode;  //2 digits country code
    private int areaCode;     // 3 digits area code
    private int number;       //7 digits phone number
    private char type;        //'H','C,','B' for home, cell, or business line
    private int year;         //year that the entry was made


    //default contact info if nothing was entered
    public PhoneNumber_Mei(){
        setCountry(43);         //set the default country code to 43
        setArea(800);           //set the default are code to 800
        setNumber(8675309);     //set the default number to 8675309
        setType('H');           //set the default type to Home line
        setYear(1981);          //set the default year to 1981
    }

    //overide all the default with the user's entries
    public PhoneNumber_Mei(int ccode, int acode, int num, char ctype, int iyear){
        countryCode = ccode;    //overide the default countrycode to ccode
        areaCode = acode;       //overide the default area code to acode
        number = num;           //overide the default number to num
        type = ctype;           //overide the default line type to ctype
        year = iyear;           //overide the default year to iyear
    }

    //overide just two parametes
    public PhoneNumber_Mei(int num, char ctype){
        setCountry(43);         //set the default country code to 43
        setArea(800);           //set the default are code to 800
        number = num;           //overide the default number to num
        type = ctype;           //overide the default line type to ctype
        setYear(1981);           //set the default year to 1981
    }

     //overide just three parametes
    public PhoneNumber_Mei(int acode, int num, char ctype){
        setCountry(43);         //set the default country code to 43
        areaCode = acode;       //overide the default area code to acode
        number = num;           //overide the default number to num
        type = ctype;           //overide the default line type to ctype
        setYear(1981);          //set the default year to 1981
    }

    //mutating countryCode
    public void setCountry(int ccode){
        countryCode = ccode;
    }

    //mutating areaCode
    public void setArea(int acode){
        areaCode = acode;
    }

    //mutating number
    public void setNumber(int num){
        number = num;
    }

    //mutating type
    public void setType(char ctype){
        type = ctype;
    }

    //mutating year
    public void setYear(int yr){
        year = yr;
    }

    //returning final countryCode
    public int getCountry(){
        return countryCode;
    }

    //returning final  areacode
    public int getArea(){
        return areaCode;
    }

    //returning final  number
    public int getNumber(){
        return number;
    }

    //returning final type
    public char getType(){
        return type;
    }

    public int getYear(){
        return year;
    }

    //printing out just areacode and number
    public void printNumber(){
        System.out.println("(" + getArea() + ")" + getNumber());
    }

    //printing out all contact details
    public void printPhoneNumberStats(){
        System.out.println("+"+getCountry() + " ("+ getArea() + ")"+getNumber() + " "+getType() + " "+getYear() +"\n");
    }

}
