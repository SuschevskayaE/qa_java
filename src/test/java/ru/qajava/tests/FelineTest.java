package ru.qajava.tests;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void felineGetFamilySuccess() {
        String family = "Кошачьи";
        Feline feline = new Feline();
        String receivedFamily = feline.getFamily();
        Assert.assertEquals(receivedFamily,family);
    }

    @Test
    public void felineGetKittenSuccess() {
        int countKittens = 1;
        Feline feline = new Feline();
        int kittens = feline.getKittens();
        Assert.assertEquals(kittens,countKittens);
    }

    @Test
    public void felineEatMeatSuccess() {
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        try {
            Feline feline = new Feline();
            List<String> receivedFood = feline.eatMeat();
            Assert.assertEquals(receivedFood, food);
        }
        catch (Exception exception){
            System.out.println("Feline не найден");
        }
    }
}
