package org.example;

import java.time.LocalTime;
import java.util.Map;

/**
 * Hello Esmira!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello Esmira!");

        System.out.println(LocalTime.now());

        Map<String, String> env = System.getenv();
        env.keySet().stream().map(key -> key + " = " + env.get(key)).forEach(System.out::println);
    }
}

/*
1 В ранее склонированном репозитории одногруппника в новой ветке создайте новый метод в классе Main,
 который (выберите один из списка):
выводит в консоль переменные окружения
создаёт файл, в который записывает текущую дату и время
скачивает картинку из интернета и сохраняет её на компьютере
2 Сделайте коммит изменений и запуште их.
3 Создайте пул-реквест на изменения.
4 Проведите код-ревью пул-реквеста, который выставили в Вашем репозитории.
 */