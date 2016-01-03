package ua.pp.fame.Model;

public class Model1 implements Model {

    public int fild;

    public String[] getData() {
        return new String[] {"One", Integer.toString(fild)};
    }

    public void setFild(int fild) {
        this.fild = fild;
    }
}
