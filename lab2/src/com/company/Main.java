package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //fill regular triangles
        List<Triangle> triangles = new ArrayList<>();
        triangles.add(new Triangle(1,1,1));
        triangles.add(new Triangle(2,1,1));
        triangles.add(new Triangle(3,4,5));
        triangles.add(new Triangle(2,2,3));
        triangles.add(new Triangle(-2,2,3));

        //fill isosceles triangles
        List<IsoscelesTriangle> triangles2 = new ArrayList<>();
        triangles2.add(new IsoscelesTriangle(1,1));
        triangles2.add(new IsoscelesTriangle(2,1));
        triangles2.add(new IsoscelesTriangle(5,6));

        // show info about all triangles
        triangles.forEach(t -> System.out.println(t.description()));
        triangles2.forEach(t -> System.out.println(t.description()));
        System.out.println();

        //find average area in "triangles"
        double midArea = triangles.stream().filter(Triangle::isValid)
                .collect(Collectors.averagingDouble(Triangle::getArea));

        //find smallest triangle by area in "triangles2"
        Optional<IsoscelesTriangle> smallest = triangles2.stream().filter(Triangle::isValid)
                .min(Comparator.comparing(IsoscelesTriangle::getArea));

        System.out.println("=========================");
        System.out.println("Average area = " + midArea);
        System.out.println();
        System.out.println("Smallest Isosceles Triangle: " + (smallest.isPresent()
                ? "(area = " + smallest.get().getArea() + ")" + smallest.get().description()
                : "Not found"));

    }
}
