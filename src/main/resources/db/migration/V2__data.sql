insert into users(id, last_name, first_name) values (1, 'Moore', 'Roger');
insert into users(id, last_name, first_name) values (2, 'Connery', 'Sean');

insert into task_lists(id, description) values (1, 'TODO');
insert into task_lists(id, description) values (2, 'DOING');
insert into task_lists(id, description) values (3, 'DONE');

insert into tasks(id, description, user_id, task_list_id) values (1, 'Git', 1, 1);
insert into tasks(id, description, user_id, task_list_id) values (2, 'Ajout services', 1, 2);
insert into tasks(id, description, user_id, task_list_id) values (3, 'Tests', 2, 2);
