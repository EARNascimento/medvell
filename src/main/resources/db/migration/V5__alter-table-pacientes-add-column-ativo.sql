ALTER TABLE pacientes ADD ativo tinyint NOT NULL;

UPDATE pacientes SET ativo = 1;

