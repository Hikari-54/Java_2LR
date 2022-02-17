package com.hikari;
// Ключевое слово extends указывает на то, что данный класс
// будет наследовать все свойства класса Point2d
public class Point3d extends Point2d{
    /* координата X */
    private double xCoord;
    /* координата Y */
    private double yCoord;
    /* координата Z */
    private double zCoord;
    // Конструктор инициализации
    public Point3d (double x, double y, double z){
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    // Конструктор по умолчанию
    public Point3d () {
        this (0, 0, 0);
    }

    // Переопределение этого метода getX необходимо, чтобы он выводил
    // переменную xCoord именно из этого класса
    // В противном случае он будет выводить значения xCoord по умолчанию из родительского класса
    public double getX () {
        return xCoord;
    }
    // Переопределяем getY по той же причине, что и getX
    public double getY () {
        return yCoord;
    }
    /* Возвращение координаты Z */
    public double getZ () {
        return zCoord;
    }

    public void setZ (double val){
        zCoord = val;
    }
}
