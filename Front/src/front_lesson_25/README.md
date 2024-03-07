**Задачи на урок:**

    JSON
    Fetch

**JS: Fetch**

Ссылка на презентацию: [презентация](https://github.com/ait-tr/cohort37.1/blob/main/front_end/lesson_25/JS_Fetch.pdf)

**Homework:**

_**Задание**_

    Нужно создать кнопку "Get Cat Fact", при клике на которую, будет выполняться GET запрос(используйте fetch). В ответе на запрос будет приходить случайный факт о котах
    url: https://catfact.ninja/fact
    После того как вы получите успешный ответ, разместите случайный факт о котах у себя на странице
    Если запрос завершиться ошибкой, её нужно разместить на странице и выделить красным цветом
    Каждый раз, когда происходит клик на кнопку, должен выполняться новый запрос и приходить новый факт о котах
    Стилизуйте на ваше усмотрение

Важно: задание нужно прислать мне в виде архива, в котором будут три файла: index.js, index.html, styles.css
!!!Дедлайн: 07.03.2024

```js
code/homework/index.js

// Примечание: в задаче необходимо использовать async/await

// - Создайте функцию showNumbers, которая принимает число секунд и возвращает промис.
// Промис должен выполняться через указанное количество секунд и возвращать сообщение "Прошло {seconds} секунд(ы)". Если аргумент не является числом, промис должен быть отклонен с текстом ошибки "Аргумент не является числом".
//В случае ошибки никакой задержки быть не должно!

// - Создайте функцию wait, которая принимает число секунд и затем передаёт его в вызов функции showNumbers. Результат выполнения промиса должен выводиться в консоль

// Для демонстрации результата вызовите функцию wait 4 раза раза:
//   - 1 раз с аргументом - 3
//   - 2 раз с аргументом - 1
//   - 3 раз с аргументом - 5
//   - 4 раз с аргументом - "7"

const showNumbers = (seconds) => {
  const promise = new Promise((resolve, reject) => {
    // let num = Number(seconds);
    if (typeof seconds !== "number") {
      reject("Аргумент не является числом");
    } else {
      let ms = seconds * 1000;
      setTimeout(() => {
        resolve(`Прошло ${seconds} секунд(ы)`);
      }, ms);
    }
  });
  return promise;
};

const wait = async (sec) => {
  try {
    const result = await showNumbers(sec);
    console.log(result);
  } catch (errorMessage) {
    console.log(errorMessage);
  }
};


wait(3);
wait(1);
wait(5);
wait("7");
```


```js
code/lesson/index.js

const getDataButton = document.querySelector("#get-button");
const userDataContainer = document.querySelector(".user-data-container");

const getRandomUser = async () => {
  try {
    // в result может лежать как ошибка, например при статусе 400, так и ожидаемые данные при 200
   const response = await fetch("https://randomuser.me/api/");
    // console.log(response);
    const randomUserData = await response.json();

    //проверяем статус ответа, если он в диапазоне от 200-299, то response.ok вернёт true
    if (!response.ok) {
      //если response.ok - false, то нужно сгенерировать ошибку
      // копируем, созданный объект ошибки и добавляем к нему свойство со значением response: randomUserData
      // объект копируем с помощью встроенного метода - Object.assign()
      throw Object.assign(new Error("Some response error message"), {
        response: randomUserData,
      });
    } else {
      const userData = randomUserData.results[0];
      console.log(userData);
      userDataContainer.textContent = `${userData.name.title} ${userData.name.first} ${userData.name.last}, email: ${userData.email}`;
    }
  } catch (error) {
    console.log(error);
  }
};

getDataButton.addEventListener("click", getRandomUser);


//Алгоритм
// 1. Создаём асинхронную функцию по получению и обработке данных getRandomUser
// 2. Отправляем запрос на сервер (fetch) и сохраняем ответ в response
// 3. Обрабатываем содержимое ответа в response с помощью метода json() и получаем результат randomUserData в виде объекта JS
// 4. Пишем условие if...else, в котором генерируем ошибку (выбрасываем),
//в случае если свойство ответа response.ok= false (статус ответа от сервера неудачный 400, 500 и т.д.)
// а в случае если response.ok= true(статус ответа от сервера положительный 200-299) обрабатываем необходимые данные
// 5. В блоке catch обрабатываем ошибку
```


```html
code/lesson/index.html

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <link rel="stylesheet" href="./styles.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Lesson 25</title>
    <script src="./index.js" defer></script>
  </head>
  <body>
    <div class="page-container">
      <div class="user-data-container"></div>
      <button type="button" id="get-button">Get Data</button>
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
code/lesson/book_data.json

{
  "book": {
    "title": "Book title",
    "author": {
      "name": "D. Adams",
      "birth_year": 1955,
      "death_year": 2001
    },
    "genres": ["Science Fiction", "Comedy"]
  }
}
```

