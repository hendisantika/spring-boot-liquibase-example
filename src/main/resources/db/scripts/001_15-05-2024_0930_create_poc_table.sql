--liquibase formatted sql
--changeset hendisantika:001.1
CREATE SEQUENCE poc_sequence MINVALUE 1 MAXVALUE 9999999999 INCREMENT BY 1 START WITH 1 CACHE 20;
CREATE TABLE poc
(
    id   serial NOT NULL,
    name varchar(255) NULL
);
--rollback DROP SEQUENCE POC_SEQUENCE;
--rollback DROP TABLE POC;

--liquibase formatted sql
--changeset hendisantika:001.2 context:test
INSERT INTO poc
VALUES (1, 'Poc Test 1');
INSERT INTO poc
VALUES (2, 'Poc Test 2');
--rollback DELETE FROM POC WHERE NAME in('Poc Test 1', 'Poc Test 2');
