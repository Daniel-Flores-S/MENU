CREATE TABLE company (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    currency VARCHAR(10) NOT NULL,
    pdv_logo_svg VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password_hashed VARCHAR(255) NOT NULL,
    cellphone VARCHAR(20) NOT NULL,
    telephone VARCHAR(20),
    company_country VARCHAR(255) NOT NULL,
    company_postal_code VARCHAR(20) NOT NULL,
    company_name VARCHAR(255) NOT NULL
);
