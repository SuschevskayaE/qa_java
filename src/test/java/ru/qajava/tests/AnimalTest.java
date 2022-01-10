package ru.qajava.tests;

import com.example.Animal;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;

public class AnimalTest {

    @Test
    public void animalGetFoodHerbivoreSuccess(){
        List<String> food = List.of("Трава", "Различные растения");
        try {
            Animal animal = new Animal();
            List<String> receivedFood = animal.getFood("Травоядное");
            Assert.assertEquals(receivedFood,food);
        }catch (Exception exception){
            System.out.println("Animal не найдено");
        }
    }

    @Test
    public void animalGetFamilySuccess(){
        String family = "заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        try {
            Animal animal = new Animal();
            String receivedFamily = animal.getFamily();
            MatcherAssert.assertThat(receivedFamily, containsString(family));
        }catch (Exception exception){
            System.out.println("Animal не найдено");
        }
    }

    @Test
    public void animalGetFoodFalse(){
        String error ="";
        String except = "Травоядное или Хищник";
        try {
            Animal animal = new Animal();
            List<String> receivedFood = animal.getFood("Трава");
        }catch (Exception exception){
            error = exception.toString();
        }
        finally {
            MatcherAssert.assertThat(error, containsString(except));
        }
    }

}
