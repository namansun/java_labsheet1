



class Parent {
    private int privateVar = 10;
    protected int protectedVar = 20;
    public int publicVar = 30;

    public void showParent() {
        System.out.println("Private not accessible in child");
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
    }
}
 class AccessModifiersDemo extends Parent {
    public void showChild() {
        
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);      
    }

    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();
        obj.showParent();
        obj.showChild();
    }
}
