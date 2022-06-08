package com.nttdata.proyectobootcampjpa.model.request;

import com.nttdata.proyectobootcampjpa.model.jpa.AccountType;
import com.nttdata.proyectobootcampjpa.model.jpa.Client;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class AccountRequest {

    private int id;
    private String nroCcta;
    private AccountType accountType;
    private boolean status;
    private Double amount;
    private Date createAt;
    private Client client;
}
