**Задачи на урок:**

**_Комбинированные стили_**
`padding`

`margin`

`border`

**Единицы измерения**

**_CSS: Box model_**

Ссылка на
презентацию: [презентация](https://github.com/ait-tr/cohort37.1/blob/main/front_end/lesson_03/CSS_box_model.pdf)

**Homework**

**_Задание_**

Сверстать страницу, в которой будет находиться 3 блока (cоздайте новые index.html и styles.css файлы)

**_Требования:_**

В блоках должна находится информация о пользователях:

`имя фамилия`

`фото`

`возраст`

`пол`

Блоки должны соответствовать следующим требованиям:

`ширина 400px`

`высота 500px`

`границы 2px`

стиль границ у каждого блока разный (на ваш выбор)

`внутренние отступы 20px`

`отступы между карточками должны быть 30px`

Размеры текста внутри карточек (контента), выберете такими, чтобы контент не вылазил Не забудьте добавить ко всем
элементам box-sizing: border-box, как мы это делали на уроке

```html
./code/homework/index.html
<!doctype html>
<html>
  <head>
    <link rel="stylesheet" href="./styles.css" type="text/css" />
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Homework_02</title>
  </head>
  <body>
    <div id="root">
      <header>
        <h1>John Doe</h1>
        <nav>
          <a href="#description">Description</a>
          <a href="#career">Career</a>
          <a href="#favorite-films">Favorite films</a>
        </nav>
      </header>
      <main>
        <section id="description">
          <h2 class="section-title">Description</h2>
          <!-- <div> -->
          <img src="./images/avatar.jpg" alt="foto" width="100" />
          <!-- </div> -->
          <p>I'm John Doe, a man who seeks harmony in all aspects of life. Born on 12.05.1989 in City.</p>
          <h3>I've been passionate about:</h3>
          <ul>
            <li class="main_hobby">sports</li>
            <li>arts</li>
            <li>reading</li>
          </ul>
          <p>
            My professional journey is filled with diverse experiences and achievements. Currently holding the position
            of expertise, my skills and enthusiasm for field contribute to continuous growth and development.
          </p>
        </section>
        <section class="career-section" id="career">
          <h2 class="section-title">Career</h2>
          <p>
            Throughout my career in journalism, I've traversed the path from an enthusiastic novice reporter to a
            seasoned journalist. Over the years, I've had the opportunity to work with projects, deepening my expertise
            in investigative journalism, conducting interviews with notable figures, and penning articles that captivate
            a broad audience.
          </p>
        </section>
        <section id="favorite-films">
          <table border="3">
            <caption class="section-title">
              My favorite films
            </caption>
            <tr class="table-col-title">
              <td>Name</td>
              <td>Director</td>
              <td>Year</td>
            </tr>
            <tr>
              <td>forrest Gump</td>
              <td>Robert Zemeckis</td>
              <td>1994</td>
            </tr>
            <tr>
              <td>Kill Bill: Volume 1</td>
              <td>Quentin Tarantino</td>
              <td>2003</td>
            </tr>
            <tr>
              <td>Toy Story 3</td>
              <td>Lee Unkrich</td>
              <td>2010</td>
            </tr>
            <tr>
              <td>Rocky</td>
              <td>John G. Avildsen</td>
              <td>1976</td>
            </tr>
            <tr>
              <td>The game</td>
              <td>David Fincher</td>
              <td>1997</td>
            </tr>
          </table>
        </section>
      </main>
      <footer>
        <h4>Address</h4>
        123 Harmony Lane<br />
        Tranquilville, Serenestate 54321<br />
        United States
      </footer>
    </div>
  </body>
</html>
```

```css
./code/homework/styles.css #root {
  background-color: rgb(171, 163, 163);
}

header {
  background-color: rgb(86, 112, 121);
}

.section-title {
  font-size: 24px;
  color: rgb(8, 30, 54);
  font-weight: bold;
}

.career-section {
  background-color: rgb(106, 127, 116);
}

.main_hobby {
  color: brown;
}

.table-col-title {
  background-color: rgb(18, 18, 51);
  color: white;
  font-size: 20px;
}

footer {
  background-color: rgb(56, 79, 87);
}
```

```html
./code/lesson/index.html
<!doctype html>
<html>
  <head>
    <link rel="stylesheet" href="./styles.css" type="text/css" />
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Lesson 3</title>
  </head>
  <body>
    <!-- Группировка селекторов -->
    <!-- <h1>Заголовок первого уровня</h1>
    <p class="par">Параграф 1</p>
    <h2>Заголовок первого уровня</h2>
    <p>Параграф 2</p> -->
    <div class="cards-wrapper">
      <div class="card">
        <h4>Innovative Approach</h4>
        <img src="./images/avatar.jpg" />
        <p>
          Our company stands out due to a constant commitment to innovation. We actively embrace new technologies and
          cutting-edge methodologies, providing clients and partners access to the most modern solutions in our
          industry. This innovative approach enables us to maintain leadership and stay ahead of competitors.
        </p>
      </div>
      <div class="card">
        <h4>Expert Team</h4>
        <p>
          At the core of our success is a team of highly skilled professionals. We take pride in our employees who
          possess diverse experiences and expertise. Our team is cohesive, creatively inclined, and ready to tackle the
          most challenging tasks. This ensures a high level of professionalism in all our projects and fosters long-term
          relationships with our clients.
        </p>
      </div>
    </div>
  </body>
</html>
```

```html
./code/lesson/styles.css * { box-sizing: border-box; } html, body { height: 100%; margin: 0; padding: 0; font-size: 5px;
} h1, h2, h3, h4, h5, h6, p, ul, li { margin: 0; padding: 0; } /* Группировка селекторов */ /* h1, .par {
background-color: beige; } */ .cards-wrapper { width: 800px; } .card { width: 50vw; height: 70vh; /* внутренние отступы
отдельно для каждой стороны */ /* padding-top: 30px; padding-right: 10px; padding-bottom: 20px; padding-left: 40px; */
font-size: 30px; padding: 2rem; /* padding: 30px; */ /* внешние отступы отдельно для каждой стороны */ /* margin-top:
30px; margin-bottom: 40px; margin-left: 50px; margin-right: 40px; */ margin: 40px 40px 40px 50px; color:rgb(49, 99, 66);
/* задание отдельных свойств границ */ /* border-top-style: solid; border-top-color: rgb(126, 139, 130);
border-top-width: 6px; */ /* border-style: dashed; border-color: rgb(51, 59, 56); border-width: 10px; */ border: 6px
double rgb(51, 59, 56); border-radius: 50px 10px; background-color: rgb(207, 233, 226); } img { width: 70px;
border-style: solid; }
```
