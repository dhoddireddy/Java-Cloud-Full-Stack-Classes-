//Used when you don’t want changes (variable, method, class)



package day3eNumFinal;

final class Parent {
    // final class → cannot be extended
}

class Final {

    public static void main(String[] args) {

        final int x = 10; 
        // final variable → value cannot be changed

        System.out.println(x);

        // x = 20; ❌ error (cannot reassign)

    }
}

class A {
    final void show() {
        System.out.println("Final method");
    }
}

class B extends A {
    // void show() { } ❌ error (cannot override final method)
}