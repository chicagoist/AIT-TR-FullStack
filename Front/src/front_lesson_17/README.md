
Задачи на урок:

    Создание объекта
    Работа с ключами

JS: Object

Ссылка на презентацию: презентация
Homework
Задание

    Предположим вы получили объект с данными (создайте переменную, в которой будет храниться объект) - spaceship, в котором находятся характеристики космического корабля, такие как:
    name
    manufacturer
    crew
    maxSpeed
    Необходимо отобразить их на странице.
    Стилизация на ваше усмотрение

Дополнительная задача: Создайте кнопку "Hide Manufacturer", которая будет скрывать manufacturer корабля на странице

```html
code/homework/index.html

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <link rel="stylesheet" href="./styles.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>UserData project</title>
    <script src="./index.js" defer></script>
  </head>
  <body>
    <div class="page-container">
      <div class="card form-container">
        <h2>Enter Your Data</h2>
        <form id="user-form">
          <label for="userName">Name:</label>
          <input id="userName" name="userName" required />
          <label for="surname">Surname:</label>
          <input id="surname" name="surname" required />
          <label for="email">Email:</label>
          <input type="email" id="email" name="email" required />
          <label for="phone">Phone Number:</label>
          <input type="tel" id="phone" name="phone" required />
          <button class="send-data-button">Send Data</button>
        </form>
      </div>
      <div class="card data-container">
        <h2>Your Data</h2>
        <div class="user-card">
          <p id=""></p>
        </div>
      </div>
    </div>
  </body>
</html>
```


```JS
code/homework/index.js

let sendDataButton = document.querySelector(".send-data-button");
let form = document.querySelector("#user-form");
let userCard = document.querySelector(".user-card");
let formContainer = document.querySelector(".form-container");
let dataContainer = document.querySelector(".data-container");

let sendData = (event) => {
  event.preventDefault();
  let userName = form.userName.value;
  let userSurname = form.surname.value;
  let userEmail = form.email.value;
  let userPhone = form.phone.value;

  userCard.innerHTML = `
  <p>Name: ${userName}</p>
  <p>Surname: ${userSurname}</p>
  <p>Email: ${userEmail}</p>
  <p>Phone number: ${userPhone}</p>
  `;

  formContainer.style.display = "none";
  dataContainer.style.display = "flex";
};

form.addEventListener("submit", sendData);
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
  font-family: "Courier New", Courier, monospace;
}

.card {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  gap: 20px;
  min-width: 400px;
  max-width: 500px;
  padding: 20px;
  border: 1px solid #ccc;
  border-radius: 8px;
  background-color: #fff;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.data-container {
  display: none;
}

.user-card {
  display: flex;
  flex-direction: column;
  justify-content: center;
  gap: 30px;
  width: 100%;
  font-size: 22px;
}

input {
  width: 100%;
  padding: 8px;
  margin: 10px 0 15px;
}

button {
  width: 100%;
  padding: 10px;
  margin-top: 15px;
  background-color: #9f5bc7;
  color: #fff;
  border: none;
  border-radius: 6px;
  font-size: 20px;
  cursor: pointer;
}

button:hover {
  background-color: #53145f;
}
```

```JS
code/lesson/index.js

//создание объекта
const emptyPerson = {};
console.log(emptyPerson);

const person = {
  name: "Tom",
  age: 23,
  isAdmin: true,
};

console.log(person);

let userName = person.name; //получение (копирование) значения свойства name
console.log(userName);

person.name = "Bob"; //изменение значения свойства name
console.log(person);
console.log(person.name);
userName = person.name;
console.log(userName);

//добавление свойства в person
person.phone = "+4579999030";
console.log(person);

//добавление свойства в person с помощью брекет синтаксиса
person["likes dogs"] = true;
console.log(person);

//возврат значения с помощью брекет синтаксиса
console.log(person["likes dogs"]);
console.log(person["age"]);

//удаление свойств объекта
delete person.age;
console.log(person);

//оператор in
// console.log("age" in person);

//for..in -цикл выводит ключи
for (let key in person) {
  console.log(person[key]); //1 итерации - person["name"]
}

//сложная структура объекта
const mainShop = {
  shop: "Book store",
  books: {
    price: 300,
    names: ["Book1", "Book2", "Book3"],
  },
  sayHi() {
    console.log("Hi");
  },
  //  function sayHi () {
  //   console.log("Hi");
  // },
};

console.log(mainShop.books.names[1]);
mainShop.sayHi();

//Reference type
let price = 200;
let newPrice = price;
console.log(price, newPrice);
price = 300;
console.log(price, newPrice);

const clientData = {
  company: "Company name",
  clientName: "Bill",
};

const userData = {
  company: "Company name",
  clientName: "Bill",
};
// userData = {};
// console.log(userData);

console.log(clientData===userData);

const newClient = clientData;
console.log(clientData);
console.log(newClient);

clientData.company = "New name";
console.log(clientData);
console.log(newClient);

newClient.clientName = "Tom";
console.log(clientData);
console.log(newClient);

console.log(newClient === clientData);


//Пример работы с дом
// let title = document.querySelector('h1');

// title.textContent = `User name: ${userData.clientName}`;
```
