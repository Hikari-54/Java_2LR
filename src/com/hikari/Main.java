package com.hikari;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Double.parseDouble(<строка>) приводит строковый тип данных к типу double
        // Ниже я создаю 3 объекта класса Point3d из входных аргументов командной строки
        Point3d first_point = new Point3d(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]));
        Point3d second_point = new Point3d(Double.parseDouble(args[3]), Double.parseDouble(args[4]), Double.parseDouble(args[5]));
        Point3d third_point = new Point3d(Double.parseDouble(args[6]), Double.parseDouble(args[7]), Double.parseDouble(args[8]));

        // Сравниваю координаты трех оъектов на равенство, чтобы избежать дальнейших ошибок
        boolean first_compare = first_point.similarity_3d(second_point);
        System.out.println("Равны ли координаты первой точки и второй точки? " + first_compare);
        boolean second_compare = second_point.similarity_3d(third_point);
        System.out.println("Равны ли координаты второй точки и третьей точки? " + second_compare);
        boolean third_compare = third_point.similarity_3d(first_point);
        System.out.println("Равны ли координаты третьей точки и первой точки? " + third_compare);

        // Если какая-то точка равна другой, то вычисления площади невозможны
        if ((first_compare | second_compare | third_compare) == false) {
            System.out.println("Площадь треугольника, образованного тремя точками, равна: ");
            System.out.println(computeArea(first_point, second_point, third_point));
        }
        else
            System.out.println("Вычисления площади невоможны, одна из точек равна другой");
    }

    public static double computeArea(Point3d first_object, Point3d second_object, Point3d third_object){
        // Вычисляю стороны треугольника как расстояние между тремя парами координат (a_side, b_side, c_side)
        // с помощью нестатического метода <Первый объект>.distanceTo(Второй объект)
        double a_side = first_object.distanceTo(second_object);
        double b_side = second_object.distanceTo(third_object);
        double c_side = third_object.distanceTo(first_object);
        // Вычисляю полупериметр для дальнейшего применения в формуле Герона
        double half_perimeter = (a_side + b_side + c_side) / 2;
        // нахожу площадь треугольника по формуле Герона
        double area_triangle = Math.sqrt(half_perimeter * (half_perimeter - a_side) * (half_perimeter - b_side) * (half_perimeter - c_side));
        // Округляю значение до звух знаков после запятой
        area_triangle = Math.round(area_triangle * 100) / 100.0;
        // возвращаю полученный результат
        return area_triangle;
    }
}
