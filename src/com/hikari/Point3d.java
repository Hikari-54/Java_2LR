package com.hikari;
// Класс DecimalFormat позволяет задать формат вывода чисел с плавающей точкой (сколько знаков после запятой, например)
import java.text.DecimalFormat;

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
    public boolean similarity_3d (Point3d second_object){
        // Строка ниже попарно сравнивает координаты ВЫЗВАВШЕГО этот метод ОБЪЕКТА (на это указывает <this.>) по х,у
        // и второго объекта (second_object), который передается как входной аргумент
        boolean rezult_xy = this.similarity_2d(second_object);
        // Затем я сравниваю координаты двух объектов по z
        boolean rezult_z = this.zCoord == second_object.zCoord;
        // Перемножаю результаты сравнения по x,y и z. Если все координаты двух объектов попарно равны
        // то вернется true. В обратном случае - false
        if (rezult_xy & rezult_z == true)
            return true;
        else
            return false;
    }
    public double distanceTo(Point3d another_object){
        double x = 135.243;

        DecimalFormat hundredths = new DecimalFormat(".##");
        System.out.println(hundredths.format(x));


        return x;
    }

}
