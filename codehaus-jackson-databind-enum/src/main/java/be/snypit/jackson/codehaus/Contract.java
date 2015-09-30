package be.snypit.jackson.codehaus;

public class Contract {

    private Term term;

    public Contract() {
    }

    public Contract(Term term) {

        this.term = term;
    }

    public Term getTerm() {
        return term;
    }
}
