package Cricketer;

public class Cricketer {

    // static variable initialization
    static int country_id;
    static String country_name;

    // instance variable initialization
    int jersy_no;
    String name;

    public static void main(String[] args) {

        System.out.println("---------------------Main method Start here!------------------");
        System.out.println("---------------Object 1 info-------------");

        Cricketer p1 = new Cricketer();

        country_id = 91;
        country_name = "India";

        p1.jersy_no = 18;
        p1.name = "Virat Kohli";

        System.out.println("Country_id : " + country_id);
        System.out.println("Country_name : " + country_name);
        System.out.println("Jersey_no : " + p1.jersy_no);
        System.out.println("Name : " + p1.name);
        
        
        System.out.println("---------------Object 2 info-------------");
        Cricketer p2 = new Cricketer();
        p2.jersy_no = 7;
        p2.name = "Mahindra Singh Dhoni";

        System.out.println("Country_id : " + country_id);
        System.out.println("Country_name : " + country_name);
        System.out.println("Jersey_no : " + p2.jersy_no);
        System.out.println("Name : " + p2.name);
        
        System.out.println("---------------Object 3 info-------------");
        Cricketer p3 = new Cricketer();
        p3.jersy_no = 9;
        p3.name = "Ishan Kishan";

        System.out.println("Country_id : " + country_id);
        System.out.println("Country_name : " + country_name);
        System.out.println("Jersey_no : " + p3.jersy_no);
        System.out.println("Name : " + p3.name);
        
        
        System.out.println("---------------------Main method End here!------------------");
    }
}