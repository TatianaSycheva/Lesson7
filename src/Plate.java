import java.sql.SQLOutput;
import java.util.Scanner;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (n <= food) {
            food = food - n;
            return true;
        } else {
            return false;
        }
    }

    public void info(){
        System.out.println("Plate: " + food);
    }

    public void addingFood() {
            System.out.println("Хотите добавить еду в тарелку?");
            System.out.println("Введите 'ДА', если необходимо наполнить тарелку. Если тарелку не нужно наполнять введите что-либо другое.");
            Scanner scanner = new Scanner(System.in);
            String decision = scanner.nextLine();
            if (decision.equalsIgnoreCase("ДА")) {
                food = food + (100 - food);
                System.out.println("Тарелка наполнена");
            } else {
                System.out.println("Пускай коты едят, что осталось в тарелке!!!");
            }

        }
    }

