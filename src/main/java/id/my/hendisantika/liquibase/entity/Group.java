package id.my.hendisantika.liquibase.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.OffsetDateTime;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-liquibase-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/15/24
 * Time: 10:06
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "groups", schema = "public")
@Data
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(unique = true, length = 100)
    private String name;

    @Column(unique = true, length = 500)
    private String description;

    @Column(name = "created_time")
    private OffsetDateTime createdTime;

    @Column(name = "modified_time")
    private OffsetDateTime modifiedTime;
}
