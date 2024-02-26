
**Задачи на урок:**

    Деструктуризация
    Получение массива значений/ключей объекта
    Методы массивов

**_JS: Array methods_**

Ссылка на презентацию: [презентация](https://github.com/ait-tr/cohort37.1/blob/main/front_end/lesson_18/JS_Array_methods.pdf)

Homework


    Вы получили массив с ценами на товар (создайте переменную, в которой будет храниться массив). Значения массива [100, 400, 900, 300, 500].
    Необходимо отобразить каждый из элементов массива на странице в отдельном блоке
    Стилизация на ваше усмотрение

_Дополнительная задача: Создайте кнопку "Filter", при нажатии на которую на странице будут отображаться только блоки с ценами > 450_

```html
code/homework/index.html

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <link rel="stylesheet" href="./styles.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>HW17</title>
    <script src="./index.js" defer></script>
  </head>
  <body>
    <div class="page-container">
      <div class="spaceship-container">
        <h1>Spaceship Details</h1>
        <p id="spaceship-name"></p>
        <p id="spaceship-manufacturer"></p>
        <p id="spaceship-crew"></p>
        <p id="spaceship-max-speed"></p>
        <button class="hide-manufacturer-button" type="button">
          Hide Manufacturer
        </button>
      </div>
    </div>
  </body>
</html>
```


```JS
code/homework/index.js

const spaceship = {
  name: "Star Voyager",
  manufacturer: "Galactic Innovations",
  crew: 50,
  maxSpeed: "9.5",
};

// const spaceship = undefined;

let spaceshipName = document.querySelector("#spaceship-name");
let spaceshipManufacturer = document.querySelector("#spaceship-manufacturer");
let spaceshipCrew = document.querySelector("#spaceship-crew");
let spaceshipMaxSpeed = document.querySelector("#spaceship-max-speed");
let hideManufacturerButton = document.querySelector(
  ".hide-manufacturer-button"
);
let spaceshipContainer = document.querySelector(".spaceship-container");

//1 вариант
// spaceshipName.textContent = `Name: ${spaceship.name}`;
// spaceshipManufacturer.textContent = `Manufacturer: ${spaceship.manufacturer}`;
// spaceshipCrew.textContent = `Crew: ${spaceship.crew}`;
// spaceshipMaxSpeed.textContent = `Max speed: ${spaceship.maxSpeed}`;

// const hideManufacturer = () => {
//   spaceshipManufacturer.style.display = "none";
// };

// hideManufacturerButton.addEventListener("click", hideManufacturer);

//2 вариант
if (spaceship !== undefined) {
  let spaceshipNameValue = spaceship.name ? spaceship.name : "-";
  let spaceshipManufacturerValue = spaceship.manufacturer
    ? spaceship.manufacturer
    : "-";
  let spaceshipCrewValue = spaceship.crew ? spaceship.crew : "-";
  let spaceshipMaxSpeedValue = spaceship.maxSpeed ? spaceship.maxSpeed : "-";

  spaceshipName.textContent = `Name: ${spaceshipNameValue}`;
  spaceshipManufacturer.textContent = `Manufacturer: ${spaceshipManufacturerValue}`;
  spaceshipCrew.textContent = `Crew: ${spaceshipCrewValue}`;
  spaceshipMaxSpeed.textContent = `Max speed: ${spaceshipMaxSpeedValue}`;
} else {
  spaceshipContainer.textContent = "Loading...";
}

const hideManufacturer = () => {
  let spaceshipManufacturerValue = '-';
  spaceshipManufacturer.textContent = `Manufacturer: ${spaceshipManufacturerValue}`;
};

hideManufacturerButton.addEventListener("click", hideManufacturer);
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
  background: url(https://img.freepik.com/free-photo/outer-space-background_53876-88651.jpg?w=1380&t=st=1708912426~exp=1708913026~hmac=c71c5ac8628ba095b74031dd4cec6b70619a083334e1e34fe4b1744da0e4a9d4)
    no-repeat;
  background-size: cover;
  font-family: "Courier New", Courier, monospace;
}

.spaceship-container {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  gap: 20px;
  min-height: 350px;
  min-width: 400px;
  max-width: 500px;
  padding: 20px;
  border: 1px solid #151042;
  border-radius: 8px;
  background: #fff;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.spaceship-container > p {
  width: 100%;
}

button {
  width: 100%;
  padding: 10px;
  margin-top: 15px;
  background-color: #0c2057;
  color: #fff;
  border: none;
  border-radius: 6px;
  font-size: 20px;
  cursor: pointer;
}

button:hover {
  background-color: #1b0e49;
}
```


```html
code/lesson/index.html

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <link rel="stylesheet" href="./styles.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Lecture 18</title>
    <script src="./index.js" defer></script>
  </head>
  <body>
    <div class="page-container"></div>
  </body>
</html>
```


```JS
code/lesson/index.js

//Деструктуризация массива
const arrayColor = ["Red", "Blue", "Green"];
const newArrayColor = [...arrayColor];
console.log(arrayColor);
console.log(newArrayColor);
console.log(arrayColor === newArrayColor);

arrayColor[1] = "Grey";
console.log(arrayColor);
console.log(newArrayColor);

const doubleArrays = [...newArrayColor, ...arrayColor];
console.log(doubleArrays);
console.log(arrayColor);
console.log(newArrayColor);

//Деструктуризация объекта
const bookObj = {
  bookName: "Great Gatsby",
  author: "Fitzgerald",
  price: 200,
};

const newBookObj = { ...bookObj };
// console.log(bookObj);
// console.log(newBookObj);
// console.log(bookObj===newBookObj);

newBookObj.price = 300;
console.log(bookObj);
console.log(newBookObj);

newBookObj.bookStore = "Store name;";
console.log(newBookObj);

const doubleBookObj = { ...newBookObj, ...bookObj };
console.log(doubleBookObj);

//Передача аргументов функции

const sum = (a, b, c = 0) => a + b + c;

const numbers = [3, 50, 10];

console.log(sum(...numbers)); // sum(3, 50, 20);

// Деструктурирующее присваивание (массивы)
const fruits = ["apple", "orange"];
const [fruit_1, fruit_2] = fruits;
//const fruit_1 = fruits[0];
//const fruit_2 = fruits[1];
console.log(fruit_1);
console.log(fruit_2);
// console.log(fruit_3);

// Деструктурирующее присваивание (объекты)
const fruitObj = {
  nameFruit: "Lemon",
  price: 10,
};

// let {price: fruitPrice, nameFruit, shop} = fruitObj;
let { price: fruitPrice, nameFruit } = fruitObj;
console.log(fruitPrice);
console.log(nameFruit);
// console.log(shop);

//Получение массива ключей/значений
const person = {
  name: "John",
  age: 23,
  city: ["City", 23],
  isAdmin: true,
};

const keyArrays = Object.keys(person);
console.log(keyArrays);

const valuesArrays = Object.values(person);
console.log(valuesArrays);

let arrayCity = person.city;

//Метод map
const words = ["apple", "cherry", "fruits"];
console.log(words);

const wordsLength = words.map((word) => word.length);
console.log(wordsLength);

const wordsObjects = words.map((word, index) => {
  return {
    wordEl: word,
    position: index + 1,
  };
});
console.log(wordsObjects);

//Метод forEach
const numbersAr = [1, 2, 3];
numbersAr.forEach((num) => console.log(num));

let newNumAr = numbersAr.forEach((num, index, array) => {
  // array[index] = num*2;
  return num;
});

let newNumArWithMap = numbersAr.map((num, index, array) => {
  // return num;
  console.log(num);
});

console.log(newNumArWithMap);
// console.log(numbersAr);
console.log(newNumAr);

//filter
const products = [
  { name: "Pr1", price: 200 },
  { name: "Pr2", price: 240 },
  { name: "Pr3", price: 150 },
];

// const filteredAr = products.filter((product) => product.price >= 200);
const filteredAr = products.find((product) => product.price >= 200);
console.log(filteredAr);

//работа с DOM
// const stringAr = ["Red", "Blue", "Green", 'Black'];
// const pageContainer = document.querySelector(".page-container");

// const elements = stringAr.map((item) => {
//   const divEl = document.createElement("div");
//   divEl.textContent = item;
//   return divEl;
// });

// console.log(elements);

// elements.forEach((element) => pageContainer.append(element));
```
