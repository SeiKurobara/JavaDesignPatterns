public class Main {
    public static void main(String[] args) {
        // uses the ConsolePrinter class as an Argument
        Print(new ConsolePrinter());
        Print(new ConsolePrinter2());

        // anonymous Inner Class
        Print(new SampleInterface() {
            @Override
            public void ConsoleMessage(String message) {
                System.out.println("This is a Anonymous Inner Class "+message);
            }
        });

        // !! Lambda syntax: (arguments) -> Expression
        // lambda Expression
        Print(message -> System.out.println(message)); // Hello World

        // assigning the Lambda expression in a variable
        SampleInterface InterfaceVariable = message -> System.out.println(message);
        InterfaceVariable.ConsoleMessage("Kamote");

    }

    public static void Print(SampleInterface sampleInterface) {
        // The message variable in ConsolePrinter uses the Hello World
        sampleInterface.ConsoleMessage("Hello World");
    }
}