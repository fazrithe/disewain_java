package com.sewa.disewain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity()
@Table(name = "users")
@NoArgsConstructor
@Where(clause = "is_deleted = false")
public class UserModel extends BaseDao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "username", nullable = false)
    private String usernmae;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    public void getEmail(String email) {
    }

    public void getPassword(String password) {
    }

    public void getUsername(String username) {
    }
}
