package com.alaythiaproduction.managementapp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class VehicleMaintenance extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="vehicleid", insertable=false, updatable=false)
    private Vehicle vehicle;
    private Long vehicleid;

    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private Date startDate;

    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private Date endDate;

    private String price;

    @ManyToOne
    @JoinColumn(name="supplierid", insertable=false, updatable=false)
    private Supplier supplier;
    private Long supplierid;

    private String remarks;

}
