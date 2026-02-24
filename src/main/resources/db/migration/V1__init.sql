CREATE TABLE users
(
    id         BIGINT PRIMARY KEY,
    last_name  VARCHAR(255) NOT NULL,
    first_name VARCHAR(255) NOT NULL
);

CREATE TABLE task_lists
(
    id          BIGINT PRIMARY KEY,
    description VARCHAR(255) NOT NULL
);

CREATE TABLE tasks
(
    id           BIGINT PRIMARY KEY,
    description  VARCHAR(255) NOT NULL,
    user_id      BIGINT,
    task_list_id BIGINT,
    CONSTRAINT fk_task_users FOREIGN KEY (user_id) REFERENCES users (id),
    CONSTRAINT fk_task_task_lists FOREIGN KEY (task_list_id) REFERENCES task_lists (id)
);
