import java.util.concurrent.Callable;

public class SandBoxThread implements Callable<String>{
    private int sent = 0;

    SandBoxThread( int sent ) {
        this.sent = sent;
    }

    @Override
    public String call() {
        synchronized (this) {
            System.out.println("a");
        }
        return "a";
    }
}
