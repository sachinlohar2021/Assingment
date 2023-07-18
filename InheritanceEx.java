package Inheritance;


class Animal{
    public void Eat(){
        System.out.println("Animal Eating");
    }
}
class Tiger extends Animal{
    public void TigerName() {
        System.out.println("Delta");
    }
}

class Car{
    void carPrice(){
        System.out.println("10L");
    }
}
class Sedan extends Car{
    void mileage(){
        System.out.println("20 Km/per hr");
    }
}

class Mobile{
    void Battery(){
        System.out.println("10,000 mha");
    }
}
class Moto extends  Mobile{
    void price(){
        System.out.println("Moto price is 10000");
    }
}

public class InheritanceEx {

    public static void main(String[] args) {

    Tiger t = new Tiger();
    t.Eat();
    t.TigerName();


    Sedan sedan = new Sedan();
        sedan.carPrice();
        sedan.mileage();

        Moto moto =new Moto();
        moto.price();
        moto.Battery();
    }
}


