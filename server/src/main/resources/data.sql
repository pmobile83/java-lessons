DROP TABLE IF EXISTS Cards;
DROP TABLE IF EXISTS Accounts;
DROP TABLE IF EXISTS Clients;

CREATE TABLE Clients (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  clientNumber INT,
  lastName VARCHAR,
  firstName VARCHAR,
  middleName VARCHAR
);

CREATE TABLE Accounts (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  accNumber VARCHAR,
  balance INT DEFAULT 0,
  currency VARCHAR NOT NULL,
  client_id  INT NOT NULL,
  foreign key (client_id) references Clients(id)
);

CREATE TABLE Cards (
  id INT AUTO_INCREMENT PRIMARY KEY,
  cardNumber VARCHAR,
  cardholder VARCHAR,
  cardExpire INT,
  pin INT,
  cvc2 INT,
  account_id INT NOT NULL,
  foreign key (account_id) references Accounts(id)
);


INSERT INTO Clients (clientNumber, lastName, firstName, middleName) VALUES
  (10001, 'Иванов',  'Иван', 'Иванович'),
  (10002, 'Петров',  'Петр', 'Петрович'),
  (10003, 'Сидоров', 'Сидр', 'Сидорович');

INSERT INTO Accounts (accNumber, balance, currency, client_id) VALUES
  ('40817 810 000000 000001', 1000, 'RUR', 1),
  ('40817 840 000000 000001', 2000, 'USD', 2),
  ('40817 978 000000 000001', 3000, 'EUR', 3);

INSERT INTO Cards (cardNumber, cardholder, cardExpire, pin, cvc2, account_id) VALUES
  ('1111 2222 3333 4444', 'IVANOV  IVAN', 2106, 1111, 111, 1),
  ('2222 3333 4444 5555', 'PETROV  PETR', 2207, 2222, 222, 2),
  ('3333 4444 5555 6666', 'SIDOROV SIDR', 2308, 3333, 333, 3);


