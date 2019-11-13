package lt.bit.java.day21.streams;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class StreamsMain {

  public static void main(String[] args) {
    List<String> strings = Arrays.asList("ab", "abc", "bbc", "zav");

    // iteravimas ir spausdinimas su lambdom
    strings.forEach(s -> System.out.print(s + " "));
    System.out.println();
    strings.forEach(s -> {
      int i = 1;
      System.out.print(s + i + " ");
    });
    System.out.println();
    strings.forEach(System.out::print);
    System.out.println();

    // suskaciuosim kiek zodziu prasideda raide "a"
    long cnt = strings.stream().filter(s -> s.startsWith("a")).count();
    System.out.println("a... - " + cnt);

    Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
    // surenkam skacius didesnius uz 3
    List<Integer> collectedList = integerStream.filter(i -> i > 3).collect(toList());
    System.out.println(collectedList);

    // konvertuojam i String tipo seta
    Set<String> collectedSet = Stream.of(1, 2, 5).map(i -> "a" + i).collect(toSet());
    System.out.println(collectedSet);
    Set<String> collectedSet2 = Stream.of(1, 2, 5).map(i -> String.valueOf("'" + i + "'")).collect(toSet());
    System.out.println(collectedSet2);

    Optional<List<Set<String>>> notEmptyOptional = Optional.of(
        Arrays.asList(
            new HashSet<>(Arrays.asList("abc", "bc")),
            new HashSet<>(Arrays.asList("aabc", "bsc")))
    );
    // traukiam pirmą stringą
    System.out.println("notEmptyOptional-first string: " + notEmptyOptional.get().get(0).stream().findFirst().get());

    Optional<List<Set<String>>> emptyOptional = Optional.empty(); // tuščias
    System.out.println("emptyOptional isPresent: " + emptyOptional.isPresent());
    Optional<String> aOptional = Optional.of("a");
    System.out.println("aOptional isPresent: " + aOptional.isPresent());
    System.out.println("aOptional value: " + aOptional.get());

    // 1as null-safe būdas
    if (aOptional.isPresent()) {
      System.out.println("aOptional value=" + aOptional.get());
    }
    // 2as null-safe būdas
    aOptional.ifPresent(s -> System.out.println("aOptional value=" + s));

    String str = null;
    //Optional.of(str); //NullPointerException
    Optional<String> nullOptional = Optional.ofNullable(str);
    System.out.println("nullOptional isPresent: " + nullOptional.isPresent());
    System.out.println("nullOptional value: " + nullOptional.orElse("no value"));
    System.out.println("Optional with value (orElse example): " + Optional.of("AAA").orElse("no value"));

    // sugeneruojam streama is 10 vienetu
    Stream.generate(() -> 1).limit(10).forEach(System.out::print);
    System.out.println();
    Stream.generate(() -> 1).limit(10).forEach(i -> System.out.print(i));
    System.out.println();
    System.out.println(IntStream.iterate(100, i -> i - 1).limit(3).sum());
    System.out.println();

    // naudojam builderi streamo kurimui
    Stream.builder().add("a").add("b").build().forEach(System.out::println);
  }
}
