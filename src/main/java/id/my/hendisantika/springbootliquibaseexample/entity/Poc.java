package id.my.hendisantika.springbootliquibaseexample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-liquibase-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/15/24
 * Time: 10:11
 * To change this template use File | Settings | File Templates.
 */
@Entity(name = "poc")
@SequenceGenerator(sequenceName = "POC_SEQUENCE", name = "POC_SEQUENCE", initialValue = 1, allocationSize = 1)
public class Poc implements Serializable {

    @Id
    @GeneratedValue(generator = "POC_SEQUENCE", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
}
