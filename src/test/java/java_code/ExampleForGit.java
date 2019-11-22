package java_code;

import utilities.ClassForInterface;

public class ExampleForGit implements ClassForInterface {


    public static void main(String[] args) {
        ExampleForGit say = new ExampleForGit();
        say.SayHello();
    }

    public void SayHello() {
        System.out.println("Hello");
    }
}
