package com.playground.streams.numeric;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsMapExample {

  public static List<Integer> mapToObj() {
    return IntStream.rangeClosed(1, 5).mapToObj(i -> new Integer(i)).collect(Collectors.toList());
  }

  public static long mapToLong() {
    return IntStream.rangeClosed(1, 5)
        .mapToLong(i -> i) // converts IntStream to a LongStream
        .sum();
  }

  public static double mapToDouble() {
    return IntStream.rangeClosed(1, 5)
        .mapToDouble(i -> i) // converts IntStream to a DoubleStream
        .sum();
  }

  public static void main(String[] args) {
    System.out.println("mapToObj: " + mapToObj());
    System.out.println("mapToLong: " + mapToLong());
    System.out.println("mapToDouble: " + mapToDouble());
  }
}
