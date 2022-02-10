public class StopWatch {
    long startTime;
    long endTime;
    public StopWatch() {
    }

    public void start() {
       startTime = System.currentTimeMillis();
    }
    public long stop(){
    endTime=System.currentTimeMillis();
    return endTime-startTime;
    }
}
