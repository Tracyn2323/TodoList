import java.awt.*;
import java.util.Date;

    public class Tasks {
        public int taskId;
        public Color taskColor;
        public String taskStatus;
        public String taskPriority;
        public Date assignmentDue;
        public String taskDescription;
        public static final String lowPriority = "Low";
        public static final String mediumPriority = "Medium";
        public static final String highPriority = "High";


        public Tasks(int inputTaskId,
                     Color inputTaskColor,
                     String inputTaskStatus,
                     String inputTaskPriority,
                     String inputTaskDescription,
                     Date assignmentDue)
                      {
            this.taskId = inputTaskId;
            this.taskColor = inputTaskColor;
            this.taskStatus = inputTaskStatus;
            this.taskPriority = inputTaskPriority;
            this.assignmentDue = assignmentDue;
            this.taskDescription = inputTaskDescription;
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
        } return notStarted;
    }
    public void changeTaskStatus(String newTaskStatus) {
        this.taskStatus = newTaskStatus;
    }

    public void changePriority(String newPriority) { this.taskPriority = newPriority; }

    public void changeTaskColor(Color newTaskColor) {
            this.taskColor = newTaskColor;
        }

    public String inputTask() {
            return taskDescription;
        }

}
