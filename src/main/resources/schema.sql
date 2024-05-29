CREATE TABLE IF NOT EXISTS users (
    user_id SERIAL PRIMARY KEY,
    user_name VARCHAR(100) NOT NULL,
    user_email VARCHAR(100) NOT NULL UNIQUE,
    type_user VARCHAR(30) NOT NULL,
    createdAt DATETIME,
    updatedAt DATETIME
);

CREATE UNIQUE INDEX IF NOT EXISTS email_idx ON users (user_email);