import java.awt.*;
import java.util.Date;


public class Main {

    public static void main(String[] args) {
        Tasks task1 = new Tasks(Color.red,
                "Completed",
                1,
                "10 changes post return 4/16",
                new Date(2020, 4, 16));

        Tasks task2 = new Tasks(Color.orange,
                "Not Started",
                2,
                "Needed updates for Snappy pages",
                new Date(2020, 23, 04));

        Tasks task3 = new Tasks(Color.yellow,
                "Not Started",
                3,
                "Update desks numbers",
                new Date(2020, 4,30));

        Tasks task4 = new Tasks(Color.blue,
                "In progress",
                4,
                "Database flow",
                new Date(2020,4,16));

        Tasks task5 = new Tasks(Color.blue,
                "Not Started",
                5,
                "Provide updates for on-going projects",
                new Date(2020,5,1));

    }

}