package com.example.demo.model;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table( name ="Tasks")
public class Tasks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;

    @NotBlank
    @Column(name = "TaskName", nullable = false)
    private String TaskName;

    @NotBlank
    @Column(name = "TaskDescription")
    private String TaskDescription;

    @Column(name = "Date")
    private String dateString;

    @Column(name = "Completed")
    private boolean completed;


}
