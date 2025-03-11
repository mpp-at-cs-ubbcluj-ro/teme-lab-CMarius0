package domain;

public class Proba extends Entity<Integer> {
    private String grupa_varsta;
    private String lungime;

    public Proba(Integer id, String grupa_varsta, String lungime) {
        super(id);
        this.grupa_varsta = grupa_varsta;
        this.lungime = lungime;
    }

    public String getGrupa_varsta() {
        return grupa_varsta;
    }

    public void setGrupa_varsta(String grupa_varsta) {
        this.grupa_varsta = grupa_varsta;
    }

    public String getLungime() {
        return lungime;
    }

    public void setLungime(String lungime) {
        this.lungime = lungime;
    }
}
