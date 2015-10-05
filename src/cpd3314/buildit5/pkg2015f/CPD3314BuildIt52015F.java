/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd3314.buildit5.pkg2015f;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author c0587637
 */
public class CPD3314BuildIt52015F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        outputRecord();
        sayHi("Len", 4);
        mashup("Hello", "World");
        int valuePlusTwo = addTwo(2);

        double area1 = sphereArea(4);
        double area2 = sphereArea(100);
        double area3 = sphereArea(11111);
        System.out.println(area1);
        System.out.println(area2);
        System.out.println(area3);
        System.out.println("Area of Cylinder 3x4 = " + cylinderArea(3, 4));
    }

    /**
     * Outputs a Student Record
     */
    public static void outputRecord() {
        System.out.println("First Name: Len");
        System.out.println("Last Name: Payne");
        System.out.println("College: Lambton College");
    }

    /**
     * Outputs 'Hi' to a specific name
     * @param name the name to greet
     */
    public static void sayHi(String name) {
        System.out.println("Hi " + name + "!");
    }

    /**
     * Outputs 'Hi' to a specific name, a specific number of times
     * @param name the name to greet
     * @param max the number of times to greet them
     */
    public static void sayHi(String name, int max) {
        for (int i = 0; i < max; i++) {
            sayHi(name);
        }
    }

    /**
     * Mash up two strings together in an ABAB pattern
     * @param a the first string
     * @param b the second string
     */
    public static void mashup(String a, String b) {
        System.out.println(a + b + a + b);
    }

    /**
     * Adds two to a value and returns it
     * @param x the original value
     * @return the original value, plus two
     */
    public static int addTwo(int x) {
        return x + 2;
    }

    /**
     * Provides the surface area for a sphere of a given radius
     * @param radius the radius of the sphere
     * @return the surface area of the sphere
     */
    public static double sphereArea(double radius) {
        return 4 * Math.PI * radius * radius;
    }

    /**
     * Provides the surface area of a cylinder with a given radius and height
     * @param r the radius of the cylinder
     * @param h the height of the cylinder
     * @return the surface area of the cylinder
     */        
    public static double cylinderArea(double r, double h) {
        return 2 * Math.PI * r * h + 2 * Math.PI * r * r;
    }
}
