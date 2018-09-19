package org.prituladima.java8.stream;

import java.time.LocalTime;
import java.util.stream.IntStream;

public class LazyEvaluation {

    public static void main(String[] args) {

        IntStream stream = IntStream.range(1, 5);

        stream = stream.peek(i -> log("starting", i))
                .filter(i -> {
                    log("filtering", i);
                    return i % 2 == 0;
                })
                .peek(i -> log("post filtering", i));

        log("Invoking terminal method count.");
        log("The count is", stream.count());

        log("--------------");

        IntStream stream2 = IntStream.range(1, 5).parallel();
        stream2 = stream2.peek(i -> log("starting", i))
                .filter(i -> {
                    log("filtering", i);
                    return i % 2 == 0;
                })
                .peek(i -> log("post filtering", i));
        log("Invoking terminal method count.");
        log("The count is", stream2.count());

    }

    public static void log(Object... objects) {
        String s = LocalTime.now().toString();
        for (Object object : objects) {
            s += " - " + object.toString();
        }
        System.out.println(s);
        // putting a little delay so that we can see a clear difference
        // with parallel stream.
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
