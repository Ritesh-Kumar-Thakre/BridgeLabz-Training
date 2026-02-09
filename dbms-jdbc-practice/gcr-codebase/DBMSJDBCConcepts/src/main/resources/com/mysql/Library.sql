-- database created and used
CREATE DATABASE library;
USE library;

-- creating book table
CREATE TABLE books (
    book_id INT PRIMARY KEY,
    title VARCHAR(200),
    author VARCHAR(100),
    category VARCHAR(50),
    total_copies INT,
    available_copies INT
);

-- creating student table
CREATE TABLE students (
    student_id INT PRIMARY KEY,
    name VARCHAR(100),
    department VARCHAR(50)
);

-- creating borrow_records table
CREATE TABLE borrow_records (
    borrow_id INT AUTO_INCREMENT PRIMARY KEY,
    student_id INT,
    book_id INT,
    borrow_date DATE,
    return_date DATE,
    due_date DATE,
    FOREIGN KEY (student_id) REFERENCES students(student_id),
    FOREIGN KEY (book_id) REFERENCES books(book_id)
);

-- creating fines tabel
CREATE TABLE fines (
    fine_id INT AUTO_INCREMENT PRIMARY KEY,
    borrow_id INT,
    fine_amount DECIMAL(8,2),
    FOREIGN KEY (borrow_id) REFERENCES borrow_records(borrow_id)
);

-- inserting data into books
INSERT INTO books VALUES
(1, 'Clean Code', 'Robert Martin', 'Programming', 5, 3),
(2, 'DBMS Concepts', 'Korth', 'Database', 4, 2);

-- inserting data into students
INSERT INTO students VALUES
(101, 'Ritesh', 'CSE'),
(102, 'Amit', 'IT');

-- transaction started
START TRANSACTION;

INSERT INTO borrow_records
(student_id, book_id, borrow_date, due_date)
VALUES
(101, 1, CURDATE(), DATE_ADD(CURDATE(), INTERVAL 14 DAY));

UPDATE books
SET available_copies = available_copies - 1
WHERE book_id = 1;

COMMIT;

-- updating borrow_record
UPDATE borrow_records
SET return_date = CURDATE()
WHERE borrow_id = 1;

-- updating books
UPDATE books
SET available_copies = available_copies + 1
WHERE book_id = 1;

-- inserting into fine 5rs per day
INSERT INTO fines (borrow_id, fine_amount)
SELECT borrow_id,
       DATEDIFF(CURDATE(), due_date) * 5
FROM borrow_records
WHERE return_date IS NULL
AND CURDATE() > due_date;

-- search functionality with multiple filters
-- all details
SELECT s.name, b.title, f.fine_amount
FROM fines f
JOIN borrow_records br ON f.borrow_id = br.borrow_id
JOIN students s ON br.student_id = s.student_id
JOIN books b ON br.book_id = b.book_id;

-- search by title + author
SELECT * FROM books
WHERE title LIKE '%Code%'
AND author LIKE '%Martin%';

-- search by category + availability
SELECT * FROM books
WHERE category = 'Programming'
AND available_copies > 0;

-- searching borrowed books by student
SELECT s.name, b.title, br.borrow_date, br.due_date
FROM borrow_records br
JOIN students s ON br.student_id = s.student_id
JOIN books b ON br.book_id = b.book_id
WHERE s.student_id = 101;