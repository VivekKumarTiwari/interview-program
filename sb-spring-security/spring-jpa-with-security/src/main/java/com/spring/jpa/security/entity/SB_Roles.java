package com.spring.jpa.security.entity;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "sb_roles")
public class SB_Roles {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true)
    private String roleName;

    @ManyToMany(mappedBy = "roles")
    private Set<UserEntity> users=new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(Set<UserEntity> users) {
        this.users = users;
    }

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SB_Roles sbRoles)) return false;
        return Objects.equals(id, sbRoles.id) && Objects.equals(roleName, sbRoles.roleName) && Objects.equals(users, sbRoles.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roleName, users);
    }*/
}
