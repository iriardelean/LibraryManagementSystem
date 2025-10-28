package com.example.librarymanagementsystem.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

public class Reservation {
    private String Id;
    private String memberId;
    private String ReadableitemId;
    private Date date;
    private ReservationStatus ReservationStatus;

    public Reservation(String id, String memberId, String readableitemId, Date date, ReservationStatus ReservationStatus) {
        Id = id;
        this.memberId = memberId;
        ReadableitemId = readableitemId;
        this.date = date;
        this.ReservationStatus = ReservationStatus;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getReadableitemId() {
        return ReadableitemId;
    }

    public void setReadableitemId(String readableitemId) {
        ReadableitemId = readableitemId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ReservationStatus getStatus() {
        return ReservationStatus;
    }

    public void setStatus(ReservationStatus ReservationStatus) {
        this.ReservationStatus = ReservationStatus;
    }

}
