package com.lcwd.userservice.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name= "MicroService")

public class User {
     @Id
     @Column(name = "Id")
     private String userId;

     @Column(name= "Name" , length = 15)
     private String name ;

     @Column(name="Email")
     private String email;

     @Column(name= "about")
     private String about;
}

