public class Cat {
    private String name;
    private int appetite;
    public boolean satiety = false;

    public Cat(String name, int appetite) {
        this.appetite = appetite;
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public boolean eat(Plate p, String name) {
        if (p.decreaseFood(appetite)) {
            satiety = true;
            System.out.printf("Кот %s сыт! %n", name);
            return true;
        } else {
            System.out.printf("Коту по кличке %s не хватило еды :( %n", name);
            return false;
        }

    }


}
