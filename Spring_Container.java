public class Spring_Container {
    public static void main(String[] args) {
        System.out.println("Spring Container");

        //Information about Spring Container
        System.out.print("Spring-Container: \n" +
                "A Spring container, also known as the Spring IoC (Inversion of Control) container,\n" +
                "is a core concept in the Spring Framework, which is a popular framework for building\n" +
                "Java applications. The Spring container is responsible for managing the lifecycle of Java \n" +
                "objects, known as beans, and controlling their dependencies. It provides a way to decouple\n " +
                "the configuration and management of application components from the actual application code.\n" +

                "There are two main types of Spring containers:\n\n" +

                "BeanFactory:\n" +
                "This is the simplest and most basic type of Spring container.It provides support for\n" +
                "bean instantiation, configuration, and management.It is generally used in applications where\n"+
                "the full power of the Spring container is not required.\n\n" +

                "ApplicationContext:\n"+
                "This is a more advanced and feature - rich container compared to BeanFactory.\n" +
                "ApplicationContext extends the functionality of BeanFactory and adds additional features such as\n" +
                "internationalization, event propagation, and a wider range of application lifecycle events.It is the \n" +
                "preferred container for most Spring applications. ");
    }
}
