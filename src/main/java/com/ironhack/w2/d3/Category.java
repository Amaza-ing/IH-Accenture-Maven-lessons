package com.ironhack.w2.d3;

public enum Category {
    BRONZE(1),
    SILVER(2),
    GOLD(3),
    PLATINUM(4),
    DIAMOND(5);

    public final int POINTS;

    Category(int POINTS) {
        this.POINTS = POINTS;
    }
}
