package ru.qajava.tests;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineGetKittensTest {
    private int countKittens;

    public FelineGetKittensTest(int countKittens){
        this.countKittens = countKittens;
    }

    @Parameterized.Parameters
    public static Object[][] getCountKittens(){
        return new Object[][]{
                //countKittens
                {0},
                {1},
                {3},
                {33},
                {1024}
        };
    }

    @Test
    public void felineGetKittensSuccess() {
        Feline feline = new Feline();
        int kittens = feline.getKittens(countKittens);
        Assert.assertEquals(kittens,countKittens);
    }
}
