CREATE TABLE todo (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    task VARCHAR(255),
    completed BOOLEAN
);


Insert into todo (task, completed) values
('Demo Data', false);