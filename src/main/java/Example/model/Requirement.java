package Example.model;

public class Requirement {
    private Integer id;
    private String name;
    public Requirement(){
    }

    public Requirement(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Requirement(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
