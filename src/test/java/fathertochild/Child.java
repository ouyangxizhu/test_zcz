package fathertochild;

public class Child extends Father {
    private String ch = "ch";

    public String getCh() {
        return ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
    }

    @Override
    public String toString() {
        return "Child{" +
                "ch='" + ch + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Father father = new Father();
        System.out.println((Child) father);//异常
    }
}
