public class Carte extends CarteForm {

    public Carte(String autor, String denumirea, String editura, int anul, int nrFoi) {
        super(autor, denumirea, editura, anul, nrFoi);
    }

    @Override
    String marime() {
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
