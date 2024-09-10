package gradle;

import java.util.*;

public class TasksScope {

    private final Deque<Runnable> runnables = new ArrayDeque<>();

    Task build() {
        return new Task(runnables);
    }

    public void doLast(Runnable runnable) {
        runnables.addLast(runnable);
    }

    public void doFirst(Runnable runnable) {
        runnables.addFirst(runnable);
    }

}
