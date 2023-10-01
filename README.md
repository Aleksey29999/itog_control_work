# itog_control_work

Задание
1. Используя команду cat в терминале операционной системы Linux, создать
два файла Домашние животные (заполнив файл собаками, кошками,
хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
ослы), а затем объединить их. Просмотреть содержимое созданного файла.
Переименовать файл, дав ему новое имя (Друзья человека).

![image](https://github.com/Aleksey29999/itog_control_work/assets/119962645/41b0b586-145f-4c4d-874f-f130a4804423)

![image](https://github.com/Aleksey29999/itog_control_work/assets/119962645/918eaf78-2284-4145-95bb-125e05e7c64e)





2. Создать директорию, переместить файл туда.
![image](https://github.com/Aleksey29999/itog_control_work/assets/119962645/a4e1b597-c110-43c8-827d-bcaf19ec9fa5)

3. Подключить дополнительный репозиторий MySQL. Установить любой пакет
из этого репозитория.
![image](https://github.com/Aleksey29999/itog_control_work/assets/119962645/09704511-1a3b-49cb-881d-4b34a1ae57d2)


4. Установить и удалить deb-пакет с помощью dpkg.
![image](https://github.com/Aleksey29999/itog_control_work/assets/119962645/c67cc350-b5ce-42a7-a837-2de90446c423)

5. Выложить историю команд в терминале ubuntu
    
1.
cat > home_animals
dog cat hamster

cat > pack_animals
Hors camel donkey   
          
cat home_animals pack_animals > frends_people
lexx29@lexx29:~$ nano frends_people


2.
mkdir animals
sudo mv frends_people /home/lexx29/animals/
cd animals
ls -a

3.
sudo apt-get install mysql-server
4.

sudo apt-get remove mysql-server



6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние
животные и вьючные животные, в составы которых в случае домашних
животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные
войдут: Лошади, верблюды и ослы).
![image](https://github.com/Aleksey29999/itog_control_work/assets/119962645/5b91bd03-49a5-4ad8-8a53-e21b865370dc)



7. В подключенном MySQL репозитории создать базу данных “Друзья
человека”

CREATE DATABASE Human_friends;


8. Создать таблицы с иерархией из диаграммы в БД

    USE Human_friends;
CREATE TABLE animal_classes
(
	Id INT AUTO_INCREMENT PRIMARY KEY, 
	Class_name VARCHAR(20)
);

INSERT INTO animal_classes (Class_name)
VALUES ('домашние'),('вьючные');
_________________________________________

CREATE TABLE home_animals
(
	  Id INT AUTO_INCREMENT PRIMARY KEY,
    Genus_name VARCHAR (20),
    Class_id INT,
    FOREIGN KEY (Class_id) REFERENCES animal_classes (Id) 
);

INSERT INTO home_animals (Genus_name, Class_id)
VALUES ('Собаки', 1),
('Кошки', 1),  
('хомяки', 1); 

_______________________________________________________

CREATE TABLE packed_animals
(
	  Id INT AUTO_INCREMENT PRIMARY KEY,
    Genus_name VARCHAR (20),
    Class_id INT,
    FOREIGN KEY (Class_id) REFERENCES animal_classes (Id) 
);

INSERT INTO packed_animals (Genus_name, Class_id)
VALUES ('Лошади', 2),
('верблюды', 2),  
('ослы', 2); 
    
9. Заполнить низкоуровневые таблицы именами(животных), командами
которые они выполняют и датами рождения
CREATE TABLE dogs 
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(20), 
    Birthday DATE,
    Commands VARCHAR(50),
    Genus_id int,
    Foreign KEY (Genus_id) REFERENCES home_animals (Id) 
);
INSERT INTO dogs (Name, Birthday, Commands, Genus_id)
VALUES ("Джек", "2020-03-03", " лежать, лапу, голос", 1),
("Дружок", "2022-07-07", "сидеть, фу, лапу", 1),  
("Уголек", "2021-05-05", "фас, сидеть, лапу", 1), 
("Рыжик", "2023-04-04", "место, лежать, фу, ", 1);

_________________________________________________

CREATE TABLE cats 
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(20), 
    Birthday DATE,
    Commands VARCHAR(50),
    Genus_id int,
    Foreign KEY (Genus_id) REFERENCES home_animals (Id) 
);
INSERT INTO cats (Name, Birthday, Commands, Genus_id)
VALUES ('Лапа', '2015-05-05', 'кс-кс-кс', 2),
('Мурзик', '2019-09-09', "нельзя", 2),  
('Тошка', '2020-02-02', "брысь", 2); 
_________________________________________________

CREATE TABLE hamsters 
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(20), 
    Birthday DATE,
    Commands VARCHAR(50),
    Genus_id int,
    Foreign KEY (Genus_id) REFERENCES home_animals (Id) 
);
INSERT INTO hamsters (Name, Birthday, Commands, Genus_id)
VALUES ("Хомя", "2022-10-10", "Кушать", 3),
("Белый", "2021-01-01", "Кушать", 3),  
("Шустрый", "2023-03-03", "Кушать", 3), 
("Кабан", "2022-12-12", "Кушать", 3);

___________________________________________________

CREATE TABLE horses 
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(20), 
    Birthday DATE,
    Commands VARCHAR(50),
    Genus_id int,
    Foreign KEY (Genus_id) REFERENCES packed_animals (Id) 
);
INSERT INTO horses (Name, Birthday, Commands, Genus_id)
VALUES ("Граф", "2019-09-09", "бегом, шагом", 1),
("Ветер", "2017-07-07", "стой ", 1),  
("Маруся", "2018-08-08", "но", 1), 
("Машка"," 2020-02-02", "шагом, но", 1);
_________________________________________________________

CREATE TABLE camels 
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(20), 
    Birthday DATE,
    Commands VARCHAR(50),
    Genus_id int,
    Foreign KEY (Genus_id) REFERENCES packed_animals (Id)  
);
INSERT INTO camels (Name, Birthday, Commands, Genus_id)
VALUES ("Крассавчик", "2010-10-10", "наклонись", 2),
("Быстрый", "2015-05-05", "пить", 2),  
("Ракета", "2016-06-06", "иди", 2),
("Странник", "2017-07-07", "стой", 2);

_________________________________________________________________



CREATE TABLE donkeys 
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(20), 
    Birthday DATE,
    Commands VARCHAR(50),
    Genus_id int,
    Foreign KEY (Genus_id) REFERENCES packed_animals (Id) 
);
INSERT INTO donkeys (Name, Birthday, Commands, Genus_id)
VALUES ('Ослик', '2019-09-09', "нельзя", 3),
('ИА', '2020-12-12', "фу", 3),  
('Шрэк', '2021-01-01', "иди", 3), 
('Упрямый', '2013-03-03', "стой", 3);


10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.

DELETE FROM camels;

SELECT Name, Birthday, Commands FROM horses
UNION SELECT  Name, Birthday, Commands FROM donkeys;


11.Создать новую таблицу “молодые животные” в которую попадут все
животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
до месяца подсчитать возраст животных в новой таблице


CREATE TEMPORARY TABLE animals AS 
SELECT *, 'Лошади' as genus FROM horses
UNION SELECT *, 'Ослы' AS genus FROM donkeys
UNION SELECT *, 'Собаки' AS genus FROM dogs
UNION SELECT *, 'Кошки' AS genus FROM cats
UNION SELECT *, 'Хомяки' AS genus FROM hamsters;

CREATE TABLE yang_animal AS
SELECT Name, Birthday, Commands, genus, TIMESTAMPDIFF(MONTH, Birthday, CURDATE()) AS Age_in_month
FROM animals WHERE Birthday BETWEEN ADDDATE(curdate(), INTERVAL -3 YEAR) AND ADDDATE(CURDATE(), INTERVAL -1 YEAR);
 
SELECT * FROM yang_animal;


12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
прошлую принадлежность к старым таблицам.

SELECT h.Name, h.Birthday, h.Commands, pa.Genus_name, ya.Age_in_month 
FROM horses h
LEFT JOIN yang_animal ya ON ya.Name = h.Name
LEFT JOIN packed_animals pa ON pa.Id = h.Genus_id
UNION 
SELECT d.Name, d.Birthday, d.Commands, pa.Genus_name, ya.Age_in_month 
FROM donkeys d 
LEFT JOIN yang_animal ya ON ya.Name = d.Name
LEFT JOIN packed_animals pa ON pa.Id = d.Genus_id
UNION
SELECT c.Name, c.Birthday, c.Commands, ha.Genus_name, ya.Age_in_month 
FROM cats c
LEFT JOIN yang_animal ya ON ya.Name = c.Name
LEFT JOIN home_animals ha ON ha.Id = c.Genus_id
UNION
SELECT d.Name, d.Birthday, d.Commands, ha.Genus_name, ya.Age_in_month 
FROM dogs d
LEFT JOIN yang_animal ya ON ya.Name = d.Name
LEFT JOIN home_animals ha ON ha.Id = d.Genus_id
UNION
SELECT hm.Name, hm.Birthday, hm.Commands, ha.Genus_name, ya.Age_in_month 
FROM hamsters hm
LEFT JOIN yang_animal ya ON ya.Name = hm.Name
LEFT JOIN home_animals ha ON ha.Id = hm.Genus_id;



13.Создать класс с Инкапсуляцией методов и наследованием по диаграмме.
20. Написать программу, имитирующую работу реестра домашних животных.
В программе должен быть реализован следующий функционал:
14.1 Завести новое животное
14.2 определять животное в правильный класс
14.3 увидеть список команд, которое выполняет животное
14.4 обучить животное новым командам
14.5 Реализовать навигацию по меню
15.Создайте класс Счетчик, у которого есть метод add(), увеличивающий̆
значение внутренней̆int переменной̆на 1 при нажатие “Завести новое
животное” Сделайте так, чтобы с объектом такого типа можно было работать в
блоке try-with-resources. Нужно бросить исключение, если работа с объектом
типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение
считать в ресурсе try, если при заведения животного заполнены все поля.
