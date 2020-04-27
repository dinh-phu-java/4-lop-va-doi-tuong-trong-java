import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

public class StopWatch {
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public StopWatch(){
        this.startTime=LocalDateTime.now();
    }
    public void start(){
        this.startTime=LocalDateTime.now();
    }
    public void stop(){
        this.endTime=LocalDateTime.now();
    }
    public int getElapseTime(){
        Calendar cldStart=Calendar.getInstance();
        Calendar cldEnd= Calendar.getInstance();
        cldStart.set(this.startTime.getYear(),this.startTime.getMonthValue(),this.startTime.getDayOfMonth(), this.startTime.getHour(),this.startTime.getMinute(),this.startTime.getSecond());
        cldEnd.set(this.endTime.getYear(),this.endTime.getMonthValue(),this.endTime.getDayOfMonth(),this.endTime.getHour(),this.endTime.getMinute(),this.endTime.getSecond());
        return (int)cldEnd.getTimeInMillis() - (int)cldStart.getTimeInMillis();
    }

}
