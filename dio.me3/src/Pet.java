public class Pet {
    
    private final String name;
    private boolean clean;

    public Pet(String name) {
        this.clean = false;
        this.name = name;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public String getName() {
        return name;
    }

}
