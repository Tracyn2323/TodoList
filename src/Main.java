import java.awt.*;
import java.util.Date;


public class Main {

    public static void main(String[] args) {
        Tasks task1 = new Tasks(1,
                 Color.red,
                "Completed",
                1,
                "10 changes post return 4/16",
                new Date(2020, 4, 16));

        Tasks task2 = new Tasks(2,
                 Color.orange,
                "Not Started",
                2,
                "Needed updates for Snappy pages",
                new Date(2020, 04, 23));

        Tasks task3 = new Tasks(3,
                 Color.yellow,
                "Not Started",
                3,
                "Update desks numbers",
                new Date(2020, 4,30));

        Tasks task4 = new Tasks(4,
                 Color.blue,
                "In progress",
                4,
                "Database flow",
                new Date(2020,4,16));

        Tasks task5 = new Tasks(5,
                 Color.blue,
                "Not Started",
                5,
                "Provide updates for on-going projects",
                new Date(2020,5,1));

    }

}