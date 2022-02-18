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
    @Getter private Long id; // id doesn't need a set method
    @Getter @Setter private String name;
    @Getter @Setter private String email;

    @ManyToOne
    @JoinColumn(name = "department_id") //db foreign key
    private Department departament; // association
}
