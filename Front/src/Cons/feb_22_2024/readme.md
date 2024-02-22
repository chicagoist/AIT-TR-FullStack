```html
code/index.html

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Consultation 6</title>
    <link rel="stylesheet" href="./styles.css" type="text/css" />
    <script src="./index.js" defer></script>
  </head>
  <body>
    <div class="page-container">
      <form id="form">
        <input id='userName' name="userName" placeholder="Your name" type="number" />
        <button type="button" id="action-button">Action</button>
      </form>
      <div class='result'></div>
    </div>
  </body>
</html>
```

```js
code/index.js

let buttonAction = document.querySelector("#action-button");
console.log(buttonAction);
let form = document.querySelector("#form");
console.log(form);
let result = document.querySelector(".result");

let action = (event) => {
  console.log(event.target.value);
  console.log(event.type);
  let targetEl = event.target;
  targetEl.style.background = "aquamarine";
  let userNameFieldValue = form.userName.value;
  // let userNameFieldValue = document.querySelector('#userName').value;
  // console.log(userNameFieldValue);
  let el = "str";

  result.innerHTML = `<h2 class='title'>Result</h2><p>${Number(userNameFieldValue).toFixed(2)}, ${el}</p>`;
  //String - "" '' ``
};

// buttonAction.addEventListener("click", action);
buttonAction.onclick = action;
```

```css
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

.page-container {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  width: 100%;
  min-height: 100%;
  gap: 30px;
  background-color: bisque;
}

input,
button {
  width: 300px;
  height: 50px;
  padding: 5px;
  font-size: 26px;
  color: rgb(9, 20, 101);
  border: 3px solid rgb(55, 121, 179);
  border-radius: 4px;
}

#action-button {
  width: 100px;
  background: rgb(38, 182, 211);
  cursor: pointer;
}

.result {
  min-width: 200px;
  min-height: 50px;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  padding: 5px;
  background-color: aquamarine;
  color: rgb(17, 51, 40);
  font-size: 26px;
}

.title {
  color: red;
}
```