package com.ironhack.w1.d4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

//        ABSTRACT CLASSES AND INTERFACES

        Player player = new WebPlayer(0.5, 1);
        WebPlayer webPlayer = new WebPlayer(0.3, 2);

        System.out.println(player.getCurrentTrack());
        System.out.println(webPlayer.getCurrentTrack());
        player.close();

        AndroidPlayer androidPlayer = new AndroidPlayer(0.8, 3);
        IPlayable androidPlayer2 = new AndroidPlayer(0.5, 4);
        androidPlayer.close();
        androidPlayer.play();
//        androidPlayer2.close(); // esto no se puede hacer porque es de tipo IPlayable
        androidPlayer2.play();


//        BIG DECIMAL

        System.out.println(1.2 - 1.0);
        BigDecimal bd1 = new BigDecimal("31.237234234");
        BigDecimal bd2 = new BigDecimal("12.345324503");

        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(bd2, RoundingMode.HALF_EVEN));
        System.out.println(bd1.setScale(2, RoundingMode.HALF_EVEN));
        System.out.println(bd1.compareTo(bd2));
        if (bd1.compareTo(bd2) > 0) System.out.println("bd1 es mayor");
        else if (bd1.compareTo(bd2) < 0) System.out.println("bd1 es menor");
        else if (bd1.compareTo(bd2) == 0) System.out.println("bd1 es igual a bd2");

    }
}
