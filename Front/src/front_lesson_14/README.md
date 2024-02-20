Задачи на урок:

    Function types
    DOM как объектная модель
    DOM как программный интерфейс
    Типы узлов

JS: Function types, DOM

**Ссылка на презентацию: [презентация](https://github.com/ait-tr/cohort37.1/blob/main/front_end/lesson_14/JS_Function_types_DOM.pdf)**

**Homework**

Задание

Необходимо создать функцию с названием arrayProcessor, которая будет принимать два параметра, первый параметр - массив, второй параметр - функция callback

Требования:

    Функция arrayProcessor должна выполнять 3 действия:

    первое действие - преобразовать каждый элемент, в переданном массиве, в строку, результат должен сохраняться в новом массиве (то есть не мутировать входной массив)
    вызывать функцию, которая была передана в параметрах (функция callback будет принимать в качестве параметра преобразованный на первом шаге массив)
    возвращать то, что вернула функция callback после её вызова

    Чтобы показать пример использования функции arrayProcessor вам нужно:

    создать ещё две функции (требования к функциям см. в пункте 3)
    вызвать arrayProcessor с каждой из функций по очереди
    каждый из 2-х результатов вывести в консоль

    Требования к функциям callback

    первая функция должна преобразовывать каждый элемент массива в верхний регист и возвращать новый массив с преобразованными элементами
    вторая функция должна возвращать сумму длин всех строк

```jscode/homework/index.js


// Задача 1
// Напишите функцию, которая принимает два числа и возвращает большее значение.
//Вызов функции присвоить переменной и отобразить результат(переменную) в консоле
       // 1 вариант
// function getBiggerNumber(number1, number2) {
//   let maxNumber = number1 > number2 ? number1 : number2;
//   return maxNumber;
// }

       // 2 вариант
// function getBiggerNumber(number1, number2) {
//   if(number1 > number2){
//     return number1
//   } else if (number1 < number2){
//     return number2
//   } else {
//     return "Значения равны или неверный ввод"
//   }
// }

       // 3 вариант
function getBiggerNumber(number1, number2) {
  let maxNumber =
    number1 > number2
      ? number1
      : number1 < number2
      ? number2
      : "Значения равны или неверный ввод";
  return maxNumber;
}

let maxNumber = getBiggerNumber(-10, 6);
console.log(maxNumber);

         //4 вариант - Math.max(2,3)



// Задача 2
// Напишите функцию, которая принимает строку и число n, а затем возвращает первые n символов строки.
// Для отображения результа работы функции, вызовите её три раза с различными параметрами,
//  результат каждого вызова присвойте отдельной переменной и выведите переменные в консоль
function getSubstring(oldString, n) {
  return oldString.substring(0, n);
}

// let newSubstring1 = getSubstring("Hello", 2);
// let newSubstring2 = getSubstring("Hello", 1);
let newSubstring3 = getSubstring("Hello", 10);
let lengthNewSubstring3 = newSubstring3.length;

console.log(newSubstring3);
console.log(lengthNewSubstring3);

// Задача 3
// Напишите функцию, которая принимает массив и элемент, а затем возвращает true, если элемент присутствует в массиве,
// и false в противном случае (если есть повторения заданного элемента в массиве, то на задачу это никак не влияет).
// Результат вызова функции отобразите в консоле

       // Вариант 1
// function searchElement(customArray, searchElement) {
//   for (let i = 0; i < customArray.length; i++) {
//     if (customArray[i] === searchElement) {
//       return true;
//     }
//   }
//   return false;
// }

      // Вариант 2
function searchElement(customArray, searchElement) {
  return customArray.indexOf(searchElement) !== -1;
}

console.log(searchElement(["a", "b", "c"], "1"));
```

```html
code/lesson/dom/index.html

<!doctype html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <link rel="stylesheet" href="./styles.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Lesson 14</title>
    <script src="./index.js" defer></script>
  </head>
  <body>
    <div class="main-container">
      <h1 class="title">Main title</h1>
      <div id="container">
        <h2 class="title">User Card</h2>
        <ul class="list">
          <li>23</li>
          <li>Male</li>
          <li>Project manager</li>
        </ul>
        <input name="userName" />
      </div>
    </div>
  </body>
</html>
```

```js
code / lesson / dom / index.js;

//Селекторы
const containerElement = document.getElementById("container");
console.log(containerElement);

const listElements = document.getElementsByTagName("li");
console.log(listElements);

const titleElements = document.getElementsByClassName("title");
console.log(titleElements);

const searchElement = document.getElementsByName("userName");
console.log(searchElement);

const list = document.querySelector("ul");
console.log(list);

const titles = document.querySelectorAll(".title");
console.log(titles);

const title = document.querySelector(".title");
console.log(title);

const listItems = document.querySelectorAll("li");
console.log(listItems);

const listItem = document.querySelector("li");
console.log(listItem);
```

```css
code/lesson/dom/styles.css * {
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

```js
code / lesson / functions / index.js;

// Function hoisting

// console.log(add(2, 3));
// console.log(divide(2, 3));

function add(number1, number2) {
  return number1 + number2;
}

let divide = function (number1 = 4, number2 = 5) {
  return number1 / number2;
};

console.log(divide());

//Стрелочные функции
let getNumber = (n) => {
  //  return n * 10;
  console.log(n * 30);
};

getNumber(30);

//Функции в качестве параметра
let performOperation = (number1, number2, operation) => {
  let resultOperation = operation(number1, number2);
  return resultOperation + 2;
};

let expoResult = (num1, num2) => num1 * num2;

console.log(performOperation(3, 7, expoResult));
console.log(performOperation(4, 3, (num1, num2) => num1 - num2));
```
