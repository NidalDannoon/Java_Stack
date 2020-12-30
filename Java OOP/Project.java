public class Project {
    private String name;
    private String description;
    private double initialCost = 0;
    private static String defaultName = "Name";
    private static String defaultDescription = "Description";

    public String getName() {
		return name;
	}
    public String getDescription() {
		return description; 
	}
    public double getCost() {
		return initialCost; 
	}

    public void setName(String name) {
		this.name = name; 
	}
    public void setDescription(String description) {
		this.description = description; 
	}
    public String elevatorPitch() {
        return name +" :" +description;
    }

    public Project(String name, String description, double initialCost) {
        this.name = name;
        this.initialCost = initialCost;
        this.description = description;
    }
    public Project(String name) {
        this.name = name;
        this.description = defaultDescription;
    }
    public Project() {
        name = defaultName;
        description = defaultDescription;
    }
}