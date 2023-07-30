package Classes;

public class Hello {
    public static void main (String[] arg){
        //System.out.println("Hello Java Classes");
        //Car car1 = new Car("closed","on","seated",10);
        //car1.run();
        //System.out.println(car1.run());

        smartPhone phone = new smartPhone();

        System.out.println(phone.getBrand());

        System.out.println(phone.getPrice());
    }
}
