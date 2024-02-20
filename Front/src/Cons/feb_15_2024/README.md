```HTML
/code/index.html

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Consultation 4</title>
    <link rel="stylesheet" href="./styles.css" type="text/css" />
  </head>
  <body>
    <div class="animate-element">Animate</div>
    <div class="size-change"></div>
    <div class="swing">Animate</div>
    <script src="index.js"></script>
  </body>
</html>
```

```CSS
code/styles.css

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

.animate-element {
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: 26px;
  width: 200px;
  height: 200px;
  border-radius: 100px;
  background-color: rgb(231, 115, 206);
  /* animation-name: circle-to-square;
  animation-duration: 5s;
  animation-iteration-count: infinite;
  animation-direction: alternate-reverse;
  animation-timing-function: linear; */
  animation: circle-to-square 5s infinite alternate linear;
}

@keyframes circle-to-square {
  from {
    width: 200px;
    height: 200px;
    background-color: rgb(231, 115, 206);
  }

  50% {
    width: 100px;
    height: 100px;
    background-color: rgb(221, 231, 115);
  }

  75% {
    width: 100px;
    height: 500px;
    background-color: rgb(115, 231, 121);
  }

  to {
    width: 400px;
    height: 400px;
    background-color: rgb(118, 150, 231);
    border-radius: 100px;
  }
}

.size-change {
  width: 200px;
  height: 200px;
  margin: 30px;
  background-color: rgb(49, 109, 89);
  transition: width 2s ease-in-out, height 2s ease-in-out, opacity 2s;
}

.size-change:hover {
  width: 400px;
  height: 400px;
  opacity: 0.2;
}

.swing {
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: 26px;
  width: 200px;
  height: 200px;
  background-color: rgb(94, 119, 209);
  animation: animation-swing 5s infinite;
}

@keyframes animation-swing {
 0% {
  transform: rotate(0deg);
 }

 25% {
  transform: rotate(180deg);
  background-color: rgb(94, 209, 178);
 }

 50% {
  transform: rotate(60deg);
 }

 75% {
  transform: rotate(180deg);
  background-color: rgb(209, 207, 94);
 }

 100% {
  transform: rotate(0deg);
 }
}
```

```JS
code/index.js

// let price = prompt('Price');
let price = 200;

if (price > 200) {
  console.log("No sale");
} else if (price == 200) {
  console.log("sale");
} else {
  console.log("no product");
}

// Функции Math
let num = 3.99999;
console.log(Math.round(num));
console.log(Math.ceil(num));
console.log(Math.floor(num));

let randomNum = Math.round(Math.random() * 100);
console.log(randomNum);

let square = Math.sqrt(randomNum);
console.log(square);

let roundedNum1 = Math.round(square*10000000)/10000000;
console.log(roundedNum1);

let roundedNum2 = square.toFixed(7);
console.log(roundedNum2);
```
