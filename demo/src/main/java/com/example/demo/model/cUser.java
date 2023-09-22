package com.example.demo.model;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "\"User\"")
public class cUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserId;

    @NotBlank
    @Column(name = "Name")
    private String UserName;


}
