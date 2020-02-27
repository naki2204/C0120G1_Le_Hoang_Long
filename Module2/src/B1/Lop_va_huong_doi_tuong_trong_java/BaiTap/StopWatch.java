package B1.Lop_va_huong_doi_tuong_trong_java.BaiTap;
import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;
    public StopWatch(){
        this.startTime= new Date();
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void start(){
       this.startTime = new Date();
    }

    public void stop(){
        this.endTime = new Date();
    }

    public long getElapsedTime(){
        return (this.getEndTime().getTime()-this.getStartTime().getTime());
    }

}
