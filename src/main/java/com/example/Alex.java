package com.example;

import java.util.List;

public class Alex extends Lion{

    private final Feline feline;

    public Alex(Feline feline) throws Exception {
        super("Самец", feline);
        this.feline = feline;
    }

    public List<String> getFriends(){
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens(){
        return feline.getKittens(0);

    }
}
