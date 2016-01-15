-- liquibase formatted sql
-- changeset apprentice:1

CREATE TABLE IF NOT EXISTS `users` (
user_id int (11) NOT NULL auto_increment,
username varchar(256) NOT NULL,
email varcharacter (256) NOT NULL,
password varchar(256) NOT NULL,
PRIMARY KEY (user_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 auto_increment = 54001;

-- changeset apprentice:2
CREATE TABLE IF NOT EXISTS `posts` (
post_id int (11) NOT NULL AUTO_INCREMENT,
title varchar(256) NOT NULL,
user_id int(11) NOT NULL,
post_body text NOT NULL,
is_static BIT NOT NULL,
is_draft BIT NOT NULL,
post_date datetime NOT NULL,
post_excerpt text NOT NULL,
last_edit_date datetime NOT NULL,
is_private BIT NOT NULL,
PRIMARY KEY (post_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT = 23001;

CREATE TABLE IF NOT EXISTS `tags_posts` (
tags_posts_id int (11) NOT NULL AUTO_INCREMENT,
tag_id int(11) NOT NULL,
post_id int(11) NOT NULL,
PRIMARY KEY (tags_posts_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT 10001;

CREATE TABLE IF NOT EXISTS `tags` (
tag_id int (11) NOT NULL AUTO_INCREMENT,
tag_name VARCHAR (256) NOT NULL,
PRIMARY KEY (tag_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT 20001;

CREATE TABLE IF NOT EXISTS `parent_child` (
post_id int (11) NOT NULL ,
parent_post_id int (11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT 50001;

CREATE TABLE IF NOT EXISTS `roles` (
role_id int (11) NOT NULL AUTO_INCREMENT,
role_name varchar (256) NOT NULL,
PRIMARY KEY (role_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT 40001;

CREATE TABLE IF NOT EXISTS `users_roles` (
role_id int (11) NOT NULL AUTO_INCREMENT,
user_id int (11) NOT NULL,
PRIMARY KEY (role_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT 40001;

CREATE TABLE IF NOT EXISTS `comments` (
comment_id int (11) NOT NULL AUTO_INCREMENT,
user_id int (11) NOT NULL,
comment_body TEXT NOT NULL,
comment_date DATETIME NOT NULL,
PRIMARY KEY (comment_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT 40001;

ALTER TABLE posts
    ADD CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES users(user_id);

ALTER TABLE tags_posts
    ADD CONSTRAINT fk_post_id FOREIGN KEY (post_id) REFERENCES posts(post_id);

ALTER TABLE tags_posts
    ADD CONSTRAINT fk_tag_id FOREIGN KEY (tag_id) REFERENCES tags(tag_id);

CREATE INDEX PostTitleIndex ON posts(title);

ALTER TABLE parent_child
    ADD CONSTRAINT fk_parent FOREIGN KEY (parent_post_id) REFERENCES posts(post_id);

ALTER TABLE comments
    ADD CONSTRAINT fk_comments FOREIGN KEY (user_id) REFERENCES users(user_id);


-- changeset brett_hanson:3
ALTER TABLE users_roles
    ADD CONSTRAINT fk_roles_user_id FOREIGN KEY (user_id) REFERENCES users(user_id);

ALTER TABLE users_roles
    ADD CONSTRAINT fk_role_id FOREIGN KEY (role_id) REFERENCES roles(role_id);

ALTER TABLE posts
    DROP COLUMN is_static;

ALTER TABLE posts
	DROP COLUMN is_draft;

CREATE TABLE IF NOT EXISTS `static_pages`(
post_id int (11) NOT NULL AUTO_INCREMENT,
title varchar(256) NOT NULL,
user_id int(11) NOT NULL,
post_body text NOT NULL,
post_date datetime NOT NULL,
post_excerpt text NOT NULL,
last_edit_date datetime NOT NULL,
is_private BIT NOT NULL,
PRIMARY KEY (post_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT = 23001;

ALTER TABLE static_pages
	ADD CONSTRAINT fk_static_user_id FOREIGN KEY (user_id) REFERENCES users(user_id);

-- changeset brett_hanson: 4

ALTER TABLE parent_child
DROP FOREIGN KEY fk_parent;

DROP TABLE parent_child;

-- changeset brett_hanson: 5
ALTER TABLE comments
ADD post_id INT(11);

ALTER TABLE comments
    ADD CONSTRAINT fk_pages_post_id FOREIGN KEY (post_id) REFERENCES posts(post_id);

