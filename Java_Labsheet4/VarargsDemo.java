class VarargsDemo {
    static void printStrings(String... args) {
        for (String s : args) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        printStrings("Hello", "World", "Java", "Varargs");
    }
}
