package Example.model;

public class Vacancy_Requirement {
    private Integer id;
    private Integer vacancy_id;
    private Integer requirement_id;
    public Vacancy_Requirement(){
    }

    public Vacancy_Requirement(Integer id, Integer vacancy_id, Integer requirement_id) {
        this.id = id;
        this.vacancy_id = vacancy_id;
        this.requirement_id = requirement_id;
    }

    public Vacancy_Requirement(Integer vacancy_id, Integer requirement_id) {
        this.vacancy_id = vacancy_id;
        this.requirement_id = requirement_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVacancy_id() {
        return vacancy_id;
    }

    public void setVacancy_id(Integer vacancy_id) {
        this.vacancy_id = vacancy_id;
    }

    public Integer getRequirement_id() {
        return requirement_id;
    }

    public void setRequirement_id(Integer requirement_id) {
        this.requirement_id = requirement_id;
    }
}
