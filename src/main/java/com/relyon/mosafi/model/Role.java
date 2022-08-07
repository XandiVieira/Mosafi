package com.relyon.mosafi.model;

import com.relyon.mosafi.model.enums.RoleName;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "roles")
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false, unique = true)
    RoleName roleName;

    @Override
    public String getAuthority() {
        return this.roleName.toString();
    }
}
