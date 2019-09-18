
import com.cs.ObversblerDemo.Observable.Observatory;
import com.cs.ObversblerDemo.Observers.Student;
import com.cs.ObversblerDemo.Observers.Worker;

/**
 * @Author chens
 * @create 2019/9/17 17:33
 */
public class Test {
    static Observatory observatory = new Observatory();

    public static void main(String[] args) {
        Student student = new Student();
        observatory.addObserver(student);
        Worker worker = new Worker();
        observatory.addObserver(worker);
        observatory.notifyObservers();
    }
}
