-- Tabla de productos
CREATE TABLE IF NOT EXISTS productos (
                                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                         nombre VARCHAR(255) NOT NULL,
    categoria VARCHAR(100) NOT NULL,
    stock INT NOT NULL CHECK (stock >= 0),
    precio DECIMAL(10,2) NOT NULL CHECK (precio > 0),
    proveedor_id BIGINT NOT NULL
    );

-- Tabla de proveedores
CREATE TABLE IF NOT EXISTS proveedores (
                                           id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                           nombre VARCHAR(255) NOT NULL,
    contacto VARCHAR(255) NOT NULL
    );

-- Tabla de entradas de productos
CREATE TABLE IF NOT EXISTS entradas_productos (
                                                  id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                                  producto_id BIGINT NOT NULL,
                                                  cantidad INT NOT NULL CHECK (cantidad > 0),
    fecha DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (producto_id) REFERENCES productos(id) ON DELETE CASCADE
    );

-- Tabla de salidas de productos
CREATE TABLE IF NOT EXISTS salidas_productos (
                                                 id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                                 producto_id BIGINT NOT NULL,
                                                 cantidad INT NOT NULL CHECK (cantidad > 0),
    fecha DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (producto_id) REFERENCES productos(id) ON DELETE CASCADE
    );
