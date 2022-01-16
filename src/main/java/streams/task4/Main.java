package streams.task4;

public class Main {

    public static void main(String[] args) {

        StringFunction exclaim = (s) -> s = s + "!";
        StringFunction ask = (s) ->  s = s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.print(result);
    }
}
