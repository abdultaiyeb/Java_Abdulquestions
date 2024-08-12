package Selenium;

// Question: 1. What are interfaces in Java?

interface MyInterface {
    void method1();
    void method2();
}


class Demo implements MyInterface {

	public void method1() {
        System.out.println("implementation of method1");
    }

    public void method2() {
        System.out.println("implementation of method2");
    }

    public static void main(String arg[]) {
        MyInterface obj = new Demo();
        obj.method1();


	}

}
