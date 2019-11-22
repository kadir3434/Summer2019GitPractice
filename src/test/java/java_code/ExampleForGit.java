package java_code;

import utilities.ClassForInterface;

public class ExampleForGit implements ClassForInterface {


    public static void main(String[] args) {
        ExampleForGit say = new ExampleForGit();
        say.SayHello();
        say.Sum(5,6);
    }

    public void SayHello() {
        System.out.println("Hello");
    }
    public void Sum(int a, int b){
        System.out.println(a+b);
    }
}
