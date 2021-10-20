package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
	while (true){
        System.out.println("Select:\n 1. Art Deco furniture\n 2. Victorian furniture\n 3. Modern furniture");
        System.out.println("Your choice:");
        int x=scanner.nextInt();
        if (x==1){
            Factory factory = new ArtDecoFactory();
            Chair chair = factory.createChair();
            Sofa sofa = factory.createSofa();
            chair.buy();
            sofa.buy();
            break;
        }else if(x==2){
            Factory factory = new VictorianFactory();
            Chair chair = factory.createChair();
            Sofa sofa = factory.createSofa();
            chair.buy();
            sofa.buy();
            break;
        }else if (x==3){
            Factory factory = new ModernFactory();
            Chair chair = factory.createChair();
            Sofa sofa = factory.createSofa();
            chair.buy();
            sofa.buy();
            break;
        }else {
            break;
        }
    }
    }
}

interface Factory{
    Chair createChair();
    Sofa createSofa();
}
class ArtDecoFactory implements Factory{
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
}
class VictorianFactory implements Factory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
class ModernFactory implements Factory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

interface Chair{
    void buy();
}
class ArtDecoChair implements Chair{
    @Override
    public void buy() {
        System.out.println("You bought art deco chair");
    }
}
class VictorianChair implements Chair{
    @Override
    public void buy() {
        System.out.println("You bought victorian chair");
    }
}
class ModernChair implements Chair{
    @Override
    public void buy() {
        System.out.println("You bought modern chair");
    }
}

interface Sofa{
    void buy();
}
class ArtDecoSofa implements Sofa{
    @Override
    public void buy() {
        System.out.println("You bought art deco sofa");
    }
}
class VictorianSofa implements Sofa{
    @Override
    public void buy() {
        System.out.println("You bought victorian sofa");
    }
}
class ModernSofa implements Sofa{
    @Override
    public void buy() {
        System.out.println("You bought modern sofa");
    }
}


