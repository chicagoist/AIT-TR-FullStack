**Задачи на урок:**

    Weather App project

**JS: Weather App project**

Ссылка на презентацию: [презентация](https://github.com/ait-tr/cohort37.1/blob/main/front_end/lesson_26/JS_Weather_App.pdf)

**Homework**

_**Задание**_

Закончить самостоятельную работу, которую вы начали делать на уроке

Дубликат требований:

    Страница должна содержать:
        заголовок - “Weather app”
        поле для ввода города
        кнопку “Получить погоду”
        область для отображения данных о погоде или ошибки
    При нажатии на кнопку “Получить погоду”, должен отправляться запрос на url, рассмотренный на предыдущих слайдах
    Во время ожидания ответа нужно отображать индикатор
    После успешного получения данных, их нужно отобразить на странице (температуру и название города). Задача со * - отобразить иконку погоды из ответа
    При получении ошибки, её данные нужно отобразить на странице (код и сообщение)
    При отсутствии названия города, после нажатия на кнопку “Получить погоду” должен появиться alert с просьбой ввести название города


```js
code/homework/index.js

// - Нужно создать кнопку "Get Cat Fact", при клике на которую, будет выполняться GET запрос(используйте fetch). В ответе на запрос будет приходить случайный факт о котах
// - url: https://catfact.ninja/fact
// - После того как вы получите успешный ответ, разместите случайный факт о котах у себя на странице
// - Если запрос завершиться ошибкой, её нужно разместить на странице и выделить красным цветом
// - Каждый раз, когда происходит клик на кнопку, должен выполняться новый запрос и приходить новый факт о котах
// - Стилизуйте на ваше усмотрение

const getFactButton = document.querySelector("#get-fact-button");
const dataContainer = document.querySelector(".data-container");

const getInfoAboutCats = async () => {
try {
const response = await fetch("https://catfact.ninja/fact", {
method: "GET",
});
const result = await response.json();

    if (!response.ok) {
      throw Object.assign(new Error("Some response error message"), {
        response: result,
      });
    } else {
      dataContainer.classList.remove("error");
      dataContainer.textContent = result.fact;
    }
} catch (error) {
console.log(error);
dataContainer.classList.add("error");
dataContainer.textContent = error.response.message;
// dataContainer.textContent = error.message;
}
};
// setInterval(getInfoAboutCats, 50);

getFactButton.addEventListener("click", getInfoAboutCats);
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
justify-content: space-between;
align-items: center;
gap: 40px;
width: 100%;
height: 100%;
background: rgb(116, 29, 80);
padding: 70px 40px 40px;
color: white;
font-family: "Courier New", Courier, monospace;
font-size: 32px;
font-weight: bold;
}

.data-container {
max-width: 600px;
}

.error {
color: red;
}

button {
width: 300px;
padding: 20px;
background-color: #fff;
color: rgb(116, 29, 80);
font-size: 24px;
font-weight: bold;
border: none;
border-radius: 6px;
cursor: pointer;
}

button:hover {
background-color: #b485a8;
}
```

```html
code/homework/index.html

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <link rel="stylesheet" href="./styles.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>HW 25</title>
    <script src="./index.js" defer></script>
  </head>
  <body>
    <div class="page-container">
      <div class="data-container"></div>
      <button type="button" id="get-fact-button">Get Cat Fact</button>
    </div>
  </body>
</html>
```
