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
            this(5, 6);
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

}
