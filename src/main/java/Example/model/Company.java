package Example.model;

public class Company {
    private Integer id;
    private String name;
    private Integer city_id;
    private String description;
    private String telNumber;
    private String webSite;
    public Company(){

    }

    public Company(Integer id, String name, Integer city_id, String description, String telNumber, String webSite) {
        this.id = id;
        this.name = name;
        this.city_id = city_id;
        this.description = description;
        this.telNumber = telNumber;
        this.webSite = webSite;
    }

    public Company(String name, Integer city_id, String description, String telNumber, String webSite) {
        this.name = name;
        this.city_id = city_id;
        this.description = description;
        this.telNumber = telNumber;
        this.webSite = webSite;
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

    public Integer getCity_id() {
        return city_id;
    }

    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }
}
