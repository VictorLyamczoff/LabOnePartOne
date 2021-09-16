package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * Класс <b>MainActivity</b> тестового приложения для первой лабораторной работы.
 * @author Виктор и Данил
 * @version 0.0.0.0.0.0.0.1
 */

public class MainActivity extends AppCompatActivity {

    /**
     * Функция нахождения максимума
     * @param inputArray массив в котором производится поиск
     * @return Возвращает максимальный элемент из массива
     */
    public int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){
            maxValue = inputArray[i];
        }
        }
        return maxValue;
    }

    /**
     * Функция нахождения минимума
     * @param inputArray массив в котором производится поиск
     * @return Возвращает минимальный элемент из массива
     */
    public int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int array[] = new int[]{10, 11, 88, 2, 12, 120};

        // Вызов метода getMax () для получения максимального значения
        int max = getMax(array);
        System.out.println("Maximum Value is: "+max);

        // Вызов метода getMin () для получения минимального значения
        int min = getMin(array);
        System.out.println("Minimum Value is: "+min);

    }

}