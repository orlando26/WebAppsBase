create table APP_USER(
	Apu_Id int not null AUTO_INCREMENT,
    Apu_Name varchar(255) not null,
    Apu_LastName varchar(255) not null,
    Apu_Email varchar(255) not null,
    Apu_Password varchar(255) not null,
    primary key(Apu_Id)
);