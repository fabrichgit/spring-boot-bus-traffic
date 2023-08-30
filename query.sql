INSERT INTO identity_place (id_identity_place, start_place, terminus, identity)
VALUES (1, 'Andranomena', 'Mosaule', '194');
INSERT INTO identity_place (id_identity_place, start_place, terminus, identity)
VALUES (2, 'Ambohitrarahaba', 'Anosy', '109');
INSERT INTO identity_place (id_identity_place, start_place, terminus, identity)
VALUES (3, 'Anosy', '67 ha', '163');
INSERT INTO identity_place (id_identity_place, start_place, terminus, identity)
VALUES (4, '67 ha', 'Ivato', 'D');



																
INSERT INTO driver (id_driver, driver_firstname, driver_lastname, driver_age)
VALUES (1, 'John', 'Doe', 28);


INSERT INTO driver (id_driver, driver_firstname, driver_lastname, driver_age)
VALUES (2, 'Jane', 'Smith', 35);


INSERT INTO driver (id_driver, driver_firstname, driver_lastname, driver_age)
VALUES (3, 'Michael', 'Johnson', 22);


INSERT INTO driver (id_driver, driver_firstname, driver_lastname, driver_age)
VALUES (4, 'Emily', 'Williams', 29);


INSERT INTO driver (id_driver, driver_firstname, driver_lastname, driver_age)
VALUES (5, 'David', 'Brown', 41);


INSERT INTO driver (id_driver, driver_firstname, driver_lastname, driver_age)
VALUES (6, 'Sarah', 'Jones', 27);


INSERT INTO driver (id_driver, driver_firstname, driver_lastname, driver_age)
VALUES (7, 'Christopher', 'Miller', 33);


INSERT INTO driver (id_driver, driver_firstname, driver_lastname, driver_age)
VALUES (8, 'Amanda', 'Davis', 30);


INSERT INTO driver (id_driver, driver_firstname, driver_lastname, driver_age)
VALUES (9, 'Matthew', 'Wilson', 38);

INSERT INTO driver (id_driver, driver_firstname, driver_lastname, driver_age)
VALUES (10, 'Jessica', 'Moore', 25);









INSERT INTO car (id_car, car_identity, fk_id_identity_place, fk_id_driver)
VALUES
    (2, '109', 2, 2),
    (3, '163', 3, 3),
    (4, 'Zone D', 4, 4),
    (5, '194', 1, 5),
    (6, '109', 2, 6),
    (7, '163', 3, 7),
    (8, 'Zone D', 4, 8),
    (9, '194', 1, 9),
    (10, '109', 2, 10),
    (1, '194', 4, 1);







INSERT INTO receiver (id_receiver, receiver_firstname, receiver_lastname, receiver_age)
VALUES (1, 'Alice', 'Smith', 28);


INSERT INTO receiver (id_receiver, receiver_firstname, receiver_lastname, receiver_age)
VALUES (2, 'Bob', 'Johnson', 35);


INSERT INTO receiver (id_receiver, receiver_firstname, receiver_lastname, receiver_age)
VALUES (3, 'Carol', 'Williams', 22);


INSERT INTO receiver (id_receiver, receiver_firstname, receiver_lastname, receiver_age)
VALUES (4, 'David', 'Brown', 29);


INSERT INTO receiver (id_receiver, receiver_firstname, receiver_lastname, receiver_age)
VALUES (5, 'Eva', 'Davis', 41);


INSERT INTO receiver (id_receiver, receiver_firstname, receiver_lastname, receiver_age)
VALUES (6, 'Frank', 'Jones', 27);


INSERT INTO receiver (id_receiver, receiver_firstname, receiver_lastname, receiver_age)
VALUES (7, 'Grace', 'Miller', 33);


INSERT INTO receiver (id_receiver, receiver_firstname, receiver_lastname, receiver_age)
VALUES (8, 'Henry', 'Wilson', 30);


INSERT INTO receiver (id_receiver, receiver_firstname, receiver_lastname, receiver_age)
VALUES (9, 'Isabel', 'Moore', 38);


INSERT INTO receiver (id_receiver, receiver_firstname, receiver_lastname, receiver_age)
VALUES (10, 'Jack', 'Taylor', 25);







INSERT INTO people (id_people, people_firstname, people_lastname, people_age)
VALUES
  (1, 'Alice', 'Smith', 28),
  (2, 'Bob', 'Johnson', 35),
  (3, 'Carol', 'Williams', 22),
  (4, 'David', 'Brown', 29),
  (5, 'Eva', 'Davis', 41),
  (6, 'Frank', 'Jones', 27),
  (7, 'Grace', 'Miller', 33),
  (8, 'Henry', 'Wilson', 30),
  (9, 'Isabel', 'Moore', 38),
  (10, 'Jack', 'Taylor', 25),
  (11, 'Kate', 'Clark', 31),
  (12, 'Liam', 'Martinez', 27),
(11, 'Kate', 'Clark', 31),
  (12, 'Liam', 'Martinez', 27),
  (13, 'Emma', 'Lopez', 23),
  (14, 'Noah', 'Hernandez', 29),
  (15, 'Olivia', 'Garcia', 26),
  (16, 'William', 'Adams', 32),
  (17, 'Ava', 'Anderson', 35),
  (18, 'James', 'Brown', 40),
  (19, 'Sophia', 'Davis', 28),
  (20, 'Logan', 'Evans', 33),
  -- Continuer avec les enregistrements 21 à 100...
  (21, 'Mia', 'Foster', 22),
  (22, 'Benjamin', 'Gonzalez', 39)







INSERT INTO trip (id_trip, fk_id_car, fk_id_receiver, date_of_going)
VALUES (1, 1, 1, '2023-08-20 12:00:00');

INSERT INTO trip (id_trip, fk_id_car, fk_id_receiver, date_of_going)
VALUES (2, 2, 2, '2023-08-23 14:30:00');

INSERT INTO trip (id_trip, fk_id_car, fk_id_receiver, date_of_going)
VALUES (3, 3, 3, '2023-08-25 09:15:00');

INSERT INTO trip (id_trip, fk_id_car, fk_id_receiver, date_of_going)
VALUES (4, 4, 4, '2023-08-27 16:45:00');

INSERT INTO trip (id_trip, fk_id_car, fk_id_receiver, date_of_going)
VALUES (5, 5, 5, '2023-08-29 11:30:00');






INSERT INTO passenger (id_passenger, fk_id_people, fk_id_trip)
VALUES
  (1, 2, 3),
  (2, 16, 2),
  (3, 11, 5),
  (4, 17, 5),
  (5, 5, 5),
  (6, 9, 3),
  (7, 19, 5),
  (8, 11, 4),
  (9, 20, 3),
  (10, 1, 1),
  (11, 4, 1),
  (12, 20, 4),
  (13, 9, 4),
  (14, 11, 4),
  (15, 6, 4),
  (16, 10, 4),
  (17, 18, 4),
  (18, 17, 4),
  (19, 5, 5),
  (20, 4, 5),
  (24, 6, 8),
  (25, 6, 8);









