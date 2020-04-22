import java.util.*;

public class ToDoList {

    ArrayList<Tasks> priorityOneList = new ArrayList<Tasks>();
    ArrayList<Tasks> priorityTwoList = new ArrayList<Tasks>();
    ArrayList<Tasks> priorityThreeList = new ArrayList<Tasks>();
    ArrayList<Tasks> priorityFourList = new ArrayList<Tasks>();
    ArrayList<Tasks> priorityFiveList = new ArrayList<Tasks>();
    ArrayList<Tasks> prioritySixList = new ArrayList<Tasks>();
    ArrayList<Tasks> prioritySevenList = new ArrayList<Tasks>();
    ArrayList<Tasks> priorityEightList = new ArrayList<Tasks>();
    ArrayList<Tasks> priorityNineList = new ArrayList<Tasks>();
    ArrayList<Tasks> priorityTenList = new ArrayList<Tasks>();

    public boolean addHighPriorityTask(Tasks task) {
        if (task.taskPriority.equals(Tasks.highPriority)) {
            int zeroOneOrTwo = new Random().nextInt(3);
            if (zeroOneOrTwo == 0) {
                return priorityOneList.add(task);
            } else if (zeroOneOrTwo == 1) {
                return priorityTwoList.add(task);
            } else if (zeroOneOrTwo == 2) {
                return priorityThreeList.add(task);
            }
        } return priorityOneList.add(task);
    }

    public boolean addMediumPriorityTask(Tasks task) {
        if (task.taskPriority.equals(Tasks.highPriority)) {
            int zeroOneOrTwo = new Random().nextInt(3);
            if (zeroOneOrTwo == 0) {
                return priorityFourList.add(task);
            } else if (zeroOneOrTwo == 1) {
                return priorityFiveList.add(task);
            } else if (zeroOneOrTwo == 2) {
                return prioritySixList.add(task);
            }
        } return priorityFourList.add(task);
    }

    public boolean addLowPriorityTask(Tasks task) {
        if (task.taskPriority.equals(Tasks.highPriority)) {
            int zeroOneOrTwo = new Random().nextInt(3);
            if (zeroOneOrTwo == 0) {
                return prioritySevenList.add(task);
            } else if (zeroOneOrTwo == 1) {
                return priorityEightList.add(task);
            } else if (zeroOneOrTwo == 2) {
                return priorityNineList.add(task);
            } else if (zeroOneOrTwo == 2) {
                return priorityTenList.add(task);
            }
        } return priorityOneList.add(task);
    }

    public boolean newPriorityPlacement(Tasks newPriorityPlacement) {
        if (newPriorityPlacement.taskPriority.equals(Tasks.highPriority)) {
            return priorityOneList.add(newPriorityPlacement);
        } else if (newPriorityPlacement.taskPriority.equals(Tasks.mediumPriority)) {
            return priorityFourList.add(newPriorityPlacement);
        } else if (newPriorityPlacement.taskPriority.equals(Tasks.lowPriority)) {
            return prioritySevenList.add(newPriorityPlacement);
        } else return priorityTenList.add(newPriorityPlacement);
    }
}
        //public void deleteCompletedTask (Tasks deleteCompletedTask){
            //String completed = "Completed";
            //if (deleteCompletedTask.getTaskStatus().matches(completed)) {
                //rankingPriority.remove(deleteCompletedTask);




