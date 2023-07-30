package JavaIntro;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

        char var = '\u00A7';
        System.out.println(var);

        //(a+b)^2 = a^2+2ab+b^2

        int a = 25;
        float b = 42.159f;
        double result = (a*a)+2*(a*b)+(b*b);
        System.out.println(result);

        System.out.println(a++);
        System.out.println(b++);

        if(a>b){
            System.out.println("a is greater than b");
        }else{
            System.out.println("a is NOT greater than b");
        }

        switch (a){
            case 25: System.out.println("The value of a is 25");
                    break;
            case 26: System.out.println("The value of a is 26 ");
                    break;
            default:
                System.out.println("None");
                    break;
        }

    }
}}