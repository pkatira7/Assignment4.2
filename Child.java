class Child extends Paren {
 public void method1() {
 System.out.println ("Child's method1()");
} 

public static void main(String args[]) {
Paren p = new Child();
p.method2();
}
}