// Exercise 5: Task Management System

class Task {
    int taskId;
    String taskName;
    String status;
    Task next;

    Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.next = null;
    }
}

class TaskList {
    Task head = null;

    void addTask(Task task) {
        task.next = head;
        head = task;
    }

    Task searchTask(int taskId) {
        Task current = head;
        while (current != null) {
            if (current.taskId == taskId) return current;
            current = current.next;
        }
        return null;
    }

    void traverseTasks() {
        Task current = head;
        while (current != null) {
            System.out.println(current.taskName + " - " + current.status);
            current = current.next;
        }
    }

    void deleteTask(int taskId) {
        Task current = head, prev = null;
        while (current != null && current.taskId != taskId) {
            prev = current;
            current = current.next;
        }
        if (current != null) {
            if (prev != null) prev.next = current.next;
            else head = current.next;
        }
    }
}
