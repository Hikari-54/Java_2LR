package com.hikari;
// Ключевое слово extends указывает на то, что данный класс
// будет наследовать все свойства класса Point2d
public class Point3d extends Point2d{
    /* координата Z */
    private double zCoord;
    // Конструктор инициализации
    public Point3d (double xCoord, double yCoord, double zCoord){
        /* Очень важный момент, без которого наследование методов работать не будет
        Без использования super(xCoord, yCoord) все методы из класса Point2d будут вызывать
        значения переменных ИЗ СВОЕГО КЛАССА. А значит без использования super
        придется переопределять все методы и смысл наследования будет нулевым.  */
        super(xCoord, yCoord);
        this.zCoord = zCoord;
    }
    // Конструктор по умолчанию
    public Point3d () {
        this (0, 0, 0);
    }

    /* Возвращение координаты Z */
    public double getZ () {
        return zCoord;
    }
    /* Установка значения координаты Z */
    public void setZ (double val){
        zCoord = val;
    }
    /* Этот метод сравнивает попарно координаты х, у, z двух объектов Point3d и возвращает результат сравнения */
    public static boolean similarity_3d (Point3d first_object, Point3d second_object){
        // Поскольку я не могу получить непосредственный доступ к переменным xCoord, yCoord
        // то я вызову метод similarity_2d, который сравнит координаты по х и у между собой
        // и результат этого сравнения запишется в переменную rezult_xy
        boolean rezult_xy = similarity_2d(first_object, second_object);
        // Затем я сравниваю координаты двух объектов по z
        boolean rezult_z = first_object.zCoord == second_object.zCoord;
        // Перемножаю результаты сравнения по x,y и z. Если все координаты двух объектов попарно равны
        // то вернется true. В обратном случае - false
        if (rezult_xy & rezult_z == true)
            return true;
        else
            return false;
    }
}
