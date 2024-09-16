class Parent {
    int value = 100;
}

class Child extends Parent {
    int value = 200;

    public void display() {
        System.out.println("Child value: " + value); // Child class variable
        System.out.println("Parent value: " + super.value); // Parent class variable
    }
}

public class Test {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
        // Output:
        // Child value: 200
        // Parent value: 100
    }
}


