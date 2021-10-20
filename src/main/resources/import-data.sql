CREATE TABLE IF NOT EXISTS event
(
    id
    INT
    NOT
    NULL
    AUTO_INCREMENT,
    title
    VARCHAR
(
    250
) NOT NULL,
    url VARCHAR
(
    255
) NOT NULL,
    clasz VARCHAR
(
    255
) NOT NULL,
    start_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    end_date TIMESTAMP NULL DEFAULT NULL,
    PRIMARY KEY
(
    id
)
    ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE =utf8mb4_unicode_ci;


INSERT INTO `event` (`id`, `title`, `url`, `clasz`, `start_date`, `end_date`)
VALUES (1, 'Example 1', 'http://www.example.com', 'event-success', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
       (2, 'Example 2', 'http://www.example.com', 'event-important', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
       (3, 'Example 3', 'http://www.example.com', 'event-info', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
