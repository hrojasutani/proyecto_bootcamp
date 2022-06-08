package com.nttdata.proyectobootcampjpa.model.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "account")
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nro_cta", length = 15, nullable = false)
    private String nroCcta;

    @OneToOne
    private AccountType accountType;

    @Column(name = "status")
    private boolean status;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "create_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

}
