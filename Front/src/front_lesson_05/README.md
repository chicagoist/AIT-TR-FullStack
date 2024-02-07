**Задачи на урок:**

    Определение Flexbox
    Главная и поперечная оси
    Свойства контейнера
    Свойства элемента

**CSS: Flexbox**

Ссылка на презентацию: [презентация](https://github.com/ait-tr/cohort37.1/blob/main/front_end/lesson_05/CSS_Flexbox.pdf)

**Homework**
**_Задание_**

Создать страницу разделенную на `header`, `main` и `footer`. Верстку страницы нужно сделать с помощью подхода `flexbox`.
Стилизация и отступы на ваше усмотрение

Требования:

    Создайте новые index.html и styles.css файлы.
    Содержимое header:
        слева название компании - TechCity
        справа навигационное меню - О нас Команда Проекты FAQ (для этих ссылок добавьте href=””, так как они не будут никуда вести)
    Содержимое main:
        карточки с информацией о работниках (можете взять информацию с предыдущей работы). Блоки должны быть расположены в ряд или несколько рядов, если не хватает места
    Содержимое footer (3 колонки):
        название компании - TechCity
        адрес - город, улица, дом (данные на ваше усмотрение)
        контактные данные - email, телефон (данные на ваше усмотрение)

```html
code/homework/index.html

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" href="./styles.css" type="text/css"/>
    <title>Homework3</title>
</head>
<body>
<header>
    <h1>My favorite actors</h1>
</header>
<div class="card border__double">
    <h2 class='font__modif'>Kristen Stewart</h2>
    <img src="./image/kristen.jpg"/>
    <ul>
        <li class='font__modif'>Age 33</li>
        <li class='font__modif'>Female</li>
    </ul>
</div>
<div class="card border__groove">
    <h2 class='font__modif'>Robert Pattinson</h2>
    <img src="./image/robert.jpg"/>
    <ul>
        <li class='font__modif'>Age 37</li>
        <li class='font__modif'>Male</li>
    </ul>
</div>
<div class="card border__dashed">
    <h2 class='font__modif'>Taylor Lautner</h2>
    <img src="./image/taylor.jpg"/>
    <ul>
        <li class='font__modif'>Age 31</li>
        <li class='font__modif'>Male</li>
    </ul>
</div>
</body>
</html>
```

```css
code /homework/ styles.css
* {
    box-sizing: border-box;
}

html,
body {
    height: 100%;
    margin: 0;
    padding: 0;
    background-color: rgb(252, 249, 244);
}

header {
    background-color: rgb(115, 164, 164);
    text-align: center;
    padding: 20px;
    width: 100%;
    position: fixed;
    z-index: 4;
    top: 0;
    font-size: 30px;
    font-family: "Lucida Sans";
}

.font__modif {
    color: black;
    font: 1em sans-serif;
}

/* li, h2 {
color: black;
font: 1em sans-serif;
} */


h1 {
    color: white;
}

.card {
    padding: 20px;
    width: 400px;
    height: 500px;
    border-width: 2px;
    /* text-align: center; */
    /* margin: 30px; */
}

.border__double {
    border-style: double;
    border-color: rgb(46, 18, 106);
    background-color: rgb(193, 240, 190);
    position: relative;
    top: 250px;
    left: 200px;
    z-index: 1;
}

.border__groove {
    border-style: groove;
    border-color: rgb(151, 148, 143);
    background-color: rgb(230, 221, 210);
    border-radius: 50px;
    position: relative;
    top: 200px;
    left: 350px;
    z-index: 2;
}

.border__dashed {
    border-style: dashed;
    border-color: blanchedalmond;
    background-color: rgb(146, 153, 131);
    /* border: 10px dashed blanchedalmond; */
    position: relative;
    top: 150px;
    left: 450px;
    z-index: 3;
}
```

```html
code/lesson/index.html

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="./styles.css" type="text/css"/>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Lesson 5</title>
</head>
<body>
<div>
    <!-- Работа с display -->
    <!-- <div>Nature</div>
    <img src="./images/rocks.jpg" />
    <p>
      Nature is a magnificent wonder, filled with <span>beauty</span> and harmony. Its
      diversity spans from mighty mountains and vast forests to picturesque
      plains and tranquil water bodies. In the mountains, majestic peaks rise
      like guardians, adorned with pristine blankets of snow or lush greenery.
      From there, breathtaking views unfold, and the air is filled with the
      freshness and scent of the wilderness.
    </p> -->
    <!-- Работа с flexbox -->
    <div class="container">
        <!-- <img src="./images/rocks.jpg" /> -->
        <div class="card card-penguin">
            Penguin: A flightless bird with a distinctive black and white plumage,
            known for its playful waddling and excellent swimming abilities.
        </div>
        <div class="card card-elephant">
            Elephant: Majestic land mammal characterized by its large ears, long
            trunk, and impressive tusks, symbolizing strength and intelligence.
        </div>
        <div class="card card-butterfly">
            Butterfly: Delicate insect with vibrant, iridescent wings, undergoing a
            remarkable metamorphosis from a caterpillar to a graceful flyer.
        </div>
        <div class="card card-dolphin">
            Dolphin: Highly intelligent marine mammal, recognized for its playful
            behavior, acrobatic leaps, and communication skills.
        </div>
    </div>
</body>
</html>
```

```css
code /lesson/ styles.css
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

/* Работа с display */
/* div {
display: inline;
font-size: 28px;
color: white;
width: 100px;
height: 100px;
border: 4px solid rgb(33, 69, 88);
background-color: rgb(21, 21, 65);
}

img {
display: none;
}

span {
display: inline-block;
width: 100px;
height: 200px;
border: 4px solid blue;
background-color: rgb(191, 191, 223);
padding: 20px;
font-size: 24px;
color: rgb(125, 29, 29);
font-weight: bold;
}

p {
font-size: 20px;
} */

/* Работа с flexbox */
.container {
    display: flex;
    flex-direction: row;
    flex-wrap: wrap;
    justify-content: center;
    align-items: flex-start;
    align-content: stretch;
    width: 100%;
    height: 850px;
    background-color: rgb(172, 223, 223);
}

.card {
    width: 200px;
    height: 200px;
    padding: 20px;
    margin: 10px;
}

img {
    width: 200px;
}

.card-penguin {
    background-color: rgb(220, 204, 117);
    border: 4px solid rgb(177, 132, 27);
    /* font-size: 24px; */
}

.card-elephant {
    background-color: rgb(147, 146, 143);
    border: 4px solid rgb(55, 54, 52);
    /* font-size: 40px; */
}

.card-butterfly {
    background-color: rgb(93, 131, 177);
    border: 4px solid rgb(53, 48, 86);
    /* font-size: 12px; */
}

.card-dolphin {
    background-color: rgb(227, 171, 160);
    border: 4px solid rgb(92, 29, 19)
}
```

