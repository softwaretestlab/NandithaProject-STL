package JavaLearning;

import org.junit.Test;

public class AT03_StringInt {

    @Test
    public void test03(){
        //Integers , here i is a variable
        //local variable-- meaning they can be used in this method (test03) only and cant be used in test04
        int i = 10;
        int j = 20;
        int k = i+j; //30
        System.out.println("Value of k is : "+k);
    }
    @Test
    public void test04(){
        //String , here test01 is a variable
        //local variable
        String test01 = "Software";
        String test02 = "Testlab";
        String test03 = test01+test02;
        System.out.println("Value of test03 is : "+test03);
    }
}
