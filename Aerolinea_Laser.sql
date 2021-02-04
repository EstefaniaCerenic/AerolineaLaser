create database Aerolinea_Laser;
use Aerolinea_Laser;

create table Usuario(
idUsuario int primary key auto_increment,
nombreUsuario varchar(20) not null,
contrasena varchar(20) not null
);

insert into persona(nombreUsuario,contrasena) values
(Carlos,123);