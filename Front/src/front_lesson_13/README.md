**Задачи на урок:**

    Циклы: while, do while
    Методы строк
    Functions: introduction
    Область видимости, hoisting (поднятие)

**JS: Functions**

**Ссылка на презентацию: [презентация](https://github.com/ait-tr/cohort37.1/blob/main/front_end/lesson_13/JS_Functions.pdf)**

**Homework**

_Задача 1_

Напишите функцию, которая принимает два числа и возвращает большее значение. Вызов функции присвоить переменной и отобразить результат(переменную) в консоле

_Задача 2_

Напишите функцию, которая принимает строку и число n, а затем возвращает первые n символов строки. Для отображения результа работы функции, вызовите её три раза с различными параметрами, результат каждого вызова присвойте отдельной переменной и выведите переменные в консоль

_Задача 3_

Напишите функцию, которая принимает массив и элемент, а затем возвращает true, если элемент присутствует в массиве, и false в противном случае (если есть повторения заданного элемента в массиве, то на задачу это никак не влияет). Результат вызова функции отобразите в консоле

```JS
code/homework/index.js

// Задача 1
for (let i = 1; i <= 20; i++) {
if (i % 2 === 1) {
continue;
}
console.log(i);
}

//Задача 2
// 1 способ
// let array = [2, 4, 6, 8, 10];
// for (let i = 0; i < array.length; i++) {
//   let arrayItem = array[i];
//   console.log((arrayItem *= 2));
// }
// console.log(array);

// 2 способ
let array = [2, 4, 6, 8, 10];
for (let number of array) {
number*=2;
console.log(number);
}
console.log(array);

//Задача 3
let numbersArray = [10, 15, 30, 25, 30];
let sum = 0;

for (let i = 0; i < numbersArray.length; i++) {
sum += numbersArray[i];
}

let result = sum / numbersArray.length;
console.log(result);
```

```JS
code/lesson/index.js

// Циклы while и do...while
let i = 1;
while (i < 5) {
console.log(i);
i++;
}

//---

let secretNumber;
do {
secretNumber = Math.round(Math.random() * 10);
console.log(secretNumber);
} while (secretNumber !== 5);
console.log("Found secret number!");

//---

let number = 2;
let number1 = ++number;
console.log(number1);
console.log(number);

// // Методы строк
let stringExample = "PleAse select Your aGe";
console.log(stringExample.length);

//---

let upperString = stringExample.toUpperCase();
console.log(upperString);
console.log(stringExample);

//---

let lowerString = stringExample.toLowerCase();
console.log(lowerString);
console.log(stringExample);

//---

let subStr = stringExample.substring(19);
console.log(subStr);

//---

let indexLetter = stringExample.indexOf("s");
console.log(indexLetter);

//---

let strArray = stringExample.split(" ", 2);
console.log(strArray);
console.log(stringExample);

// Функции
function isEven(number) {
let isEvenNum = number % 2 === 0;
//  alert(isEvenNum);
// return isEvenNum;
}
console.log(isEven(487));
let isNumberEven = isEven(4);
console.log(isNumberEven);

// Область видимости
let age = 18;
if (age >= 18) {
var messageAccess = "Access";
} else {
var messageFailure = "Failure";
console.log(messageFailure);
}
console.log(messageAccess);

//---

function showMessage() {
var message = "Hi";
}

showMessage();
// console.log(message); //здесь будет ошибка

//hoisting
console.log(z);

let x = 12;
const y = 20;
var z = 3;
```

```HTML
code/lesson/index.html

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Lesson 13</title>
  </head>
  <body>
    Теперь здесь есть js
    <script src="./index.js"></script>
  </body>
</html>
```
