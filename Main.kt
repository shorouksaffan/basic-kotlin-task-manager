//Creating a data class Task
data class Task(val title: String, val isDone: Boolean)

fun main() {
    //Declaring a mutable list of tasks using val and adding 3 sample tasks
    val tasks= mutableListOf(Task("submit assignment", true),
        Task("clean the house", false),
        Task("study", true))

    //Looping over each task and printing status
    for (task in tasks) {
        if (task.isDone) {
            println("✅ ${task.title}")
        } 
        else {
            println("❌ ${task.title}")
        }
    }
}
