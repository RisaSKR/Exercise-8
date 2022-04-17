package Task2;

public class main {
    public static void main(String[] args) {
        Animal animal[] = new Animal[6];

        animal[0] = new Mammal("Little M", "Jacob", 3, 5);
        animal[1] = new Dog("Alice", "Bull dog", "Working dog", 2, 15);
        animal[2] = new Fish("Sand", "Yellow", 4, 3);
        animal[3] = new BlowFish("abc", "ocean", "tetrodotoxin", 3, 5);
        animal[4] = new Bird("Blond", "Hope", 3, 5);
        animal[5] = new Pigeon("Pigeon", "Blue", "Steve", 1, 4);

        Animalbehaviour animalbehaviour[] = new Animalbehaviour[3];
        animalbehaviour[0] = new BlowFish("Kingston", "ocean", "tetrodotoxin", 3, 5);
        animalbehaviour[1] = new Pigeon("Louis", "Blue", "Steve", 1, 4);
        animalbehaviour[2] = new Dog("abc", "Bull dog", "Working dog", 2, 15);

        for (Animal a : animal) {
            a.moveSirisa56482(a);
        }

        for (Animal a : animal) {
            Animalname.nameSirisa56482(a.getNameSirisa56482());
        }
    }
}
