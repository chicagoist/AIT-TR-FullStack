**Задачи на урок:**

    Event loop
    Promise.all
    Promise.race
    Клиент-серверная архитектура

**JS: Async/await**

Ссылка на презентацию: презентация
Homework

_**Примечание: в задаче необходимо использовать async/await_**

_**Задание**_

    Создайте функцию showNumbers, которая принимает число секунд и возвращает промис. Промис должен выполняться через указанное количество секунд и возвращать сообщение "Прошло {seconds} секунд(ы)". Если аргумент не является числом, промис должен быть отклонен с текстом ошибки "Аргумент не является числом". В случае ошибки никакой задержки быть не должно!

    Создайте функцию wait, которая принимает число секунд и затем передаёт его в вызов функции showNumbers. Результат выполнения промиса должен выводиться в консоль

Для демонстрации результата вызовите функцию wait 4 раза раза:

    1 раз с аргументом - 3
    2 раз с аргументом - 1
    3 раз с аргументом - 5
    4 раз с аргументом - "7"


```js
code/homework/index.js

// - Создайте функцию delay, которая принимает число (value) и возвращает промис.
//Промис должен разрешиться через 5 секунд и вернуть удвоенное значение аргумента value (в resolve). Если аргумент не является числом, промис должен быть отклонен с текстом ошибки "The argument is not a number" (в reject)

// - Создайте функцию processingDelay, которая принимает число (value) и затем передаёт его в вызов функции delay.
//Вызов функции delay нужно обработать с помощью then и catch. Внутри then и catch нужно просто вывести соответствующий результат в консоль

// - Для демонстрации результата вызовите функцию processingDelay два раза:
//  - 1 раз с аргументом value - 10
//  - 2 раз с аргументом value - 'text'

const delay = (value) => {
const promise = new Promise((resolve, reject) => {
setTimeout(() => {
if (typeof value === "number") {
let result = value * 2;
resolve(result);
} else {
let error = "The argument is not a number";
// reject(error);
reject(new Error(error));
}
}, 5000);
});

return promise;
};

const processingDelay = (value) => {
delay(value)
.then((result) => {
console.log(`Resolved: ${result}`);
})
.catch((error) => {
console.log(`Rejected: ${error.message}`);
});
};

processingDelay(10);
processingDelay("text");

// let value = Number('10');
// processingDelay(value);
// processingDelay(true);
```

```js
code/lesson/index.js

//Promise.all
const promise1 = new Promise((resolve, reject) => {
setTimeout(() => {
resolve("Операция 1 завершена успешно");
}, 3000);
});

const promise2 = new Promise((resolve, reject) => {
setTimeout(() => {
// resolve("Операция 2 завершена успешно");
reject("Операция 2 завершена неудачно");
}, 5000);
});

const promise3 = new Promise((resolve, reject) => {
setTimeout(() => {
resolve("Операция 3 завершена успешно");
// reject("Операция 3 завершена неудачно");
}, 1000);
});

Promise.all([promise1, promise2, promise3])
.then((result) => {
console.log(result);
console.log(`Выполнено успешно: ${result}`);
})
.catch((error) => {
console.log(typeof error);
console.log(`Выполнено c ошибкой: ${error}`);
});

//Promise.race
const promise4 = new Promise((resolve, reject) => {
setTimeout(() => {
// resolve("Операция 4 завершена успешно");
reject("Операция 4 завершена неудачно");
}, 1000);
});

const promise5 = new Promise((resolve, reject) => {
setTimeout(() => {
resolve("Операция 5 завершена успешно");
// reject("Операция 5 завершена неудачно");
}, 5000);
});

const promise6 = new Promise((resolve, reject) => {
setTimeout(() => {
resolve("Операция 6 завершена успешно");
// reject("Операция 6 завершена неудачно");
}, 1000);
});

Promise.race([promise4, promise5, promise6])
.then((result) => {
console.log(result);
console.log(typeof result);
console.log(`PromiceRace - выполнен успешно: ${result}`);
})
.catch((error) => {
console.log(error);
console.log(typeof error);
console.log(`PromiceRace - выполнен c ошибкой: ${error}`);
});

// let response = {
//   personalData: {
//     name: "Tom",
//   },
//   workData: {
//     role: "admin",
//   },
// };

//async...await
const timer = 3001;

//имитация запроса по сети
const promise = new Promise((resolve, reject) => {
const userData = {
firstName: "Tom",
lastName: "Green",
age: 45,
};
setTimeout(() => {
if (timer > 3000) {
reject("Error");
} else {
resolve(userData);
}
}, 2000);
});

const getUserData = async () => {
try {
const result = await promise;
console.log(result);
} catch (error) {
console.log(error);
}
};

getUserData();
```

```html
code/lesson/index.html

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <link rel="stylesheet" href="./styles.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Lesson 24</title>
    <script src="./index.js" defer></script>
  </head>
  <body>
    <div class="page-container">
    </div>
  </body>
</html>
```
