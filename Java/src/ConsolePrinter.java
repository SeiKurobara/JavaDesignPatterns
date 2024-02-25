public class ConsolePrinter implements SampleInterface{
    @Override
    public void ConsoleMessage(String message) {
        System.out.println("This is Console Printer Class "+message);
    }
}
