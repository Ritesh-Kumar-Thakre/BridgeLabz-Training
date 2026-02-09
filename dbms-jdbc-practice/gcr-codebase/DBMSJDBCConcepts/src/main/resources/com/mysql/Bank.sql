-- created database and useing it 
CREATE DATABASE Bank;
USE Bank;

-- creating account tabl for all banck accounts
CREATE TABLE accounts(
account_id INT PRIMARY KEY NOT NULL,
account_name VARCHAR(50),
account_balance DECIMAL(10,2)
);

-- created transactions table to store all transactions history 
CREATE TABLE transactions(
 txn_id INT AUTO_INCREMENT PRIMARY KEY,
    from_account INT,
    to_account INT,
    amount DECIMAL(10,2),
    txn_type VARCHAR(20),
    txn_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- insert data into account table
INSERT INTO accounts VALUES(53432424,"Ritesh Thakre",150304);
INSERT INTO accounts VALUES(53432344,"Ram Raj",150304);
INSERT INTO accounts VALUES(53413411,"Rohan Das",150304);
INSERT INTO accounts VALUES(53486432,"Sohan Garg",150304);

SELECT account_name, account_balance FROM accounts WHERE account_id=53432424;

-- transation process started
START TRANSACTION;

-- Deduct money 
UPDATE accounts 
SET account_balance =account_balance-5000
WHERE account_id=53432424;

-- add money to receiver
UPDATE accounts
SET account_balance=account_balance+5000
WHERE account_id = 53432344;

-- inserting histor into transation table
INSERT INTO transactions ( txn_id,from_account, to_account,amount,txn_type)
VALUE (15248,53432424,53432344,5000,'TRANSFER');

COMMIT;

-- display all transation data
SELECT * FROM transactions;