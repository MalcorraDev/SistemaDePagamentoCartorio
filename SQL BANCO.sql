CREATE DATABASE cartoriodb;
USE cartoriodb;


CREATE TABLE cliente (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(14),
    telefone VARCHAR(20),
    email VARCHAR(100)
);

INSERT INTO cliente (nome, cpf, telefone, email) 
VALUES ('Padrão (PIX/Balcão)', '00000000000', '00000000000', 'padrao@sistema.com');



CREATE TABLE servico (
    id_servico INT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(100) NOT NULL,
    valor DECIMAL(10,2) NOT NULL,
    tipo VARCHAR(50)
);

INSERT INTO servico (descricao, valor) VALUES
('Certidão de Nascimento', 45.50),
('Certidão de Casamento', 55.51),
('Certidão de Óbito', 35.00),
('Cancelamento de Protesto', 0.00), 
('Outros (Especificar)', 0.00); 

SELECT * FROM servico;

UPDATE servico
SET valor = 55.51
WHERE descricao LIKE 'Certidão%';



CREATE TABLE transacao (
    id_transacao INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT NOT NULL,
    id_servico INT NOT NULL,
    data DATE NOT NULL,
    FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente),
    FOREIGN KEY (id_servico) REFERENCES servico(id_servico)
);

ALTER TABLE transacao
ADD COLUMN valor DECIMAL(10,2) NOT NULL;

SELECT * FROM servico;
SELECT * FROM transacao;
SELECT * FROM cliente;
