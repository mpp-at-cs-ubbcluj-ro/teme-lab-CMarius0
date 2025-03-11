package domain;

public class Participant extends Entity<Integer> {
    private String nume;
    private String cnp;

    public Participant(Integer id, String nume, String cnp) {
        super(id);
        this.nume = nume;
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }
}
