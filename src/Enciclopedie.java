public class Enciclopedie extends CarteForm{

    protected Enciclopedie(String autor, String denumirea, String editura, int anul, int nrFoi) {
        super(autor, denumirea, editura, anul, nrFoi);
    }

    @Override
    String marime() {
        if (nrFoi < 500) return "mica";
        else if (nrFoi < 1500) return "mijlocie";
        else return "mare";
    }

    @Override
    public String toString() {
        return "Enciclopedie{" +
                "Autor='" + autor + '\'' +
                ", Denumirea='" + denumirea + '\'' +
                ", Editura='" + editura + '\'' +
                ", Anul=" + anul +
                ", Nr Foi=" + nrFoi +
                "}";
    }
}
