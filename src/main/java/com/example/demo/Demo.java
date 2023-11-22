package com.example.demo;

import java.util.Date;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Demo {
    private String name;
    private Long timestamp;
    private Date dateTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;

        // Chuyển đổi timestamp sang Date và đặt giá trị cho dateTime
        if (timestamp != null) {
            this.dateTime = new Date(); // Do timestamp thường là giây, cần nhân 1000 để chuyển sang mili giây
        }
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;

        // (Optional) Cập nhật lại giá trị timestamp nếu muốn
        if (dateTime != null) {
            this.timestamp = dateTime.getTime(); // Chuyển ngược lại thành giây
        }
    }

    // (Optional) Getter và Setter cho dateTime

    // (Optional) Định dạng ngày tháng
    public String getFormattedDateTime() {
        if (dateTime != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SS");
            return sdf.format(dateTime);
        }
        return null;
    }
}



public class Demo {
    private String name;
    private Long timestamp;
    private String dateTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        // (Optional) Cập nhật lại giá trị dateTime nếu muốn
        updateDateTime();
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    // Phương thức cập nhật giá trị dateTime từ timestamp
    public void updateDateTimeFromTimestamp() {
        if (timestamp != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
            Date date = new Date(timestamp);
            this.dateTime = sdf.format(date);
        }
    }