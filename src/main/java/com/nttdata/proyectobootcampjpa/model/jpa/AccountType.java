package com.nttdata.proyectobootcampjpa.model.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "account_type")
@Getter
@Setter
public class AccountType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;
}
