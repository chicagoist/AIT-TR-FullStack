
**Задачи на урок:**

    Методы массивов
    Практика

_**JS: Array methods. Practice**_

Ссылка на презентацию: [презентация](https://github.com/ait-tr/cohort37.1/blob/main/front_end/lesson_19/JS_Array_methods_Practice.pdf)

**Homework**


Закончить самостоятельную работу, которую вы начали делать на уроке
Дубликат требований:

Создайте веб-страницу с карточками, которые будут содержать данные пользователей и появляться при нажатии на кнопку

Требования:

    Отображение карточек с данными должно происходить только при нажатии на кнопку “Get Data”, при этом кнопка должна исчезать после отображения карточек

    Данные пользователей нужно взять из массива объектов (данные предоставлены ниже)

    При работе необходимо использовать методы массивов

    Имя и фамилия должны являться заголовком карточки, все остальные данные любыми элементами на ваше усмотрение

    Стилизация на ваше усмотрение

    Данные: const usersData = [ { name: 'John Doe', age: 25, email: 'john.doe@example.com', city: 'New York', profession: 'Software Engineer', }, { name: 'Alice Johnson', age: 30, email: 'alice.johnson@example.com', city: 'Los Angeles', profession: 'Data Scientist', }, { name: 'Bob Smith', age: 28, email: 'bob.smith@example.com', city: 'Chicago', profession: 'Graphic Designer', }, { name: 'Eva Davis', age: 22, email: 'eva.davis@example.com', city: 'Miami', profession: 'Marketing Specialist', }, { name: 'David Wilson', age: 35, email: 'david.wilson@example.com', city: 'San Francisco', profession: 'Product Manager', }, ];


```html
code/homework/index.html

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <link rel="stylesheet" href="./styles.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>HW18</title>
    <script src="./index.js" defer></script>
  </head>
  <body>
    <div class="page-container">
      <div class="prices-container"></div>
      <button class="filter-button" type="button">Filter</button>
    </div>
  </body>
</html>
```

```js
code/homework/index.js

const prices = [100, 400, 900, 300, 500, 451];

const pricesContainer = document.querySelector(".prices-container");
const filterButton = document.querySelector(".filter-button");

// //Вариант 1
// const pricesArrayElements = prices.map((price) => {
//   const priceContainer = document.createElement("div");
//   priceContainer.textContent = price;
//   return priceContainer;
// });

// pricesArrayElements.forEach((priceContainer) =>
//   pricesContainer.append(priceContainer)
// );

// const filterPrices = () => {
//   pricesContainer.innerHTML = "";

//   const filteredPricesArray = prices.filter((price) => price > 450);

//   const filteredPricesArrayElements = filteredPricesArray.map(
//     (filteredPrice) => {
//       const filteredPriceContainer = document.createElement("div");
//       filteredPriceContainer.textContent = filteredPrice;
//       return filteredPriceContainer;
//     }
//   );

//   filteredPricesArrayElements.forEach((filteredPrice) =>
//     pricesContainer.append(filteredPrice)
//   );
// };

// filterButton.addEventListener("click", filterPrices);


// //Вариант 2
// prices.forEach((price) => {
//   const priceContainer = document.createElement("div");
//   priceContainer.textContent = price;
//   pricesContainer.append(priceContainer);
// });

// const filterPrices = () => {
//   pricesContainer.innerHTML = "";

//   const filteredPricesArray = prices.filter((price) => price > 450);

//   filteredPricesArray.forEach((filteredPrice) => {
//     const filteredPriceContainer = document.createElement("div");
//     filteredPriceContainer.textContent = filteredPrice;
//     pricesContainer.append(filteredPriceContainer);
//   });
// };

// filterButton.addEventListener("click", filterPrices);


//Вариант 3

const renderPrices = (pricesArray) => {
pricesContainer.innerHTML = "";

pricesArray.forEach((price) => {
const priceContainer = document.createElement("div");
priceContainer.textContent = price;
pricesContainer.append(priceContainer);
});
};

renderPrices(prices);

const filterPrices = () => {
const filteredPricesArray = prices.filter((price) => price > 450);
renderPrices(filteredPricesArray);
};

filterButton.addEventListener("click", filterPrices);
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
height: 100%;
background: rgb(11, 14, 59);
background-size: cover;
font-family: "Courier New", Courier, monospace;
}

.prices-container {
display: flex;
justify-content: center;
align-items: center;
gap: 20px;
min-height: 350px;
min-width: 400px;
max-width: 500px;
padding: 20px;
border-radius: 8px;
background: #fff;
box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.prices-container > div {
display: flex;
flex-direction: column;
justify-content: center;
align-items: center;
padding: 10px;
background: rgb(11, 14, 59);
color: white;
font-size: 20px;
font-weight: bold;
}

.filter-button {
width: 300px;
padding: 10px;
margin-top: 15px;
background-color: #5e7bca;
color: #fff;
border: none;
border-radius: 6px;
border: 2px solid white;
font-size: 20px;
cursor: pointer;
}

.filter-button:hover {
background-color: #1b0e49;
}
```

```js
code/lesson/index.js

//reduce
const numberArray = [2, 30, 3, 50];
const result = numberArray.reduce((acc, num, index) => {
console.log(`Acc - ${acc}, num - ${num}, index - ${index}`);
return acc + num;
}, 0);
console.log(result);

const products = [
{ name: "Laptop", price: 200 },
{ name: "Phone", price: 400 },
{ name: "Tablet", price: 600 },
];

const totalPrice = products.reduce((totalP, product) => {
console.log(
`totalP - ${totalP}, product - ${product}, product price - ${product.price}`
);
return totalP + product.price;
}, 100);

console.log(totalPrice);

// reverse
const fruit = ["apple", "orange", "grape", "banana"];

const fruitReverseAr = fruit.reverse();
console.log(fruitReverseAr);
console.log(fruit);

//join
const newFruit = ["apple", "orange", NaN, "grape", "banana"];

const fruitStr = newFruit.join(" ");
console.log(fruitStr);
```
