public class Animal {
    final String species;
    String name;
    Double weight;
    Boolean isAlive;

    Animal(String species){
        this.isAlive = true;
        this.species = species;
    }

    void feed(){
        if(this.isAlive) {
            this.weight += 0.5;
            System.out.println("Dzięki za żarcie frajerze");
        }
        else
        {
            System.out.println("On nie żyje, czemu to robisz? Nie masz wyrzutów sumienia? Jego duch patrzy na ciebie i jest zawiedziony");
        }
    }

    void takeForAWalk(){
        if(this.isAlive)
            this.weight -= 0.5;
        if(weight <= 0.0)
            this.isAlive = false;
            this.weight = 0.0;
        if (!isAlive)
            System.out.println("Policja już jedzie do ciebie ty zwyrolu");
    }

}
