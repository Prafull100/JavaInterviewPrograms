package TestPrograms;

   class Animal{
        void eat(){System.out.println("eating...");}
    }
    class Dog extends Animal{
        void bark(){System.out.println("barking...");}
    }
    class BabyDog extends Animal{
        void weep(){System.out.println("weeping...");}
    }
     class Prafull extends BabyDog{
        void create(){System.out.println("Creating...");}
    }


    class TestInheritance2{
        public static void main(String args[]){
            Prafull d=new Prafull();
            d.weep();
        //    d.bark();
            d.eat();
            d.create();
        }}

