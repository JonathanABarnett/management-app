package com.alaythiaproduction.managementapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String othername;
    private String title;
    private String initials;
    private String socialSecurityNumber;
    private String gender;
    private String maritalStatus;

    @ManyToOne
    @JoinColumn(name="countryid", insertable=false, updatable=false)
    private Country country;
    private Long countryid;

    @ManyToOne
    @JoinColumn(name="stateid", insertable=false, updatable=false)
    private State state;
    private Long stateid;

    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private Date dateOfBirth;
    private String city;
    private String address;
    private String phone;
    private String mobile;
    private String email;
    private String photo;
}
