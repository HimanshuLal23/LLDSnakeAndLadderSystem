package services;

public class User {
    private int id;
    private int pos;
    public User(int id,int pos) {
        this.id = id;
        this.pos = pos;
    }
    public int getPosition() {
        return this.pos;
    }
    public void setPosition(int pos) {
        this.pos = pos;
    }
}
