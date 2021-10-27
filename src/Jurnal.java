public class Jurnal extends CarteForm{

    protected Jurnal(String autor, String denumirea, String editura, int anul, int nrFoi) {
        super(autor, denumirea, editura, anul, nrFoi);
    }

    @Override
    String marime() {
        if (nrFoi < 10) return "mica";
        else if (nrFoi < 50) return "mijlocie";
        else return "mare";
    }

    @Override
    public String toString() {
        return "Jurnal{" +
                "Autor='" + autor + '\'' +
                ", Denumirea='" + denumirea + '\'' +
                ", Editura='" + editura + '\'' +
                ", Anul=" + anul +
                ", Nr Foi=" + nrFoi +
                "}";
    }
}
