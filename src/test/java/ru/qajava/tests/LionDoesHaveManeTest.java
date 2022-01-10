package ru.qajava.tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class LionDoesHaveManeTest {

    private String sex;
    private boolean hasMane;

    public LionDoesHaveManeTest(String sex, boolean hasMane){
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getCountKittens(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    Feline feline = Mockito.mock(Feline.class);

    @Test
    public void lionDoesHaveManeSuccess(){
        try {
            Lion lion = new Lion(sex, feline);
            boolean mane = lion.doesHaveMane();
            Assert.assertEquals(mane, hasMane);
        }catch (Exception exception){
            System.out.println("Lion не найден");
        }
    }
}
