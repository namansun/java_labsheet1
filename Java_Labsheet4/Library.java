class Library {
    class Member {
        String name;

        Member(String name) {
            this.name = name;
        }

        void display() {
            System.out.println("Library member: " + name);
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();
        Library.Member m1 = lib.new Member("BARBY");
        m1.display();
    }
}
