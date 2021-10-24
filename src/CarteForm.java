public abstract class CarteForm {
    protected String autor;
    protected String denumirea;
    protected String editura;
    protected int anul;
    protected int nrFoi;

    protected CarteForm(String autor, String denumirea, String editura, int anul, int nrFoi) {
        this.autor = autor;
        this.denumirea = denumirea;
        this.editura = editura;
        this.anul = anul;
        this.nrFoi = nrFoi;
    }

    abstract String Marime();

    public String getAutor() {
        return autor;
    }

    public String getEditura() {
        return editura;
    }

    public int getAnul() {
        return anul;
    }

    public int getNrFoi() {
        return nrFoi;
    }

    public void setNrFoi(int nrFoi) {
        this.nrFoi = nrFoi;
    }
}
