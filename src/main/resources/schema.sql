create table customer
(
    id         bigint not null primary key,
    birth_date date not null,
    name       varchar(255) not null,
    surname    varchar(255) not null
);