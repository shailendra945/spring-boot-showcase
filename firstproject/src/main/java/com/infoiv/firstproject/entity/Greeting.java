package com.infoiv.firstproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="greeting_details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Greeting {

    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String message;

}
