class StaticBlockDemo {
    static int number;

    static {
        number = 10;
        System.out.println("Static block executed. Number = " + number);
    }

    public static void main(String[] args) {
        System.out.println("Main method executed.");
    }
}
