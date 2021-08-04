public class Main {

    public static void main(String[] args) {
        arrayCat();
    }


    static void arrayCat(){
        Plate plate = new Plate(100);
        plate.info();
        Cat[] cats = {
                new Cat("Барсик", 40),
                new Cat("Shkiper", 30),
                new Cat("Kovalskiy", 50)
        };
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate, cats[i].getName());
            plate.addingFood();
            plate.info();
        }

    }
}
