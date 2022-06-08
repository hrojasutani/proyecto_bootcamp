package com.nttdata.proyectobootcampjpa.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientRequest {

    private int id;
    private String name;
    private String lastname;
    private String phone;
    private String email;
    private boolean status;

}
