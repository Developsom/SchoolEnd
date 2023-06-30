public class Main {
    public static void main(String[]args){
        int number = 0;
        int input1 = 4;
        int input2 = 0;
        String name = "2";

        hello();
        positiveOrNegativ(number);
        positiveOrZeroOrNegativ(number);
        bartender(name);
        sum(input1, input2);
    }

    public static void hello() {
        System.out.println("Hello, World!");
    }

    public static void positiveOrNegativ(int number) {
        if ( number > 0){
            System.out.println("This nr pos!" );
        }
        else {
            System.out.println("This number is negative !");
        }
    }

    public static void positiveOrZeroOrNegativ(int number) {
        if (number > 0) {
            System.out.println("This number is positive !");
        }
        else if (number == 0) {
            System.out.println("This number is zero !");
        } else {
            System.out.println("This nr is neg!");
        }
    }

    public static void bartender(String name) {
        switch (name) {
            case "1":
                System.out.println("Erika");
                break;
            case "2":
                System.out.println("July");
                break;
            case "3":
                System.out.println("Piet");
                break;
            case "4":
                System.out.println("Pinas");
                break;
            default:
                System.out.println("Fill the name of the bartender you'd wish to know the fav drink of");
        }
    }

    public static void sum(int input1, int input2) {
        System.out.println(input1 + input2);
    }
}