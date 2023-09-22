
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Satya_Lambda {
    public static void main(String[] args) {
/*        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Adam");
        names.add("Eve");
        // Using lambda expression to sort the list
        Collections.sort(names, (String s1, String s2) -> s1.compareTo(s2));
        // Print sorted list
        names.forEach(System.out::println);
}}*/
// Stream Api example
        List<String> names = Arrays.asList("John", "Jane", "Tom", "Jerry", "Bob", "Alice");
        //  Filter names that start with "J" and collect them into a new list
        List<String> jNames = names.stream()
                .filter(name -> name.startsWith("J"))
                .collect(Collectors.toList());
        System.out.println("Names starting with 'J': " + jNames);
}}

//optional class
/*       String name = "John Doe";
        Optional<String> optionalName = Optional.ofNullable(name);
//     Check if a value is present
        if (optionalName.isPresent()) {
            System.out.println("Name is present: " + optionalName.get());
        } else {
            System.out.println("Name is absent");
        }

    }
}*/

/*
      System.out.println("    Release Year:
        Java 8 was released in March 2014.
        Java 17 was planned to be released in September 2021.
        Major Changes in Java 8:

        Introduction of Lambda Expressions: Lambda expressions allow you to treat functionality as a method argument or code as data.
        Stream API: Stream API introduced functional-style operations on streams of elements, allowing for more concise and readable code for processing collections.
        Default Methods: Interfaces could now have method implementations, providing a way to add new methods to interfaces without breaking existing implementations.
        java.time Package: A new date and time API was introduced to address the shortcomings of the old Date and Calendar classes.

        Major Changes in Java 17:
         As of my last knowledge update in September 2021, specific features of Java 17 were not available. However, new features and
        enhancements would have been introduced as part of the release. Some expected changes might include performance improvements,
        new libraries or APIs, and possibly language enhancements.

        Evolution of Java:
        Between Java 8 and Java 17, several other versions of Java have been released. Each version typically brings improvements in performance,
        security, and features. Some versions also introduce new language constructs or libraries.

         Security Updates:
         Both Java 8 and Java 17 receive security updates. It's important to keep your Java runtime up to date to
         ensure that you have the latest security patches.

        Compatibility:
        Java 8 introduced some significant changes, especially with lambdas and the Stream API. Some existing
        codebases needed modification to take advantage of these new features. Subsequent releases, including Java 17,
        have focused on maintaining backward compatibility while introducing new features.
        Remember, for the most accurate and up-to-date information on Java 17, you should refer to the official
         Java documentation or trusted sources related to Java development. If there have been any major changes
         or new features introduced after September 2021, I would not be aware of them.")
*/






