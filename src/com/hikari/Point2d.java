package com.hikari;

public class Point2d {
/* координата X */
        private double xCoord;
/* координата Y */
        private double yCoord;
/* Конструктор инициализации */
        public Point2d ( double xCoord, double yCoord) {

            this.xCoord = xCoord;
            this.yCoord = yCoord;
        }
/* Конструктор по умолчанию */
        public Point2d () {
//Вызовите конструктор с двумя параметрами и определите источник.
            this(0, 0);
        }
/* Возвращение координаты X */
        public double getX () {
            return xCoord;
        }
/* Возвращение координаты Y */
        public double getY () {
            return yCoord;
        }
/* Установка значения координаты X */
        public void setX ( double val) {
            xCoord = val;
        }
/* Установка значения координаты Y */
        public void setY ( double val) {
            yCoord = val;
        }
/* Этот метод сравнивает попарно координаты х и у двух объектов Point2d и возвращает результат сравнения */
         public boolean similarity_2d (Point2d second_object){
            boolean rezult = false;
            // <this.> указывает на то, что берется значения ОБЪЕКТА, который вызвал этот метод similarity_2d
            if ((this.xCoord == second_object.xCoord) & (this.yCoord == second_object.yCoord))
                rezult = true;
             /* Если возвращается true, то координаты двух объектов по x,y равны между собой */
            return rezult;
        }
}
