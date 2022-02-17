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
}
