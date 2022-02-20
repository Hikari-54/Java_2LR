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
        // Реализую нахождение расстояние между двумя точками в трехмерном пространстве
        // нахожу квадраты разностей между координатами по x,y,z
        double sum_x = Math.pow((this.getX() - another_object.getX()), 2);
        double sum_y = Math.pow((this.getY() - another_object.getY()), 2);
        double sum_z = Math.pow((this.getZ() - another_object.getZ()), 2);
        // затем извлекаю квадратный корень из суммы резултатов предыдущих операций
        double dist = (Math.sqrt(sum_x + sum_y + sum_z));
        // в dist - расстояние между двумя точками в пространстве
        // ниже провожу округление. 100.0 - наличие <.0> очень важно. Если этого не будет, то вернется целое число
        // Так как будет проведена операция деления между двумя целыми числами
        dist = Math.round(dist * 100) / 100.0;
        return dist;
    }

}
