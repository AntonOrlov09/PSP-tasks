import Task1.BaseConverter;
import Task2.MapSwapper;
import Task3.ArrayIterator;
import Task4.DuplicateWiper;
import Task5.ArrayInstaller;
import Task5.FunctionImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Task1-----------------------------------Task1");
        System.out.print("Enter degrees Celsius: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double celsius = Double.parseDouble(reader.readLine());
        BaseConverter baseConverter = new BaseConverter();
        System.out.printf("Celsius = %f; Kelvin = %f\n", celsius, baseConverter.convertToKelvin(celsius));
        System.out.printf("Celsius = %f; Fahrenheit = %f\n", celsius, baseConverter.convertToFahrenheit(celsius));
        System.out.println("");

        System.out.println("Task2-----------------------------------Task2");
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("five", 5);
        MapSwapper mapSwapper = new MapSwapper();
        System.out.println(mapSwapper.swap(map));
        System.out.println("");

        System.out.println("Task3-----------------------------------Task3");
        String[] array = new String[]{"one", "two", "five", "ten"};
        ArrayIterator<String> iterator = new ArrayIterator<>(array);
        while (iterator.hasNext()) {
            System.out.printf("%s\n", iterator.next());
        }
        System.out.println("");

        System.out.println("Task4-----------------------------------Task4");
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abc");
        list.add("ss2");
        list.add("ss2");
        DuplicateWiper<String> duplicateWiper = new DuplicateWiper<>();
        duplicateWiper.removeDuplicate(list);
        System.out.println(list);
        System.out.println("");

        System.out.println("Task5-----------------------------------Task5");
        int[] array5 = new int[10];
        ArrayInstaller arrayInstaller = new ArrayInstaller();
        arrayInstaller.fill(array5, new FunctionImpl());
        System.out.println(Arrays.toString(array5));
    }
}