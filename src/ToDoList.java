import java.util.*;

public class ToDoList {

    public Map<Integer, Queue> rankingPriority;

    public ToDoList() {
        rankingPriority = new HashMap<Integer, Queue>();

        int priority = 1;
        while (priority <= 10) {
            Queue<Tasks> listOfTasks = new LinkedList<>();
            rankingPriority.put(priority, listOfTasks);
            priority++; //++ same as +1
        }
    }

    public void add(Tasks activity) { //adding a Tasks to something else
        int createPriority = activity.taskPriority; //we get the taskPriority; and make it into a variable called createPriority
        Queue<Tasks> listOfTasksForThisPriority = rankingPriority.get(createPriority);
        //we use our variable createPriority to get /access our HashMap (dictionary) rankingPriority,
        // where the Keys are integers, and the Values are LinkedLists.
        // So we are using our rankingPriority as a key to get a LinkedList,
        // we call that listOfTasksForThisPriority , so it probably is A List of tasks, for this priority
        listOfTasksForThisPriority.offer(activity); //offer is adding that activity at end of queue
        //we offer meaning adding to our LinkedList this activity . Achieving the goal of the function (add)
    }

    public void deleteCompletedTask(Tasks deleteCompletedTask) {
        String completed = "Completed";
        if (deleteCompletedTask.getTaskStatus().matches(completed)) {
        rankingPriority.remove(deleteCompletedTask); }

    }
}