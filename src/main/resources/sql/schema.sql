CREATE TABLE IF NOT EXISTS movie(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(40) NOT NULL,
    rating DECIMAL(3,1) NOT NULL
);
