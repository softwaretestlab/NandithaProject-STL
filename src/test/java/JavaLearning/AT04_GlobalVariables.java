package JavaLearning;

import org.junit.Test;

public class AT04_GlobalVariables {
//global variables
    int i=10;
    int j=20;
    String MyName = "SoftwareTestLab";

    @Test
    public void test05(){
        //local variables
        int m =20;
        int x = m+j; //40
        System.out.println("Value of X is : "+x);
    }

    @Test
    public void test06(){
     int k = i+j;
        System.out.println("Value of K is : "+ k);
        System.out.println("MyName is : "+ MyName);
    }
}
