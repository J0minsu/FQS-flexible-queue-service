package com.f4.fqs.user.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "p_single")
@NoArgsConstructor
public class IAMUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private RootUser rootUser;

    @Column(name = "name",nullable = false)
    private String name;
    
    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "role")
    private UserRoleEnum role;

    @Builder
    public IAMUser(RootUser rootUser, String email, String password, UserRoleEnum role, String name) {
        this.rootUser = rootUser;
        this.email = email;
        this.name = name;
        this.password = password;
        this.role = role;
    }

}
