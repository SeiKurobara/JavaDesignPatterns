public class Main {
    public static void main(String[] args) {
        // uses the ConsolePrinter class as an Argument
        Print(new ConsolePrinter());
        Print(new ConsolePrinter2());

        
    }

    public static void Print(SampleInterface sampleInterface) {
        // The message variable in ConsolePrinter uses the Hello World
        sampleInterface.ConsoleMessage("Hello World");
    }
}