package lab4;

public class Dog {
    private String nume;
    private String rasa;

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getNume() {
        return nume;
    }

    public String getRasa() {
        return rasa;
    }

    public Dog(String nume, String rasa) {
        this.nume = nume;
        this.rasa = rasa;
    }
}
