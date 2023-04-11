package com.UST.interviewSchedule.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="interview_table")
public class interview {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String phNo;
    private String skills;
    private String experience;
    private Date date;
    private String time;
    private String link;
    private String poc;
}


