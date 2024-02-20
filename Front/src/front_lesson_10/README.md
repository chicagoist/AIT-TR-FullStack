Задачи на урок:

    Установка node.js
    Установка расширения для VSCode - code runner
    сonst, let
    Разница между строгими и нестрогими языками
    JS types
    tyopeof

JS: Introduction

Ссылка на
презентацию: [презентация](https://github.com/ait-tr/cohort37.1/blob/main/front_end/lesson_10/JS_Introduction.pdf)

**Homework**

**Задание**

_**Задача 1**_

Кто не закончил настройку на занятии, тому необходимо

    скачать и установить Node.JS
    установить расширение для VSCode - Code runner
    подключить внешний файл js к html 3-м способом

**_Задача 2_**

Объявите три переменные с разными именами и присвойте им значения:

    число
    строку
    булевое значение Выведите значения переменных в консоль.

_**Задача 3**_

Создайте две переменные с одинаковыми значениями (с помощью копирования) и вывидите их значения в консоль по очереди

```html
code/homework/index.html

<!doctype html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Project</title>
    <link rel="stylesheet" href="styles.css" />
  </head>
  <body>
    <div class="page-container">
      <header>
        <h1 class="title">Title</h1>
        <nav>
          <a href="">About us</a>
          <a href="">Contacts</a>
          <a href="">Photos</a>
        </nav>
      </header>
    </div>
  </body>
</html>
```

```css
code/homework/styles.css * {
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
  width: 100%;
  font-size: 26px;
}

header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  width: 100%;
  background-color: rgb(127, 187, 167);
  padding: 20px 40px;
}

.title {
  margin-right: 20px;
}

nav {
  display: flex;
  gap: 20px;
  align-self: flex-end;
}
```

```html
code/lesson/index.html

<!doctype html>
<html>
  <head>
    <link rel="stylesheet" href="./styles.css" type="text/css" />
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <!-- 2 способ. Внешний файл. В head -->
    <!-- <script src="./index.js"></script> -->
    <title>Lesson 10</title>
  </head>
  <body>
    <div class="container">
      <div class="card">Теперь здесь есть js</div>
    </div>
    <!-- 1 способ. Код внутри html -->
    <!-- <script>
      console.log("Внутренний код")
    </script> -->

    <!-- 3 способ. Внешний файл. В конце body -->
    <script src="./index.js"></script>
  </body>
</html>
```

```js
code / lesson / index.js;

// console.log("Внешний файл");

// Переменная let
let _message;
_message = "Hi";
_message = 1;
console.log(_message);

// Копирование значения переменной
let age = 23;
console.log(age);
_message = age;
console.log(_message);
console.log(age);

// Константа
const price = 400;
console.log(price);
// price=age;

// работа с typeof
let userName = "Tom";
let year = 2007;
let isGlobal = true;
let productPrice = undefined;
let func = () => {};
let array = [];
let symbol = Symbol();

console.log(typeof userName);
```

```css
code/lesson/styles.css * {
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

.container {
  display: flex;
  width: 100%;
  height: 100%;
  font-size: 30px;
}

.card {
  width: 40%;
  height: 40%;
  background-color: rgb(127, 175, 197);
  border: 2px solid rgb(59, 93, 100);
}
```
