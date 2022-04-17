package Task2;

class Dog extends Mammal implements Animalname, Animalmove{
    private String breedSirisa56482;

    public Dog() {
        super();
        breedSirisa56482 = "none";
    }

    public Dog(String name,String breed, String type, int age,int weight) {
        super(name,type, age, weight);
        this.breedSirisa56482 = breed;
    }

    public Dog(String breed,String type, int age){
        super(type,age );
        this.breedSirisa56482= breed;
    }
    //additional
    public void sleepSirisa56482(){
        System.out.println("Dog is sleeping");
    }

    @Override
    public void drinkMilkSirisa56482(){
        System.out.println("Dog is drinking milk");
    }

    @Override
    public void getVoiceSirisa56482(){System.out.println("Dog is making sound box box");}

    @Override
    public void eatSirisa56482(String foodName) {
        System.out.println("eats: " + foodName);
    }

    public void setBreedSirisa56482(String breedSirisa56482){this.breedSirisa56482 = breedSirisa56482;}
    public String getBreedSirisa56482(){return breedSirisa56482;}

    @Override
    public String toString(){
        return "Dog: \n" + "breed: " + breedSirisa56482;
    }

    @Override
    public void moveSirisa56482(Object ob)
    {
        System.out.println(ob.getClass().getSimpleName()+" run");
    }

    @Override
    public void sleep(String nameSirisa56482, int ageSirisa546482, int weightSirisa56482){

    }

}

