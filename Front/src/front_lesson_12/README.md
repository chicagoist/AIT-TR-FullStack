**Задачи на урок:**

    Логические операторы
    Шаблонные строки
    Массивы: доступ к элементам, длинна, добавление, удаление
    Циклы

**JS: Array, Loops**

Ссылка на презентацию: [презентация](https://github.com/ait-tr/cohort37.1/blob/main/front_end/lesson_12/JS_Array_loops.pdf)

_**Homework**_

Задача 1

Напишите программу, которая выводит в консоль все четные числа от 1 до 20.
Задача 2

У вас есть массив чисел [2, 4, 6, 8, 10]. Напишите программу для удвоения каждого значения в массиве и вывода результата в консоль.
Задача 3*

У вас есть массив чисел [10, 15, 20, 25, 30]. Напишите программу для вычисления среднего значения элементов массива и вывода результата в консоль.
Примечание: для всех задач необходимо использовать цикл for

```JS
code/homework/index.js

let temperature = prompt("Введите температуру");

if (temperature < 0) {
  console.log("Холодно!");
} else if (temperature === null) {
  console.log("Вы отменили ввод");
} else if (temperature <= 20) {
  console.log("Прохладно");
} else if (temperature <= 30) {
  console.log("Тепло");
} else if (temperature > 30) {
  console.log("Жарко!");
} else {
  console.log("Введите числовое значение");
}
```

```HTML
code/homework/index.html

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Homework</title>
</head>
<body>
    <script src="./index.js"></script>
</body>
</html>
```

```JS
code/lesson/index.js

// Тернарный оператор
let studentName = "Mary";
let message;

if (studentName === "Tom") {
  message = "Hi, Tom";
} else if (studentName === "Mary") {
  message = "Hi, Mary";
} else {
  message = "Hi";
}

let userMessage =
  studentName === "Tom"
    ? "Hi, Tom"
    : studentName === "Mary"
    ? "Hi, Mary"
    : "Hi";
console.log(message);

// Switch case
let randomDay = Math.round(Math.random() * 10);
console.log(randomDay);
let dayName;

switch (randomDay) {
  case 1:
    dayName = "Monday";
    break;
  case 2:
    dayName = "Tuesday";
    break;
  case 3:
    dayName = "Wednesday";
    break;
  case 4:
    dayName = "Thursday";
    break;
  case 5:
    dayName = "Friday";
    break;
  case 6:
    dayName = "Saturday";
    break;
  case 7:
    dayName = "Sunday";
    break;
  default:
    dayName = "Invalid day";
}

console.log(dayName);

// Логические операторы

// let isStudent = confirm("Are you a student?");
// console.log(isStudent);
// let isEmployee = confirm("Are you a employee?");
// console.log(isEmployee);

// if (isStudent || isEmployee) {
//   console.log("discount");
// } else {
//   console.log("no discount");
// }

let age = Math.round(Math.random() * 100);
console.log(age);
let hasDrivingLicense = true;
let isSick = true;

if (age >= 18 && hasDrivingLicense && !isSick) {
  console.log("You can drive a car");
} else {
  console.log("You can`t drive a car");
}

// Шаблонные строки
// let guestName = prompt("Name");
// let guestMessage = `Hi, ${guestName}. Welcom`;
// console.log(message);

//Массивы
let arrayUsers = ["Mike", "Tom", "Bob"];
console.log(arrayUsers);
console.log(arrayUsers[1]);
console.log(arrayUsers[0]);
console.log(arrayUsers.length);

let userData = ["Tom", 42, true, [200, 400, 700]];
let userName = userData[0];
let prices = userData[3];
let price = userData[3][2];
console.log(price);
console.log(userData);

let colors = ["Red", "Blue"];
console.log(colors);
let deletedColor = colors.shift();
console.log(colors);
console.log(deletedColor);

let colorNewArrayLength = colors.unshift("Yellow", "Green");
console.log(colors);
console.log(colorNewArrayLength);

colors.pop();
console.log(colors);

colors.push("Grey", "Pink");
console.log(colors);

colors[6] = "Black";
console.log(colors);
console.log(colors[5]);
colors[2] = true;
console.log(colors);

// Циклы
for (let i = 1; i <= 5; i++) {
  let square = i ** 2;
  console.log(square);
}

let fruits = ["Apple", "Mango", "Orange", "Banana"];

for (let i = 0; i < fruits.length; i++) {
  console.log(`Fruit at index ${i}: ${fruits[i]}`);
}

for (let fruit of fruits) {
  console.log(`Fruit: ${fruit}`);
}
```

```HTML
code/lesson/index.html

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Lesson 12</title>
  </head>
  <body>
    Теперь здесь есть js
    <script src="./index.js"></script>
  </body>
</html>
```
