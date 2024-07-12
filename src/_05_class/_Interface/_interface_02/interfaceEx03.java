package _05_class._Interface._interface_02;

interface Contents {
    public int max_Val = 100;
    double Pi = 3.14;
}

class ContentEx implements Contents {
    void Math() {
        System.out.println("max_Val = " + max_Val);
        System.out.println("Pi = " + Pi);
    }
}

public class interfaceEx03 {
    public static void main(String[] args) {
        ContentEx obj = new ContentEx();
        obj.Math();
    }
}
