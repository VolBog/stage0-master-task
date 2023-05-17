package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        System.out.println(firstSide + secondSide > thirdSide
                && secondSide + thirdSide > firstSide
                && thirdSide + firstSide > secondSide ? "this is a valid triangle" : "it's not a triangle");
    }

}
