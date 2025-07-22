//Creating a data class Task
data class Task(val title: String, val isDone: Boolean)
//Function to check whether the task is done or not rather than the loop
fun printTask(task: Task) {
     if (task.isDone) {
            println("✅ ${task.title}")
        } 
        else {
            println("❌ ${task.title}")
        }
}

fun main() {
   //Declaring a mutable list of tasks using val and adding 3 sample tasks
   val tasks= mutableListOf(Task("submit assignment", true),
        Task("clean the house", false),
        Task("study", true))
//Looping through each task and print its status using printTask()
    for (task in tasks) {
        printTask(task)
    }
}
