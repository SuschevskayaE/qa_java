package ru.qajava.tests;

import com.example.Alex;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    @Mock
    Feline feline;

    @Test
    public void alexGetFriendsSuccess() {
        List<String> friends = List.of("Марти", "Глория", "Мелман");
        try {
            Alex alex = new Alex(feline);
            List<String> receivedFriends = alex.getFriends();
            Assert.assertEquals(receivedFriends,friends);
        }catch (Exception exception){
            System.out.println("Alex не найден");
        }
    }

    @Test
    public void alexGetPlaceOfLivingSuccess() {
        String place = "Нью-Йоркский зоопарк";
        try {
            Alex alex = new Alex(feline);
            String receivedPlace = alex.getPlaceOfLiving();
            Assert.assertEquals(receivedPlace,place);
        }catch (Exception exception){
            System.out.println("Alex не найден");
        }
    }

    @Test
    public void alexGetKittensSuccess(){
        int kittens = 0;
        try {
            Alex alex = new Alex(feline);
            int alexKittens = alex.getKittens();
            Assert.assertEquals(kittens,alexKittens);
        }catch (Exception exception){
            System.out.println("Alex не найден");
        }
    }



}
