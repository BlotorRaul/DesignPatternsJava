package task;

import java.util.List;

public interface TaskObserver {
    void update(List<String> tasks);
}
