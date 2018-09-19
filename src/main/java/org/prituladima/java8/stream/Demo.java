package org.prituladima.java8.stream;


import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @see "https://www.logicbig.com/tutorials/core-java-tutorial/java-util-stream/stream-api-intro.html"
 *
 * Stream operations are divided into intermediate and terminal operations, and are combined to
 * form stream pipelines. A stream pipeline consists of a source (such as a Collection, an array,
 * a generator function, or an I/O channel); followed by zero or more intermediate operations such as
 * Stream.filter or Stream.map; and a terminal operation such as Stream.forEach or Stream.reduce.
 */
public class Demo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("1", "2", "3");
        Stream<String> stream = list.stream();

        stream.forEach(System.out::println);


        String[] strs = {"1", "2", "3"};
        Stream<String> stream2 = Arrays.stream(strs);

        stream2.forEach(System.out::println);


        int[] ints = {1, 2, 3};
        IntStream stream3 = Arrays.stream(ints);
        stream3.forEach(System.out::println);


    }

}