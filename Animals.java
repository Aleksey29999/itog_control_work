import java.util.Date;

 class Animals {

    public int id;
    public String name;
    public String skills;
    public String date_born;
    private static int counter;

    public static int getCounter() {
        return counter;
    }

    {
        counter++;
    }

    public Animals(int id, String name, String skills, String date_born) {

        this.id = id;
        this.name = name;
        this.skills = skills;
        this.date_born = date_born;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSkills() {
        return skills;
    }

    public String getDate_born() {
        return date_born;
    }

//    public  void setId(int id) {
//        Animals.id = id;
//    }
//
//    public  void setName(String name) {
//        Animals.name = name;
//    }
//
//    public  void setSkills(String skills) {
//        Animals.skills = skills;
//    }
//
//    public  void setDate_born(String date_born) {
//        Animals.date_born = date_born;
//    }

    @Override
    public String toString() {
        return String.format("id: %d\nName: %s\nРожден: %s\nНавыки: %s\n", getId(), getName(), getDate_born(), getSkills());
    }
}
