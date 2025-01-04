package com.uber.uber.app.entities;

import com.uber.uber.app.entities.enums.Roles;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "app_user")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;

  @Column(unique = true)
  private String email;
  private String password;

  @ElementCollection(fetch = FetchType.LAZY)
  @Enumerated(EnumType.ORDINAL)
  private Set<Roles> roles;

}
