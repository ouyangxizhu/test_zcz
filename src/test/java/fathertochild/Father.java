package fathertochild;

public class Father {
    private String fa = "fa";

    public String getFa() {
        return fa;
    }

    public void setFa(String fa) {
        this.fa = fa;
    }

    @Override
    public String toString() {
        return "Father{" +
                "fa='" + fa + '\'' +
                '}';
    }
}
