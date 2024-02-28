
Задачи на урок:

    Прототип
    This
    Global object
    Методы: call, apply, bind

JS:Prototypes

Ссылка на презентацию: презентация
Homework
Задание

Создать персонажей для игры с помощью прототипного наследования и this

    Создайте объект character, представляющий следующие характеристики и действие для всех персонажей:
        свойства name (имя), health (здоровье), level (уровень)
        метод introduce для character, который выводит в консоль информацию о персонаже, например: "Hello, my name is [name], I am at level [level], and I have [health] health." - на квадратные скобки не обращайте внимание, они для схемы, чтобы указать на переменные значения

    Создайте объект warrior, который будет наследовать свойства и методы от character, также при создании объекта добавьте в него:
        свойства name (имя), health (здоровье), level (уровень), weapon (оружие)
        метод attack, который выводит сообщение в консоль о нападении и название оружия (внутри использовать значение из weapon)

    Создайте объект wizard, наследующий свойства и методы от character, также при создании объекта добавьте в него:
        свойства name (имя), health (здоровье), level (уровень), spell (заклинание)
        метод castSpell, который выводит сообщение в консоль о том, как персонаж произносит заклинание (внутри использовать значение из spell).

Результат должен состоять из следующих действий:

    вызова метода introduce для каждого из объектов
    вызова метода attack для объекта warrior
    вызова метода castSpell для объекта wizard


```html
code/homework/index.html

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <link rel="stylesheet" href="./styles.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>HW19</title>
    <script src="./index.js" defer></script>
  </head>
  <body>
    <div class="page-container">
      <div class="cards-container hidden"></div>
      <button class="get-data-button" type="button">Get Data</button>
    </div>
  </body>
</html>
```


```js
code/homework/index.js

const usersData = [
{
name: "John Doe",
age: 25,
email: "john.doe@example.com",
city: "New York",
profession: "Software Engineer",
},
{
name: "Alice Johnson",
age: 30,
email: "alice.johnson@example.com",
city: "Los Angeles",
profession: "Data Scientist",
},
{
name: "Bob Smith",
age: 28,
email: "bob.smith@example.com",
city: "Chicago",
profession: "Graphic Designer",
},
{
name: "Eva Davis",
age: 22,
email: "eva.davis@example.com",
city: "Miami",
profession: "Marketing Specialist",
},
{
name: "David Wilson",
age: 35,
email: "david.wilson@example.com",
city: "San Francisco",
profession: "Product Manager",
},
];

const cardsContainer = document.querySelector(".cards-container");
const getDataButton = document.querySelector(".get-data-button");

const createCard = (userObject) => {
let userCard = document.createElement("div");
userCard.innerHTML = `
<h2 class='card-title'>${userObject.name}</h2>
  <p>Age: ${userObject.age}</p>
  <p>Email: ${userObject.email}</p>
  <p>City: ${userObject.city}</p>
  <p>Profession: ${userObject.profession}</p>
  `;
  return userCard;
};

const getData = () => {
usersData.forEach((userData) => {
let card = createCard(userData);
cardsContainer.append(card);
});

cardsContainer.classList.remove("hidden");
getDataButton.classList.add("hidden");
};

getDataButton.addEventListener("click", getData);
```

```css
code/homework/styles.css

* {
  box-sizing: border-box;
  }

html,
body {
height: 100%;
margin: 0;
padding: 0;
}

h1,
h2,
h3,
h4,
h5,
h6,
p,
ul,
li {
margin: 0;
padding: 0;
}

.page-container {
display: flex;
flex-direction: column;
justify-content: center;
align-items: center;
width: 100%;
height: 100%;
background: rgb(11, 14, 59);
background-size: cover;
font-family: "Courier New", Courier, monospace;
}

.cards-container {
display: flex;
justify-content: center;
align-items: center;
flex-wrap: wrap;
gap: 20px;
padding: 20px;
border-radius: 8px;
background: #fff;
box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.cards-container > div {
display: flex;
flex-direction: column;
justify-content: center;
gap: 10px;
min-height: 300px;
padding: 20px;
background: rgb(98, 101, 144);
font-size: 20px;
font-weight: bold;
}

.card-title {
color: white;
font-size: 30px;
}

.get-data-button {
width: 600px;
height: 200px;
padding: 10px;
margin-top: 15px;
background-color: #5e7bca;
color: #fff;
border: none;
border-radius: 6px;
border: 2px solid white;
font-size: 32px;
cursor: pointer;
}

.get-data-button:hover {
background-color: #1b0e49;
}

.hidden {
display: none;
}
```


```js
code/lesson/index.js

//prototypes
const band = {
bandName: "Rock band",
};

const musician = {
isSing: true,
isPlay: true,
play() {
console.log("Bum");
},
__proto__: band,
};

const eltonJohn = {
name: "Elton John",
__proto__: musician,
// __proto__: band
};

const michaelJackson = {
name: "Michael Jackson",
};

// console.log(eltonJohn.name);

console.log(eltonJohn.__proto__);
console.log(musician.__proto__);
console.log(band.__proto__);

eltonJohn.play();

Object.setPrototypeOf(michaelJackson, musician);
michaelJackson.play();
console.log(Object.getPrototypeOf(michaelJackson));

//this
const person = {
name: "Bill",
introduce() {
console.log(`Hello, ${this.name}`);
},
};

const newPerson = {
name: "Tom",
// __proto__: person,
};

// newPerson.introduce();

function hello() {
console.log(`User - ${this.name}`);
}

person.sayPerson = hello;
newPerson.sayUser = hello;

person.sayPerson();
newPerson.sayUser();

//this - стрелочные функции
const obj = {
name: "Jane",
greet: () => {
console.log(`Name: ${this.name}`);
},
};

obj.greet();

//глобальный объект
console.log(window);
// var wow = 'wow';

//call,apply,bind
function greetFunc(name, age) {
console.log(`Hello, ${name} - ${age}! My name is ${this.name}`);
}

const johnObj = {
name: "John Doe",
position: "Developer",
};

const janeObj = {
name: "Jane Doe",
position: "Designer",
};

greetFunc.call(johnObj, "Kate", 23);
// greetFunc.call(janeObj, "Kate", 23);

greetFunc.apply(janeObj, ["Tom", 45]);

const greetFuncWithObj = greetFunc.bind(johnObj, "Bob", 35);
greetFuncWithObj(33);
// console.log(greetFuncWithObj);
```

```html
code/lesson/index.html

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <link rel="stylesheet" href="./styles.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Lesson 20</title>
    <script src="./index.js" defer></script>
  </head>
  <body>
    <div class="page-container"></div>
  </body>
</html>
```
