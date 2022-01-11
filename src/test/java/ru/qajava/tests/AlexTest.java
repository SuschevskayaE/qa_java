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
    public void alexGetFriendsSuccess() throws Exception{
        List<String> friends = List.of("Марти", "Глория", "Мелман");
            Alex alex = new Alex(feline);
            List<String> receivedFriends = alex.getFriends();
            Assert.assertEquals(receivedFriends,friends);

    }

    @Test
    public void alexGetPlaceOfLivingSuccess() throws Exception{
        String place = "Нью-Йоркский зоопарк";
            Alex alex = new Alex(feline);
            String receivedPlace = alex.getPlaceOfLiving();
            Assert.assertEquals(receivedPlace,place);
    }

    @Test
    public void alexGetKittensSuccess() throws Exception{
        int kittens = 0;
            Alex alex = new Alex(feline);
            int alexKittens = alex.getKittens();
            Assert.assertEquals(kittens,alexKittens);
    }



}
