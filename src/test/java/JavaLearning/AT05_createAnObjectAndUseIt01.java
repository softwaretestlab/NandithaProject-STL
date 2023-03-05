package JavaLearning;

import org.junit.Test;

public class AT05_createAnObjectAndUseIt01 {

    @Test
    public void test07(){
        // using classname we create an object Ex: obj
        // using this  object (obj) we call methods test08,test09 inside test07
        System.out.println("This is Method test-07");
        AT05_createAnObjectAndUseIt01 obj = new AT05_createAnObjectAndUseIt01();
        obj.test08(); //20
        obj.test09();  //SoftwareTestLab

    }

    public void test08(){
        //declare local variables
        int i =10;
        int j =20;
        int k =i+j;
        //print on console
        System.out.println("value of k is : "+k); //20
    }

    public void test09(){
        //declare local variables
        String test01 = "Software";
        String test02 = "TestLab";
        String test03 = test01 + test02;

        System.out.println("value of Test03 is : " + test03); //SoftwareTestLab
    }
}
