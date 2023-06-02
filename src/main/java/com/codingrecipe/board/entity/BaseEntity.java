package com.codingrecipe.board.entity;

import lombok.Getter;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;


//다른 DTO에 etends로 상속시킬 수 있다.
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
public class BaseEntity {
    @CreationTimestamp
    @Column(updatable = false)      //updatable = false =====>업데이트시 관여 X
    private LocalDateTime createdTime;

    @UpdateTimestamp
    @Column(insertable = false)     //insertable = false =======>인서트시 관여 X
    private LocalDateTime updatedTime;
}
