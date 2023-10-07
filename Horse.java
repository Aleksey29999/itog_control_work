import java.util.Date;

public class Horse extends Pack_Animals{
    private static int counter;

    public static int getCounter(){
        return counter;
    }

    {
        counter++;
    }
    public Horse(int id, String name, String skills, String date_born) {
        super(id, name, skills, date_born);
    }


    @Override
    public String toString() {
        return String.format("id: %d\nName: %s\nРожден: %s\nНавыки: %s\n", getId(), getName(), getDate_born(), getSkills());
    }
}
