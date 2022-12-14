

INSERT INTO usuario (id, email, password) VALUES (1, 'admin@gmail.com', 'admin');
INSERT INTO usuario (id, email, password) VALUES (2, 'adoptante@gmail.com', 'adoptante');
INSERT INTO usuario (id, email, password) VALUES (3, 'adoptante02@gmail.com', 'adoptante02');

INSERT INTO admin (id, dni, nombres, usuario_id) VALUES (1, '7541234', 'Manuel Quispe', 1);

INSERT INTO adoptante (id, fecha_registro, usuario_id) VALUES (1, '2022-05-14', 2);
INSERT INTO adoptante (id, fecha_registro, usuario_id) VALUES (2, '2022-06-14', 3);

INSERT INTO
    perfil_adoptante (id, celular, correo, direccion, dni, edad, nombres, adoptante_id)
VALUES
    (1, '987654321', 'adoptante@gmail.com', 'Su Casa', '789456123', 21, 'Luis Siccha', 1),
    (2, '957654321', 'adoptante02@gmail.com', 'Su Depa', '7821356123', 25, 'Gabriel Siccha', 2);

INSERT INTO
    voluntario (id, celular, correo, direccion, dni, edad, fecha_registro, nombres, admin_id)
VALUES
    (1, '987456232', 'voluntario01@gmail.com', 'Su otra casa', '789456123', 24, '2022-10-21', 'Voluntario Desrosiers', 1),
    (2, '789451232', 'voluntario02@gmail.com', 'Casa su otra', '789421323', 30, '2022-10-14', 'Voluntario Quispe', 1),
    (3, '584657887', 'voluntario03@gmail.com', 'Su depa', '21312312', 18, '2022-10-15', 'Voluntario Trujillo', 1),
    (4, '474855645', 'voluntario04@gmail.com', 'Su otro depa', '782131243', 16, '2022-10-20', 'Voluntario Grados', 1);

INSERT INTO mascota (id, adoptada, nombres, raza, tamanio)
VALUES
    (1, false, 'Firulais 01', 'Labrador', 'Grande'),
    (2, false, 'Firulais 02', 'Husky', 'Grande'),
    (3, false, 'Firulais 03', 'Chihuahua', 'Pequenio'),
    (4, true, 'Firulais 04', 'Beagle', 'Mediano'),
    (5, true, 'Firulais 05', 'Schnauzer', 'Pequenio'),
    (6, false, 'Firulais 06', 'Bull Terrier', 'Mediano');

INSERT INTO
    solicitud (id, aceptada, en_espera, fecha_solicitud, mensaje, adoptante_id, mascota_id)
VALUES
    (1, false, true, '2022-11-12', 'Una solicitud en espera', 1, 1),
    (2, false, true, '2022-11-14', 'Otra solicitud en espera', 1, 2),
    (3, false, false, '2022-11-15', 'Una solicitud denegada', 1, 3),
    (4, false, false, '2022-11-16', 'Otra solicitud denegada', 1, 6),
    (5, true, false, '2022-11-17', 'Una solicitud aceptada', 2, 4),
    (6, true, false, '2022-11-18', 'Otra solicitud aceptada', 2, 5);
