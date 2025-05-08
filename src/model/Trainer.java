package model;

public class Trainer extends Card {

    private String description;
    private String restriction;
    
    public Trainer(String name, String description, String restriction) {
        super(name);
        this.description = description;
        this.restriction = restriction;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRestriction() {
        return restriction;
    }

    public void setRestriction(String restriction) {
        this.restriction = restriction;
    }

    @Override
    public String toString() {
        return "Trainer [description=" + description + ", restriction=" + restriction + ", getName()=" + getName()
                + "]";
    }

    
    
}
