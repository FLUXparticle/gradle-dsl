import gradle.TasksBuilder.Companion.tasks

fun main() {

    println("=== Phase 2 ===")
    tasks.register("myTask") {
        println("Hallo 1")
        doFirst {
            println("Anfang!")
        }
        doLast {
            println("Ende!")
        }
    }

    tasks.register("aTask") {
        println("Hallo 2")
        doLast {
            println("Ende!")
        }
        doFirst {
            println("Anfang!")
        }
    }

    println("=== Phase 3 ===")
    tasks.execute()
}
