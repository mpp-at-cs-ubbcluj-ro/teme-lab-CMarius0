package domain;

public class Inscriere {
    private Proba proba;
    private Participant participant;

    public Inscriere(Proba proba_id, Participant participant_id) {
        this.proba = proba_id;
        this.participant = participant_id;
    }

    public Proba getProba() {
        return proba;
    }

    public void setProba(Proba proba) {
        this.proba = proba;
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }
}
