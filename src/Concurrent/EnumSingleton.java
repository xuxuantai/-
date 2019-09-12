package Concurrent;

public enum EnumSingleton {
    INSTANCE;

    public static void main(String[] args) {
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        EnumSingleton singleton2 = EnumSingleton.INSTANCE;
        System.out.println(singleton1 == singleton2);
    }
}
