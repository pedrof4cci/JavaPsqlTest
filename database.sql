create database byte_bank;



CREATE TABLE conta (
    numero INTEGER NOT NULL,
    saldo DECIMAL(10, 2) NOT NULL DEFAULT 0.00,
    cliente_nome VARCHAR(50) NOT NULL,
    cliente_cpf VARCHAR(11) NOT NULL,
    cliente_email VARCHAR(50) NOT NULL,
    PRIMARY KEY (numero)
);
