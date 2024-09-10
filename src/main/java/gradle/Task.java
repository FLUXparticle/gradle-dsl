package gradle;

import java.util.*;

public class Task {

    private Collection<Runnable> runnables;

    public Task(Collection<Runnable> runnables) {
        this.runnables = runnables;
    }

    public void execute() {
        for (Runnable runnable : runnables) {
            runnable.run();
        }
    }

}
