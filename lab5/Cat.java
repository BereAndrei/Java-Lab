package lab5;

public class Cat {
    private String name;
    private String colour;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer energyLevel; //valori intre 1-5
    private Integer hungerLevel; //valori intre 1-5
    private Integer moodLevel; //valori intre 1-5

    public Cat(){

    }

    public Cat(String name, String colour, Integer age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.energyLevel = 3;
        this.hungerLevel = 3;
        this.moodLevel = 3;
    }

    public void play(){
        this.moodLevel++;
        this.energyLevel--;
        this.meow();
    }

    public void feed(){
        this.moodLevel++;
        this.hungerLevel--;
    }

    public void sleep(){
        this.energyLevel++;
        this.hungerLevel++;
    }


    public void meow() {
        System.out.println("Meouw");
    }

}
