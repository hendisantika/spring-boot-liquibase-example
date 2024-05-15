package id.my.hendisantika.liquibase.repository;

import id.my.hendisantika.liquibase.entity.Poc;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-liquibase-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/15/24
 * Time: 10:12
 * To change this template use File | Settings | File Templates.
 */
public interface PocRepository extends JpaRepository<Poc, Long> {
}
