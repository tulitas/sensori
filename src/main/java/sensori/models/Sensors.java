package sensori.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sensors")
public class Sensors implements Serializable {

    @Id
    @Column(name = "sensor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long sensor_id;

    @Column(name = "serial_code")
    private String serial_code;

    @Column(name = "name")
    private String name;

    public long getSensor_id() {
        return sensor_id;
    }

    public void setSensor_id(long sensor_id) {
        this.sensor_id = sensor_id;
    }

    public String getSerial_code() {
        return serial_code;
    }

    public void setSerial_code(String serial_code) {
        this.serial_code = serial_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sensors{" +
                "sensor_id=" + sensor_id +
                ", serial_code='" + serial_code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
