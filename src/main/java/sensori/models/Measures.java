package sensori.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "measures")
public class Measures implements Serializable {
    @Id
    @Column(name = "reading_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reading_id;

    @Column(name = "sensor_id")
    private Integer sensor_id;

    @Column(name = "metric_id")
    private Integer metric_id;

    @Column(name = "rtime")
    private String rtime;

    @Column(name = "rvalue")
    private double rvalue;

    public long getReading_id() {
        return reading_id;
    }

    public void setReading_id(long reading_id) {
        this.reading_id = reading_id;
    }

    public Integer getSensor_id() {
        return sensor_id;
    }

    public void setSensor_id(Integer sensor_id) {
        this.sensor_id = sensor_id;
    }

    public Integer getMetric_id() {
        return metric_id;
    }

    public void setMetric_id(Integer metric_id) {
        this.metric_id = metric_id;
    }

    public String getRtime() {
        return rtime;
    }

    public void setRtime(String rtime) {
        this.rtime = rtime;
    }

    public double getRvalue() {
        return rvalue;
    }

    public void setRvalue(double rvalue) {
        this.rvalue = rvalue;
    }

    @Override
    public String toString() {
        return "Measures{" +
                "reading_id=" + reading_id +
                ", sensor_id=" + sensor_id +
                ", metric_id=" + metric_id +
                ", rtime='" + rtime + '\'' +
                ", rvalue=" + rvalue +
                '}';
    }
}
