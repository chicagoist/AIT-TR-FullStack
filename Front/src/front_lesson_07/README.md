**Задачи на урок:**

    Определение grid
    Свойства grid контейнера
    Свойства grid элементов

**_CSS: Grid_**

Ссылка на презентацию: [презентация](https://github.com/ait-tr/cohort37.1/blob/main/front_end/lesson_07/CSS_Grid.pdf)

**Homework**

**Задание**

Создайте вёрстку страницы используя только концепицию Grid (в новых файлах styles.css и index.html)

Требования:

    страница должна иметь 4 главных элемента: header, main, aside и footer
    main и aside должны находиться в одном ряду

    header и footer должны занимать целые строки

    main должен состоять из 3-х секций. Первые две секции занимают по одной вертикальной ячейке, 3-я секция занимает две вертикальные ячейки

    заполнение контентом всех перечисленных выше элементов можете выбрать самое простое, влоть до простого текста или даже слова

    стилизация на ваше усмотрение

```html
code/homework/index.html

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Home 6</title>
    <link rel="stylesheet" href="styles.css" />
  </head>
  <body>
    <div class="page-wrapper">
      <div class="form-wrapper">
        <h2>Contact us</h2>
        <form class="form">
          <div class="form-element">
            <label class="form-element-label" for="name">Name*</label>
            <input
              class="form-element-input"
              id="name"
              name="user_name"
              placeholder="Your name"
              maxlength="30"
              required
            />
          </div>
          <div class="form-element">
            <label class="form-element-label" for="phone">Phone*</label>
            <input
              class="form-element-input"
              id="phone"
              name="user_phone"
              type="tel"
              placeholder="Your phone number"
              required
            />
          </div>
          <div class="form-element">
            <label class="form-element-label" for="email">Email*</label>
            <input
              name="user_email"
              class="form-element-input"
              id="email"
              type="email"
              placeholder="Your working email"
              required
            />
          </div>
          <div class="form-element">
            <label class="form-element-label" for="location">Location</label>
            <select name="work_location" class="form-element-input" id="location">
              <option value="new-york">New York</option>
              <option value="los-angeles">Los Angeles</option>
              <option value="chicago">Chicago</option>
              <option value="boston">Boston</option>
            </select>
          </div>
          <div class="form-element">
            <label class="form-element-label" for="message">Message*</label>
            <textarea name="user_message" id="message" rows="5" placeholder="Your message" required></textarea>
          </div>
          <div class="form-element checkbox">
            <input name="politic-conf" id="checkbox-input" type="checkbox" />
            <label class="form-element-label" for="checkbox-input">I agree</label>
          </div>
          <div class="button-wrapper">
            <button class="button" type="submit">SEND REQUEST</button>
            <button class="button clear" type="reset">CLEAR FORM</button>
          </div>
        </form>
      </div>
    </div>
  </body>
</html>
```

```css
code /homework/ styles.css * {
  box-sizing: border-box;
  margin: 0;
  padding: 0;
}

body {
  display: flex;
  flex-direction: column;
  font-family: Verdana, Geneva, Tahoma, sans-serif;
}

.page-wrapper {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100%;
  height: 100vh;
}

.form-wrapper {
  display: flex;
  flex-direction: column;
  align-items: center;
  width: 35%;
  min-width: 400px;
  border: 2px solid rgb(92, 92, 92);
  background-color: rgb(233, 242, 250);
  border-radius: 5px;
  padding: 25px;
}

.form {
  width: 100%;
}

.form-element {
  display: flex;
  flex-direction: column;
  margin: 15px 0;
}

.form-element-label {
  color: blue;
}

.form-element-input {
  padding: 10px;
  border: 2px solid rgb(87, 106, 120);
  border-radius: 5px;
}

#message {
  padding: 10px;
}

.checkbox {
  flex-direction: row;
  justify-content: center;
  align-items: center;
  gap: 6px;
}

[type="checkbox"] {
  width: 20px;
  height: 20px;
}

.button-wrapper {
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  justify-content: space-around;
}

.button {
  padding: 10px;
  border: 2px solid black;
  border-radius: 5px;
  cursor: pointer;
  color: white;
  background-color: rgb(100, 100, 180);
}
```

```html
code/lesson/index.html

<!DOCTYPE html>
<html>
  <head>
    <link rel="stylesheet" href="./styles.css" type="text/css" />
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Lesson 7</title>
  </head>
  <body>
    <div class="container">
      <div class="penguin">Penguin</div>
      <div class="elephant">Elephant</div>
      <div class="butterfly">Butterfly</div>
      <div class="dolphin">Dolphin</div>
      <div class="giraffe">Giraffe</div>
    </div>
  </body>
</html>
```

```css
code /lesson/ styles.css * {
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
  display: grid;
  /* Создание шаблона строк и столбцов */
  /* grid-template-columns: 2fr 200px 1fr;
    grid-template-rows: 2fr 1fr 2fr 1fr;
    grid-template: 2fr 1fr 1fr/2fr 200px 1fr; */
  /*  */

  /* Выравнивание элементов вдоль горизонтальной и вертикальной оси*/
  /* justify-items: center;
    align-items: stretch; */
  /*  */

  /* Работа с группировакой контента в несколько рядов */
  /* grid-template-columns: 2fr 1fr 2fr;
    grid-template-rows: repeat(3, 1fr);
    grid-template-rows: repeat(2, 1fr);
    justify-content: space-around;
    align-content: space-around; */
  /*  */

  /* Создание шаблона областей */
  /* grid-template:
    "pen pen pen el"
    "but but but but"
    "dol gir gir gir"; */
  /*  */

  grid-template: 2fr 1fr 2fr 1fr/2fr 1fr 2fr;
  width: 100%;
  height: 100%;
  font-size: 30px;
  row-gap: 20px;
  column-gap: 40px;
  /* justify-items: center; */
}

.container > div {
  width: 150px;
  height: 150px;
}

.penguin {
  background-color: rgb(127, 175, 197);
  border: 2px solid rgb(59, 93, 100);
  /* grid-area: pen; */
  grid-column-start: 1;
  grid-column-end: 3;
  grid-row-start: 1;
  grid-row-end: 4;
  justify-self: center;
  align-self: start;
}

.elephant {
  background-color: rgb(174, 187, 193);
  border: 2px solid rgb(47, 50, 51);
  /* grid-area: el; */
}

.butterfly {
  background-color: rgb(220, 177, 210);
  border: 2px solid rgb(66, 51, 65);
  /* grid-area: but; */
}

.dolphin {
  background-color: rgb(130, 121, 178);
  border: 2px solid rgb(24, 26, 69);
  /* grid-area: dol; */
}

.giraffe {
  background-color: rgb(178, 171, 121);
  border: 2px solid rgb(90, 82, 26);
  /* grid-area: gir; */
}
```
