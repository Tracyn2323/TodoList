import java.awt.*;
import java.util.Date;



    public class Tasks {
        public Color taskColor;
        public String taskStatus;
        public int taskPriority;
        public Date assignmentDue;
        public String taskDescription;


        public Tasks(Color inputTaskColor,
                     String inputTaskStatus,
                     int inputTaskOrder,
                     String inputTaskDescription,
                     Date assignmentDue)
                      {

            this.taskColor = inputTaskColor;
            this.taskStatus = inputTaskStatus;
            this.taskPriority = inputTaskOrder;
            this.assignmentDue = assignmentDue;
            this.taskDescription = inputTaskDescription;
        }


    public void changeTaskColor(Color newTaskColor) {
        this.taskColor = newTaskColor;
    }

    public String inputTask() {
        return taskDescription;
    }

    public String getTaskStatus() {
        String notStarted = "Not Started";
        String inProgress = "In Progress";
        String completed = "Completed";
        if (taskStatus.matches(notStarted)) {
            return notStarted;
        } else if (taskStatus.matches(inProgress)) {
            return inProgress;
        } else if (taskStatus.matches(completed)) {
            return completed;
        }
        return notStarted;
    }
    public void changeTaskStatus(String newTaskStatus) {
        this.taskStatus = newTaskStatus;
    }



}
