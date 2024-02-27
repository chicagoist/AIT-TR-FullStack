
./code/index.html

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Consultation 7</title>
    <link rel="stylesheet" href="./styles.css" type="text/css" />
    <script src="./index.js" defer></script>
  </head>
  <body>
    <div class="page-container">
      <div class="content-container">
        <p>Click on the button</p>
        <div>Loading...</div>
      </div>
      <button class='change-button' type="button">Change content</button>
    </div>
  </body>
</html>

./code/index.js

// очистка контейнера с помощью innerHTML
const colors = ["Red", "Blue", "Green"];

const contentContainer = document.querySelector(".content-container");
const changeButton = document.querySelector(".change-button");

// contentContainer.innerHTML = `
// <p>Element 1</p>
// <p>Element 2</p>
// <p>Element 3</p>`;

const addList = () => {
  contentContainer.innerHTML = "";

  colors.forEach((color) => {
    let colorContainer = document.createElement("div");
    colorContainer.textContent = color;
    contentContainer.append(colorContainer);
  });
};

changeButton.addEventListener("click", addList);

// reduce - создание массива уникальных значений
const duplicateArray = [1, 4, 5, 5, 1, 5, 8, 10];

const uniqueArray = duplicateArray.reduce((acc, value) => {
  if (!acc.includes(value)) {
    acc.push(value);
  }
  return acc;
}, []);

console.log(uniqueArray);

//includes
const prices = [100, 200, 400, 200];

console.log(prices.includes(100, 1));

// Добавление стилевых классов
const pageContainer = document.querySelector(".page-container");
const changeStyleButton = document.querySelector(".change-button");

let title = document.createElement("h1");
title.textContent = "Main Title";
//1 метод
// title.style.color = 'red';
//2 метод
// title.classList.add("main-title");
//3 метод
// title.className = "main-title";
//4 метод
title.setAttribute("class", "main-title");
pageContainer.prepend(title);

const changeStyles = () => {
  // title.classList.remove("main-title");
  // title.classList.add('main-text');
  // title.className = "main-text";
  // changeButton.classList.add("disable-styles");
  // changeButton.className = "disable-styles";
  changeButton.setAttribute("class", "change-button disable-styles");
};

changeStyleButton.addEventListener("click", changeStyles);

// every
const numbersArray = [1, 2, 3, -4];

const result = numbersArray.every((num) => num > 0);

console.log(result);

./code/styles.css

* {
  box-sizing: border-box;
}

html,
body {
  height: 100%;
  margin: 0;
  padding: 0;
  font-family: monospace;
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
  gap: 30px;
  background-color: bisque;
  font-size: 22px;
}

.content-container {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  gap: 20px;
  padding: 30px;
  font-weight: bold;
  border: 2px solid rgb(224, 176, 88);
}

.change-button {
  width: 200px;
  height: 100px;
  background-color: rgb(224, 176, 88);
  color: azure;
  border: none;
  font-size: 22px;
}

.main-title {
  font-size: 32px;
  color: rgb(93, 19, 82);
  border: 2px solid rgb(93, 19, 82);
  padding: 20px;
}

.main-text {
  color: white;
  background-color: red;
}

.disable-styles {
  background-color: rgb(81, 81, 80);
  color: rgb(191, 196, 196);
}

