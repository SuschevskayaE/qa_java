package ru.qajava.tests;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void catGetFoodSuccess() throws Exception{
        List<String> food = List.of("Животные", "Птицы", "Рыба");
            Mockito.when(feline.eatMeat()).thenReturn(food);
            Cat cat = new Cat(feline);
            List<String> receivedFood = cat.getFood();
            Assert.assertEquals(receivedFood,food);
    }

    @Test
    public void catEatMeatSuccess() {
        String sound = "Мяу";
        Cat cat = new Cat(feline);
        String receivedSound = cat.getSound();
        Assert.assertEquals(receivedSound, sound);
    }
}
