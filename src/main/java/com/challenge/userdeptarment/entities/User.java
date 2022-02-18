package com.challenge.userdeptarment.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter private Long id;
    @Getter @Setter private String userName;
    @Getter @Setter private String email;

    @ManyToOne
    @JoinColumn(name = "department_id") //db foreign key
    private Departament departament; // association
}
