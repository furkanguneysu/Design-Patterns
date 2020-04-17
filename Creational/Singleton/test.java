package Creational.Singleton;

public class test {

    public static void main(String[] args) {

        //Singleton object = new Singleton();
        //Compile error  the constructor is private
        Singleton object = Singleton.getInstance();
        object.showMessage();
    }

}