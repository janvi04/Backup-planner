
package hib.dto;


public class Operator {
   private String day;
   private String date;
   private String time;
   private String topic;

    public Operator() {
    }

    public Operator(String day, String date, String time, String topic) {
        this.day = day;
        this.date = date;
        this.time = time;
        this.topic = topic;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
   
    
    
    
    
}
