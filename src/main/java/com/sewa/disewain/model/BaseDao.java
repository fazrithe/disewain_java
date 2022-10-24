package com.sewa.disewain.model;


import com.sewa.disewain.constan.AppConstan;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

@Data
@SuperBuilder
@MappedSuperclass
@NoArgsConstructor
public abstract class BaseDao {


    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "created_by", nullable = false)
    private String createdBy;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updateAt;

    @PrePersist
    void onCreate(){
        this.createdAt = LocalDateTime.now();
        this.createdBy = AppConstan.CREATE_BY_SYSTEM;
        this.updateAt = LocalDateTime.now();
        this.isDeleted = false;
    }

    @PreUpdate
    void onUpdate(){
        this.updateAt = LocalDateTime.now();
    }
}