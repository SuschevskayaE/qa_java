package ru.qajava.tests;

import com.example.Feline;
import com.example.Lion;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.hamcrest.CoreMatchers.containsString;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void lionGetKittensSuccess(){
        String sex = "Самец";
        int countKittens = 2;
        Mockito.when(feline.getKittens()).thenReturn(countKittens);
        try {
            Lion lion = new Lion(sex, feline);
            int kittens = lion.getKittens();
            Assert.assertEquals(countKittens,kittens);
        }catch (Exception exception){
            System.out.println("Lion не найден");
        }
    }

    @Test
    public void lionGetFoodSuccess(){
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        String sex = "Самка";
        try {
            Mockito.when(feline.getFood("Хищник")).thenReturn(food);
            Lion lion = new Lion(sex, feline);
            List<String> receivedFood = lion.getFood();
            Assert.assertEquals(receivedFood ,food);
        }catch (Exception exception){
            System.out.println("Lion не найден");
        }
    }

    @Test
    public void lionDoesHaveManeFalse(){
        String sex = "Сам";
        String error ="";
        String except = "Используйте допустимые значения пола животного - самец или самка";
        try {
            Lion lion = new Lion(sex, feline);
        }catch (Exception exception){
            error = exception.toString();
        }
        finally {
            MatcherAssert.assertThat(error, containsString(except));
        }
    }
}
