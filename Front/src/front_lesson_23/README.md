**Задачи на урок:**

    Определение Promise
    Состояния объекта Promise (fullfilled, rejected, pending)
    Методы resolve, reject
    Методы then, catch, finally

**JS: Promises**

Ссылка на презентацию: презентация
Homework

Примечание: задание на промисы пока не будет включать работу с UI, поэтому в рамках этого домашнего задания вся работа будет вестись в js файле

Задание

    Создайте функцию delay, которая принимает число (value) и возвращает промис. Промис должен разрешиться через 5 секунд и вернуть удвоенное значение аргумента value (в resolve). Если аргумент не является числом, промис должен быть отклонен с текстом ошибки "The argument is not a number" (в reject)

    Создайте функцию processingDelay, которая принимает число (value) и затем передаёт его в вызов функции delay. Вызов функции delay нужно обработать с помощью then и catch. Внутри then и catch нужно просто вывести соответствующий результат в консоль

    Для демонстрации результата вызовите функцию processingDelay два раза:
        1 раз с аргументом value - 10
        2 раз с аргументом value - 'text'


```html
code/homework/index.html

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <link rel="stylesheet" href="./styles.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>HW22</title>
    <script src="./index.js" defer></script>
  </head>
  <body>
    <div class="page-container">
      <div id="timer">60</div>
      <button class="timer-button" type="button">Start</button>
    </div>
  </body>
</html>
```

```js
code/homework/index.js

// - Создайте простой таймер на веб-странице, который будет отсчитывать время назад от 60 секунд.
// При достижении 0 секунд таймер должен остановиться.
// - Стилизуйте его

//Вариант 1
// const timer = document.querySelector("#timer");

// const startTimer = () => {
//   let seconds = 60;

//   const updateTimer = () => {
//     timer.textContent = seconds;
//     seconds--;

//     if (seconds < 0) {
//       clearTimeout(timerId);
//     }
//   };
//   const timerId = setInterval(updateTimer, 1000);
// };

// startTimer();

//Вариант 2
const timer = document.querySelector("#timer");
const startButton = document.querySelector(".timer-button");

const startTimer = () => {
let seconds = 60;

const updateTimer = () => {
timer.textContent = seconds;
seconds--;

    if (seconds < 0) {
      clearTimeout(timerId);
      startButton.removeAttribute("disabled");
    }
};
const timerId = setInterval(updateTimer, 1000);

if (timer.textContent !== 60) {
startButton.setAttribute("disabled", "");
}
};

startButton.addEventListener("click", startTimer);
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
gap: 40px;
width: 100%;
height: 100%;
background: rgb(11, 14, 59);
background-size: cover;
font-family: "Courier New", Courier, monospace;
}

#timer {
display: flex;
justify-content: center;
align-items: center;
min-width: 300px;
min-height: 300px;
font-size: 80px;
font-weight: bold;
color: #e42626;
background-color: #fff;
padding: 20px;
border-radius: 10px;
box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

button {
width: 300px;
padding: 20px;
background-color: #fff;
color: #1d177a;
font-size: 24px;
font-weight: bold;
border: none;
border-radius: 6px;
cursor: pointer;
}

button:hover {
background-color: #9495bc;
}

button:disabled {
background-color: #7d7d80;
color: rgb(166, 163, 163);
cursor: pointer;
}
```

```js
code/lesson/index.js

                                                          //Промисы, состояние промисов
let myPromise = new Promise((resolve, reject) => {
//отправляем запрос на получение данных пользователя

// симуляция положительного ответа
let response = {
statusResponse: 200,
data: {
firstName: "John",
lastName: "Johnson",
age: 23,
},
};

// симуляция отрицательного ответа
// let response = {
//   statusResponse: 400,
//   error: {
//     message: "Bad request",
//   },
// };

setTimeout(() => {
if (response.statusResponse === 200) {
resolve(response.data);
} else {
reject(response.error);
}
}, 7000);
});

console.log(myPromise);

                                                              //Обработка результата промиса - 1
// myPromise
//   .then(
//     (result) => {
//       console.log(`Выполнено успешно: ${result.age}`);
//     },
//     (error) => {
//       console.log(error);
//     }
//   )
//   // .catch((error) => {
//   //   console.log(error);
//   // })
//   .finally((result) => {
//     console.log("Убираем индикатор загрузки");
//     // console.log(result);
//   });

                                                              //Обработка результата промиса- 2
// const pageContainer = document.querySelector(".page-container");
// const loadInd = document.querySelector("#load-ind");

// myPromise
//   .then((userData) => {
//     // userData = response.data
//     const dataElement = document.createElement("div");
//     dataElement.classList.add("success");
//     dataElement.innerHTML = `
//         <h2>User Data</h2>
//         <p>First name: ${userData.firstName}</p>
//         <p>Last name: ${userData.lastName}</p>
//         <p>Age: ${userData.age}</p>
//         `;
//     pageContainer.append(dataElement);
//   })
//   .catch((error) => {
//     // error = response.error
//     const errorElement = document.createElement("div");
//     errorElement.classList.add("error");
//     errorElement.textContent = error.message;
//     pageContainer.append(errorElement);
//   }).finally(()=>{
//     loadInd.style.display = 'none'
//   });

                                                            // изменение состояния несколько раз

let promise = new Promise((resolve, reject) => {
setTimeout(() => {
reject("Error");
}, 3000);
resolve("Done");
// reject("Error");
});

console.log(promise);

                                                  //Отправка запроса и обработка результата при нажатии на кнопку
const pageContainer = document.querySelector(".page-container");
const loadInd = document.querySelector("#load-ind");
const getDataButton = document.querySelector("#request-button");

//функция для отправки запроса и получения данных
const fetchData = () => {
const promise = new Promise((resolve, reject) => {
//отправка запроса

    // симуляция положительный ответа
    // let response = {
    //   statusResponse: 200,
    //   data: {
    //     firstName: "John",
    //     lastName: "Johnson",
    //     age: 23,
    //   },
    // };

    // симуляция отрицательного ответа
    let response = {
      statusResponse: 400,
      error: {
        message: "Bad request",
      },
    };

    setTimeout(() => {
      if (response.statusResponse === 200) {
        resolve(response.data);
      } else {
        reject(response.error);
      }
    }, 5000);
});

return promise;
};

//функция для обработки результата запроса
const getData = () => {
getDataButton.setAttribute("disabled", "");
loadInd.classList.remove("hidden");

fetchData()
.then((userData) => {
const dataElement = document.createElement("div");
dataElement.classList.add("success");
dataElement.innerHTML = `
<h2>User Data</h2>
<p>First name: ${userData.firstName}</p>
<p>Last name: ${userData.lastName}</p>
<p>Age: ${userData.age}</p>
`;
pageContainer.prepend(dataElement);
})
.catch((error) => {
const errorElement = document.createElement("div");
errorElement.classList.add("error");
errorElement.textContent = error.message;
pageContainer.prepend(errorElement);
})
.finally(() => {
getDataButton.removeAttribute("disabled");
loadInd.classList.add("hidden");
});
};

getDataButton.addEventListener("click", getData);
```

```html
code/lesson/index.html

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <link rel="stylesheet" href="./styles.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Lesson 23</title>
    <script src="./index.js" defer></script>
  </head>
  <body>
    <div class="page-container">
      <p id="load-ind" class="hidden">Loading...</p>
      <button id="request-button" type="button">Get Data</button>
    </div>
  </body>
</html>
```

```css
code/lesson/styles.css

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
gap: 40px;
width: 100%;
height: 100%;
background: rgb(11, 14, 59);
color: white;
font-family: "Courier New", Courier, monospace;
font-size: 32px;
}

.hidden {
display: none;
}

.success {
display: flex;
flex-direction: column;
justify-content: center;
align-items: center;
gap: 20px;
}

.error {
color: rgb(158, 27, 27);
}

button {
width: 300px;
padding: 20px;
background-color: #fff;
color: #1d177a;
font-size: 24px;
font-weight: bold;
border: none;
border-radius: 6px;
cursor: pointer;
}

button:hover {
background-color: #9495bc;
}

button:disabled {
background-color: #7d7d80;
color: rgb(166, 163, 163);
cursor: pointer;
}
```
