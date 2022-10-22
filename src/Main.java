public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Animal dog = new Animal("Canine");
        dog.name = "Tomek";
        dog.weight = 10.0;

        /*
        System.out.println("Masz zwierzę, nazywa się "+ dog.name);
        System.out.println(dog.isAlive);
        System.out.println(dog.species);


/*



        for (int i = 0; i<=10; i++) {
            cat.takeForAWalk();
            System.out.println("Tomek waży " + cat.weight);
        }
        cat.feed();
        */
        Animal cat = new Animal("Cat");
        cat.name = "Tomek";
        cat.weight = 5.1;
        System.out.println("Tomek ważdy " + cat.weight);

        Human me = new Human();
        me.pet = cat;
        me.firstName = "Patryk";
        System.out.println("Nazwa mojego zwierzaka to " + me.pet.name);

        Car fiat = new Car("Bens", "Mercedes");
        me.car = fiat;
        System.out.println(me.car.airConditioner);



    }
}