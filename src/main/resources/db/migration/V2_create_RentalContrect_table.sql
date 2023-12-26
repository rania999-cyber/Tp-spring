CREATE TABLE rental_contract (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    property_id BIGINT,
    owner_id BIGINT,
    tenant VARCHAR(255),
    monthly_rent DOUBLE,
    FOREIGN KEY (property_id) REFERENCES property(id),
    FOREIGN KEY (owner_id) REFERENCES owner(id)
);
