package Task2;

class Bird extends Animal implements Animalmove, Animalname {
    private String featherColourSirisa56482;

    public Bird() {
        super();
        featherColourSirisa56482 = "none";
    }

    public Bird(String name, String featherColour, int age, int weight) {
        super(name, age, weight);
        this.featherColourSirisa56482 = featherColour;
    }

    public Bird(String featherColour, int age){
        super(age);
        this.featherColourSirisa56482 = featherColour;
    }

    //additional
    public void LiveSirisa56482(){
        System.out.println("Bird living on the tree");
    }

    @Override
    public void getVoiceSirisa56482(){
        System.out.println("Bird is making sound jib");
    }

    @Override
    public void eatSirisa56482(String foodName) {
        System.out.println("eats: " + foodName);
    }

    public void setFeatherColourSirisa56482(String orderSirisa56482){this.featherColourSirisa56482 = orderSirisa56482;}
    public String getFeatherColourSirisa56482(){return featherColourSirisa56482;}

    public String toString(){
        return "Bird: \n" + "feather: " + featherColourSirisa56482;
    }


    @Override
    public void moveSirisa56482(Object ob)
    {
        System.out.println(ob.getClass().getSimpleName()+" fly");
    }

    @Override
    public void sleep(String nameSirisa56482, int ageSirisa546482, int weightSirisa56482) {

    }
}

