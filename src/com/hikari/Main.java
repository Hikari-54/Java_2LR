package com.hikari;

public class Main {

    public static void main(String[] args) {

        Point3d test3d_1 = new Point3d(0, -3, 3);
        Point3d test3d_2 = new Point3d(3, 1, 3);

        System.out.println(test3d_1.getX());
        System.out.println(test3d_1.getY());
        System.out.println(test3d_1.getZ());

        System.out.println(test3d_1.equals(test3d_2));

        System.out.println(test3d_1.similarity_3d(test3d_2));


        System.out.println(test3d_1.distanceTo(test3d_2));
    }
}
