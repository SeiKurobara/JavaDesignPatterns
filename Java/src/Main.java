public class Main {
    public static void main(String[] args) {

        // !! Lambda syntax: (arguments) -> Expression

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

    }

    public static void Print(SampleInterface sampleInterface) {
        // The message variable in ConsolePrinter uses the Hello World
        sampleInterface.ConsoleMessage("Hello World");
    }
}