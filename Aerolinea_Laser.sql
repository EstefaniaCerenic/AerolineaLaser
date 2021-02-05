create database Aerolinea_Laser;
use Aerolinea_Laser;

create table Usuario(
id_usuario int primary key auto_increment,
nombre_usuario varchar(20) not null,
contrasena varchar(20) not null
);

describe Usuario;


select * from usuario;

insert into usuario(nombre_usuario,contrasena) values
("admin","123");

insert into usuario(nombre_usuario,contrasena) values
("usertur","123");

insert into usuario(nombre_usuario,contrasena) values
("userpre","123");

delete from usuario where id_usuario=2;
