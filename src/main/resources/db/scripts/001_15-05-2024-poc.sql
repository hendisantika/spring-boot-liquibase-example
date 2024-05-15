--liquibase formatted sql
--changeset fabio.barbosa:001.1
CREATE SEQUENCE poc_sequence MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20;
CREATE TABLE poc
(
    id   number(19) NOT NULL,
    name varchar2(255) NULL
);
--rollback DROP SEQUENCE POC_SEQUENCE;
--rollback DROP TABLE POC;

--liquibase formatted sql
--changeset fabio.barbosa:001.2 context:test
INSERT INTO poc
VALUES (poc_sequence.nextval, 'Poc Test 1');
INSERT INTO poc
VALUES (poc_sequence.nextval, 'Poc Test 2');
--rollback DELETE FROM POC WHERE NAME in('Poc Test 1', 'Poc Test 2');
