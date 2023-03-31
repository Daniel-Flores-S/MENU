    CREATE TABLE variant (
        id SERIAL PRIMARY KEY,
        name VARCHAR(255) NOT NULL,
        code VARCHAR(255) NOT NULL,
        description TEXT NOT NULL,
        price DOUBLE PRECISION,
        image_url VARCHAR(255) NOT NULL,
        snack_id INT NOT NULL,
        FOREIGN KEY (snack_id) REFERENCES snack (id)
    );