CREATE TABLE tb_receitas (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(50),
    descricao VARCHAR(100),
    ingredientes text[]
);