package org.example;

import org.example.CheckArray;

// Реализуйте метод checkArray(Integer[] arr),
// принимающий в качестве аргумента целочисленный одномерный массив.
// Метод должен пройтись по каждому элементу и проверить что он не равен null.
// А теперь реализуйте следующую логику:
//
//        Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//        Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
public class Main {
    public static void main(String[] args) {
        CheckArray checkArray = new CheckArray(new Integer[]{null, 1, 3, 4, null});

        System.out.println(checkArray.checkOurArray());
    }
}
