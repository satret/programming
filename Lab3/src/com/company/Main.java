package com.company;

import com.company.Character.Crystal;
import com.company.Character.Researcher;
import com.company.Character.Shorty;
import com.company.enums.Crystalsize;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Crystal Antilut = new Crystal ("АнтилутCrystalsize", Crystalsize.small);
        Shorty shorty = new Shorty("коротышка");
        Researcher researcher = new Researcher("Исследователи");
        shorty.eliminateweightlessness();
        researcher.SayPhrase();
    }
}