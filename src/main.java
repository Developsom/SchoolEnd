public class main {

    private int number;
    private int input1;
    private int input2;
    private String name;

    public static void Main(String[]args){

    }

    public void hello() {
        System.out.println("Hello, World!");
    }
    public void positiveOrNegativ(int number) {
        if ( number > 0){
            System.out.println(input1 + "is bigger than" + input2 + "!" );
        }
        else {
            System.out.println("This number is negative !");
        }
    }

    public void positiveOrZeroOrNegativ(int number) {
        if ( number > 0) {
            System.out.println("This number is positive !");
        }
        if ( number == 0) {
            System.out.println("This number is zero !");
        }
        else {
            System.out.println("This nr is neg!");
        }

    public void bartender(String name) {
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
    }

    public void sum(int input1, int input2) {
        System.out.println(input1 + input2);
    }
}