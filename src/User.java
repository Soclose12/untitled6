public class User {
    private String name;
    private int zarp;
    private int yaer;

    public User(String name, int zarp, int yaer) {
        this.name = name;
        this.zarp = zarp;
        this.yaer = yaer;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getZarp() {
        return zarp;
    }

    public void setZarp(int zarp) {
        this.zarp = zarp;
    }

    public int getYaer() {
        return yaer;
    }

    public void setYaer(int yaer) {
        this.yaer = yaer;
    }
}