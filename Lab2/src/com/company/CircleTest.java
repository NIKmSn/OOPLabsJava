package com.company;

import java.io.IOException;

public class CircleTest
{

    public static void main(String[] args)
    {
        Circle circle = new Circle();
        System.out.print("Введите радиус окружности: ");
        try
        {
            circle.SetRadius(System.in.read());
            System.out.print('\n');
            System.out.println(String.format("Площадь круга: %.4f", circle.GetArea()));
            System.out.println(String.format("Длина окружности: %.4f", circle.GetLength()));
            System.out.println(String.format("Диаметр: %.4f", circle.GetDiameter()));
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
