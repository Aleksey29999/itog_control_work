import java.util.Date;

public class Pack_Animals extends Animals {
    private static int counter;

    public static int getCounter(){
        return counter;
    }

    {
        counter++;
    }

    public Pack_Animals(int id, String name, String skills, String date_born) {
        super(id, name, skills, date_born);
    }


    @Override
    public String toString() {
        return String.format("id: %d\nName: %s\nРожден: %s\nНавыки: %s\n", getId(), getName(), getDate_born(), getSkills());
    }
}