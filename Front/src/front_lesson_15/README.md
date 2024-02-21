Задачи на урок:

    Методы DOM
    Получение данных из формы

**JS: DOM methods**

Ссылка на презентацию: [презентация](https://github.com/ait-tr/cohort37.1/blob/main/front_end/lesson_15/JS_DOM_methods.pdf)

**Homework**


Нужно создать веб-страницу, на которой будут расположены три кнопки.

Действия, которые должны происходить при нажатии на кнопки:

    Первая кнопка меняет цвет фона всей страницы
    Вторая кнопка меняет название первой кнопки
    Третья кнопка добавляет заголовок на страницу


```js
code/homework/index.js

// Необходимо создать функцию с названием arrayProcessor, которая будет принимать два параметра, первый параметр - массив, второй параметр - функция callback

// Требования:

// Функция arrayProcessor должна выполнять 3 действия:
// первое действие - преобразовать каждый элемент, в переданном массиве, в строку, результат должен сохраняться в новом массиве (то есть не мутировать входной массив)
// вызывать функцию, которая была передана в параметрах (функция callback будет принимать в качестве параметра преобразованный на первом шаге массив)
// возвращать то, что вернула функция callback после её вызова

// Чтобы показать пример использования функции arrayProcessor вам нужно:
// создать ещё две функции (требования к функциям см. в пункте 3)
// вызвать arrayProcessor с каждой из функций по очереди
// каждый из 2-х результатов вывести в консоль

// Требования к функциям callback
// первая функция должна преобразовывать каждый элемент массива в верхний регист и возвращать новый массив с преобразованными элементами
// вторая функция должна возвращать сумму длин всех строк в массиве

let arrayProcessor = (inputArray, operateOnArray) => {
let stringArray = []; //1
for (let i = 0; i < inputArray.length; i++) {
stringArray.push(String(inputArray[i]));
}
let resultOperationOnArray = operateOnArray(stringArray); //2
return resultOperationOnArray; //3
};

let function1 = (initialArray) => {
let upperCaseStringArray = [];
for (let i = 0; i < initialArray.length; i++) {
upperCaseStringArray.push(initialArray[i].toUpperCase());
}
return upperCaseStringArray;
};

let function2 = (initialArray) => {
let sumStrings = 0;
for (let i = 0; i < initialArray.length; i++) {
sumStrings += initialArray[i].length;
// console.log(sumStrings);
}
//for(let elementArray of initialArray){
//   ...
// sumStrings += elementArray.length;
// }
return sumStrings;
};

let userArray= ["Tom", "Bob", "Bill"];

// console.log(arrayProcessor([1, true, "Hi", null], function1));
// console.log(arrayProcessor(["Red", "Blue", "Green "], function2));
console.log(arrayProcessor(userArray, function1));
console.log(arrayProcessor(userArray, function2));
```

```html
code/lesson/index.html

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <link rel="stylesheet" href="./styles.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Lesson 15</title>
    <script src="./index.js" defer></script>
  </head>
  <body>
    <div class="main-container">
      <h1 class="title main-title">Main title</h1>
      <button type="button" class="show-button">Show card</button>
      <div id="container">
        <h2 class="title">User Card</h2>
        <ul class="list">
          <li>23</li>
          <li>Male</li>
          <li>Project manager</li>
        </ul>
        <a href="">Info</a>
        <input id='search' name="search" placeholder="search" />
        <button type="button" class="card-button">Hide card</button>
        <form id="main-form">
          <input id='name-field' name="userName" placeholder="Name" />
          <input name="password" placeholder="Password" />
          <button class="getData" type="button">get data</button>
        </form> 
      </div>
    </div>
  </body>
</html>
```


```js
code/lesson/index.js

//Add element
//1 step
let newElement = document.createElement("li");
console.log(newElement);
//2 step
newElement.textContent = "Your first element";
console.log(newElement);
//3 step
let list = document.querySelector(".list");
// list.append(newElement);
// list.prepend(newElement);
// list.after(newElement);
list.before(newElement);
// document.querySelector('.list').list.before(newElement);

//Change elements
let mainTitle = document.querySelector(".main-title");
let mainTitleText = mainTitle.textContent;
console.log(mainTitleText);

let listElements = list.innerHTML;
console.log(listElements);
console.log(typeof listElements);

let userCardTitle = document.querySelector("h2");
userCardTitle.innerHTML = "User fired";

mainTitle.style.color = "#2b5547";
document.querySelector(".main-container").style.backgroundColor = "#f4f7c3";

userCardTitle.remove();

//events
//show-hide card
let hideCardButton = document.querySelector(".card-button");
let showCardButton = document.querySelector(".show-button");
let card = document.querySelector("#container");

let hideCard = () => {
card.style.display = "none";
};

let showCard = () => {
card.style.display = "flex";
};

hideCardButton.addEventListener("click", hideCard);
showCardButton.addEventListener("click", showCard);

//input
let searchField = document.querySelector("#search");

// let funcChange = (eventT) => {
//   console.log(eventT.target.value);
//   alert(eventT.target.value);
// };

searchField.addEventListener("change", (eventT) => {
console.log(eventT.target.value);
alert(eventT.target.value);
});

//preventDefault
let link = document.querySelector("a");

let changeDefault = (event) => {
event.preventDefault();
//любые действия
alert("User not found");
};

link.addEventListener("click", changeDefault);

//Form
let getDataButton = document.querySelector(".getData");

let getDataFunction = () => {
const form = document.querySelector("#main-form");
console.log(form);
let nameField = form.elements["userName"].value;
console.log(nameField);
let passwordField = form.password.value;
console.log(passwordField);
console.log(nameField, passwordField);
};

getDataButton.addEventListener("click", getDataFunction);

/*примечание: ошибка в форме отсутствовала, но из-за
комментирования строк в html:
<input id='search' name="search" placeholder="search" />
<button type="button" class="card-button">Hide card</button>
сломался код выше в строке 47 */
```


```css
code/lesson/styles.css

* {
  box-sizing: border-box;
  }

body,
html {
height: 100%;
margin: 0;
padding: 0;
}

.main-container {
display: flex;
flex-direction: column;
justify-content: center;
align-items: center;
width: 100%;
height: 100%;
}

#container {
display: flex;
flex-direction: column;
justify-content: center;
align-items: center;
width: 500px;
height: 600px;
margin: 30px;
background-color: aquamarine;
font-size: 26px;
}
```
