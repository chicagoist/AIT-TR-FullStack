**Задачи на урок:**

`Значения свойства position Работа с изображениями Использование изображений в качестве фона`

**CSS: position, images**

Ссылка на
презентацию: [презентация](https://github.com/ait-tr/cohort37.1/blob/main/front_end/lesson_04/CSS_position_images.pdf)

**Homework**

**_Задание_**

_Сверстать страницу, в которой будет находиться 3 карточки и header (cоздайте новые index.html и styles.css файлы)_

**Требования:**

В карточках должна находится информация о клиентах (можно взять информацию с предыдущего ДЗ, исправив ошибки):

`имя фамилия`

`фото`

`возраст`

`пол`

Карточки должны соответствовать следующим требованиям:

`ширина 400px`

`высота 500px`

`границы 2px`

стиль границ у каждого блока разный (на ваш выбор)

`внутренние отступы 20px`

`отступы между карточками должны быть 30px`

На странице должен быть `header` c позицией `fixed`, при прокрутке страницы ни один из элементов не должен
перекрывать `header`

Карточки с данными клиентов должны быть относительно позиционированы и расположены одна над одной лестницей, при этом
информация на карточках не должна закрываться.

```html
./code/homework/index.html
<!DOCTYPE html>
<html>
  <head>
    <link rel="stylesheet" href="./styles.css" type="text/css" />
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Страница с тремя блоками</title>
  </head>
  <body>
    <div class="container">
      <div class="card card__dashed">
        <h2 class="cart_title">Quentin Tarantino</h2>
        <img
          src="./images/Quentin_Tarantino.jpg"
          class="card-image"
          alt="Quentin Tarantino photo"
        />
        <p class="age">Age: 60</p>
        <p class="gender">Gender: male</p>
      </div>
      <div class="card card__dotted">
        <h2 class="cart_title">Sofia Coppola</h2>
        <img
          src="./images/Sofia_Coppola_Cannes_2013.jpg"
          alt="Sofia Coppola photo"
          class="card-image"
        />
        <p class="age">Age: 53</p>
        <p class="gender">Gender: female</p>
      </div>
      <div class="card card__double">
        <h2 class="cart_title">Steven Spielberg</h2>
        <img
          src="./images/Steven_Spielberg.jpg"
          alt="Steven Spielberg photo"
          title="Steven Spielberg"
          class='card-image'
        />
        <p class="age">Age: 77</p>
        <p class="gender">Gender: male</p>
      </div>
    </div>
  </body>
</html>
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

.container {
background-color: #08080649;
padding: 40px;
}

.card {
width: 400px;
height: 500px;
border: 2px solid rgb(56, 6, 12);
padding: 20px;
border-radius: 30px 80px;
margin-bottom: 30px;
text-align: center;
}

.card-image {
width: 60%;
/* height: 330px; */
}

.cart_title {
font-size: 30px;
margin: 10px 0;
color: rgb(70, 13, 32);
}

.age {
font-size: 20px;
margin: 10px 0;
color: rgb(55, 13, 18);
}

.gender {
font-size: 20px;
margin: 8px 0;
color: rgb(1, 1, 11);
}

.card__dashed {
background-color: rgba(153, 196, 215, 0.47);
border-style: dashed;
}

.card__dotted {
background-color: rgb(73, 123, 139);
border-style: dotted;
}

.card__double {
background-color: rgba(186, 197, 211, 0.442);
border-style: double;
}
```

```html
./code/lesson/index.html
<!DOCTYPE html>
<html>
  <head>
    <link rel="stylesheet" href="./styles.css" type="text/css" />
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Lesson 4</title>
  </head>
  <body>
    <header>Company</header>
    <div class="cards-wrapper">
      <div class="card card-approach">Innovative Approach</div>
      <div class="card card-team">Expert Team</div>
      <div class="card card-focus">Customer-Centric Focus</div>
    </div>
    <div class="cards-wrapper">
      <div class="card card-quality">High quality</div>
    </div>
    <div class="cards-wrapper image-background-block">
      <!-- <img src="./images/rocks.jpg"> -->
      Images block
    </div>
    <div class="button"></div>
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
min-height: 100%;
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

header {
width: 100%;
height: 100px;
position: fixed;
top: 0;
padding: 20px;
background-color: rgb(49, 102, 102);
color: white;
font-weight: bold;
font-size: 26px;
z-index: 4;
}

.cards-wrapper {
width: 800px;
height: 800px;
/* Задаём позицию relative для расположения блока с позицией absolute внутри cards-wrapper */
/* position: relative; */
top: 200px;
padding: 40px;
margin: 200px 40px 40px;
background-color: rgb(53, 59, 55);
}

.card {
width: 200px;
height: 200px;
padding: 20px;
font-size: 26px;
}

.card-approach {
background-color: rgb(119, 161, 204);
border: 4px solid rgb(180, 194, 180);
position: relative;
top: 20px;
left: 40px;
z-index: 2;
}

.card-team {
background-color: rgb(174, 176, 111);
border: 4px solid rgb(191, 194, 180);
/* Пример абсолютного позиционирования элемента card-team */
/* position: absolute;
top: 0;
left: 0; */
position: relative;
bottom: 50px;
left: 80px;
z-index: 1;
}

.card-focus {
background-color: rgb(176, 133, 111);
border: 4px solid rgb(255, 216, 208);
position: relative;
bottom: 120px;
left: 120px;
z-index: 3;
}

.card-quality {
position: sticky;
top: 10px;
background-color: rgb(132, 206, 140);
border: 4px solid rgb(214, 255, 208);
}

/* img {
width: 200px;
height: 200px;
border: 6px solid rgb(219, 216, 216);
border-radius: 50%;
} */

.button {
width: 50px;
height: 50px;
position: fixed;
bottom: 50px;
right: 50px;
background-color: rgb(204, 245, 71);
border-radius: 50%;
}

.image-background-block {
/* Задание различных значения фона с помощью отдельных свойств */
/* background-image: url(./images/rocks.jpg), url(./images/background-image.jpg); */
/* background-repeat: no-repeat;
background-position: center;
background-size: contain; */
background: rgb(155, 127, 127) url(./images/rocks.jpg) no-repeat top;
background-size: contain;
color:beige;
font-size: 46px;
font-weight: bold;
}
```