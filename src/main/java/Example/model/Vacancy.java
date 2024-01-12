package Example.model;

public class Vacancy {
    private Integer id;
    private String title;
    private Integer company_id;
    private Integer salary;
    private String description;
    public Vacancy(){

    }

    public Vacancy(Integer id, String title, Integer company_id, Integer salary, String description) {
        this.id = id;
        this.title = title;
        this.company_id = company_id;
        this.salary = salary;
        this.description = description;
    }

    public Vacancy(String title, Integer company_id, Integer salary, String description) {
        this.title = title;
        this.company_id = company_id;
        this.salary = salary;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Integer company_id) {
        this.company_id = company_id;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
