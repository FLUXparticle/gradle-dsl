package gradle

import java.util.TreeMap

class TasksBuilder private constructor() {

    private val taskMap: MutableMap<String, Task> = TreeMap()

    fun register(name: String, block: TasksScope.() -> Unit) {
        val scope = TasksScope()
        block.invoke(scope)
        val task = scope.build()

        taskMap[name] = task
    }

    fun execute() {
        for ((key, value) in taskMap) {
            println("$key:")
            value.execute()
        }
    }

    companion object {
        val tasks: TasksBuilder = TasksBuilder()
    }

}
