-- liquibase formatted sql
-- changeset apprentice:1
CREATE TABLE IF NOT EXISTS `authors` (
author_id int (11) NOT NULL auto_increment,
display_name varchar(256) NOT NULL,
role varchar(256) NOT NULL,
password varchar(256) NOT NULL,
PRIMARY KEY (author_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 auto_increment = 54001;

-- changeset apprentice:2
CREATE TABLE IF NOT EXISTS `posts` (
post_id int (11) NOT NULL AUTO_INCREMENT,
title varchar(256) NOT NULL,
author_id int(11) NOT NULL,
post_body text NOT NULL,
is_static BIT NOT NULL,
is_draft BIT NOT NULL,
post_date datetime NOT NULL,
post_excerpt text NOT NULL,
last_edit_date datetime NOT NULL,
is_private BIT NOT NULL,
PRIMARY KEY (post_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT = 23001;

CREATE TABLE IF NOT EXISTS `tagsposts` (
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
post_id int (11) NOT NULL,
parent_post_id int (11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT 50001;
