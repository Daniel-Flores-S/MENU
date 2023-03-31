CREATE TABLE category (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    pdv_route VARCHAR(255) NOT NULL,
    button_svg VARCHAR(255) NOT NULL,
    company_id INT NOT NULL,
    created_at TIMESTAMP NOT NULL,
    type VARCHAR(255),
    status VARCHAR(20) NOT NULL,
    FOREIGN KEY (company_id) REFERENCES company (id)
);
