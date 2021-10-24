public class Carte extends CarteForm {

    //Exemplu class extends CarteForm: Carte, Manual, Enciclopedie, ...
    public Carte(String autor, String denumirea, String editura, int anul, int nrFoi) {
        super(autor, denumirea, editura, anul, nrFoi);
    }

    @Override
    String Marime() {
        if (nrFoi < 100) return "mica";
        else if (nrFoi < 1000) return "mijlocie";
        else return "mare";
    }

    @Override
    public String toString() {
        return "Carte{" +
                "Autor='" + autor + '\'' +
                ", Denumirea='" + denumirea + '\'' +
                ", Editura='" + editura + '\'' +
                ", Anul=" + anul +
                ", Nr Foi=" + nrFoi +
                "}";
    }
}
