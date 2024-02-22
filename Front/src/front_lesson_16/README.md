
**Задачи на урок:**

    Создание программы расчёта идеального веса
    Самостоятельная практика

_**JS: DOM practice**_

Ссылка на презентацию: [презентация](https://github.com/ait-tr/cohort37.1/blob/main/front_end/lesson_16/JS_DOM_practice.pdf)

**Homework**


Закончить самостоятельную работу, 
которую вы начали делать на уроке.

Самостоятельное задание:

    Создайте веб-страницу с формой, в которой пользователь может вводить свои данные:
    name
    surname
    email
    phone number
    После заполнения формы и нажатия кнопки "Send Data", на странице должна появиться карточка с введенными данными, а форма исчезнуть
    Стилизуйте веб-страницу


```html
code/homework/index.html

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <link rel="stylesheet" href="./styles.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>HW</title>
    <script src="./index.js" defer></script>
  </head>
  <body>
    <div class="page-container">
      <h2>Buttons</h2>
      <div class="container">
        <button type="button" class="change-background-button">Change background</button>
        <button type="button" class="change-name-button">Change name</button>
        <button type="button" class="add-title-button">Add title</button>
      </div>
    </div>
  </body>
</html>
```

```js
code/homework/index.js

// Нужно создать веб-страницу, на которой будут расположены три кнопки.
// Действия, которые должны происходить при нажатии на кнопки:
// Первая кнопка меняет цвет фона всей страницы
// Вторая кнопка меняет название первой кнопки
// Третья кнопка добавляет заголовок на страницу

let changeBackgroundButton = document.querySelector(
".change-background-button"
);
let changeNameButton = document.querySelector(".change-name-button");
let addTitleButton = document.querySelector(".add-title-button");
let pageContainer = document.querySelector(".page-container");
let containerButtons = document.querySelector(".container");
let secondTitle = document.querySelector("h2");

let changeBackground = () => (pageContainer.style.background = "#f2c884");

let changeButtonName = () => {
changeBackgroundButton.textContent = "New name";
};

let title = document.createElement("h1");
let addTitle = () => {
// title.textContent = "Main title";
// containerButtons.before(title);

title.textContent = "Main title";
secondTitle.after(title);
};

changeBackgroundButton.addEventListener("click", changeBackground);
changeNameButton.addEventListener("click", changeButtonName);
addTitleButton.addEventListener("click", addTitle);
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
min-height: 100%;
}

.container {
display: flex;
flex-direction: column;
justify-content: center;
align-items: center;
gap: 30px;
width: 500px;
height: 600px;
margin: 30px;
background-color: rgb(227, 255, 127);
font-size: 26px;
}

button {
height: 70px;
padding: 10px;
background-color: rgb(9, 55, 38);
border: 2px solid rgb(54, 119, 49);
border-radius: 6px;
font-size: 24px;
color: azure;
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
    <title>Lesson 16</title>
    <script src="./index.js" defer></script>
  </head>
  <body>
    <div class="main-container">
      <h1>Форма рассчёта идеального веса</h1>
      <div class="card">
        <form id="form">
          <label for="height">Рост, см</label>
          <input
            class="height-input"
            name="height"
            id="height"
            type="number"
            placeholder="Введите свой рост"
          />
          <label for="gender">Выберете пол:</label>
          <select class="gender-select" name="gender" id="gender">
            <option value="male">Мужской</option>
            <option value="female">Женский</option>
          </select>
          <button type="button" class="result-button">Рассчитать</button>
          <div class="result">Здесь будет результат</div>
        </form>
      </div>
    </div>
  </body>
</html>
```

```js
code/lesson/index.js

let buttonResult = document.querySelector(".result-button");
let result = document.querySelector(".result");

let calculateIdealWeight = () => {
const form = document.querySelector("#form");
let height = form.height.value;
let gender = form.gender.value;

if (height && gender) {
let idealWeight;
if (gender === "male") {
idealWeight = (height - 100) * 1.15;
} else if (gender === "female") {
idealWeight = (height - 110) * 1.15;
}

    result.textContent = `Идеальный вес: ${idealWeight.toFixed(2)}, кг`;
} else {
alert("Введите рост и пол");
}
};

buttonResult.addEventListener("click", calculateIdealWeight);
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

.card {
display: flex;
justify-content: center;
align-items: center;
width: 300px;
background: rgb(203, 220, 93);
padding: 30px;
border: 4px solid rgb(88, 211, 88);
border-radius: 6px;
}

#form {
display: flex;
flex-direction: column;
justify-content: center;
gap: 30px;
width: 100%;
height: 100%;
font-size: 20px;
font-family: Arial, Helvetica, sans-serif;
}

.height-input,
.gender-select {
width: 100%;
height: 50px;
padding: 5px;
border: 2px solid rgb(19, 85, 45);
font-size: 18px;
}

.result-button {
width: 100%;
height: 40px;
padding: 10px;
font-size: 20px;
background-color: rgb(255, 191, 0);
cursor: pointer;
}
```
