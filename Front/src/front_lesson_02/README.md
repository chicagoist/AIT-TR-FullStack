**Задачи на урок**:

    Контейнеры: div, span
    Семантические теги: header, footer, main, section и пр.
    CSS. Основы
    Стили: inline styles, internal CSS, external CSS
    CSS селекторы
    Class и id атрибуты

### HTML&CSS:

**Containers, CSS Basics**

Ссылка на
pdf-презентацию: [HTML core](https://github.com/ait-tr/cohort37.1/blob/main/front_end/lesson_02/HTML&CSS_Containers_CSS_Basics.pdf)

```html
``./code/homework/index.html

<!doctype html>
<html>
  <head>
    <title>Homework_01</title>
  </head>
  <body>
    <h1>Jessica Chastain</h1>
    <img src="./images/cat.png" alt="Jessika Chastain's foto" width="100" />
    <h2>Biography</h2>
    <p>
      Jessica Michelle Chastain (born March 24, 1977) is an American actress and producer.<br />
      Known for primarily starring in projects with feminist themes,<br />
      she has received various accolades, including an Academy Award and a Golden Globe, in addition to nominations for
      two Tony Awards and a Primetime Emmy Award.<br />
      Time magazine named her one of the 100 most influential people in the world in 2012.
    </p>
    <a href="https://en.wikipedia.org/wiki/Jessica_Chastain" target="_blank" title="wikipedia"> More information </a>
    <h2>Five favourites films</h2>
    <table border="4">
      <caption>
        Films
      </caption>
      <tr>
        <th>Film</th>
        <th>Director</th>
        <th>Year</th>
      </tr>
      <td>Molly's Game</td>
      <td>Aaron Sorkin</td>
      <td>2017</td>
      <tr>
        <td>Miss Sloane</td>
        <td>John Madden</td>
        <td>2016</td>
      </tr>
      <tr>
        <td>The eyes Tammy Faye</td>
        <td>Michael Shoulter</td>
        <td>2021</td>
      </tr>
      <tr>
        <td>The Zookeeper's wife</td>
        <td>Niki Karo</td>
        <td>2017</td>
      </tr>
      <tr>
        <td>Lawless</td>
        <td>John Hilkoat</td>
        <td>2012</td>
      </tr>
    </table>
    <a href="#anchor">All films are here</a>
    <h2>Career</h2>
    <ul>
      <li>
        <a
          href="https://en.wikipedia.org/wiki/Jessica_Chastain#2004%E2%80%932010:_Early_work"
          target="_blank"
          title="early work"
        >
          2004-2010 : Early work
        </a>
      </li>
      <li>
        <a
          href="https://en.wikipedia.org/wiki/Jessica_Chastain#2011%E2%80%932013:_Breakthrough_and_rise_to_prominence"
          target="_blank"
          title="breakthrough"
        >
          2011-2013 : breakthrough and _Breakthrough_and_rise_to_prominence
        </a>
      </li>
      <li>
        <a
          href="https://en.wikipedia.org/wiki/Jessica_Chastain#2014%E2%80%932020:_Career_fluctuations_and_expansion"
          target="_blank"
          title="сareer"
        >
          2014-2020 : Career _Career_fluctuations_and_expansion
        </a>
      </li>
      <li>
        <a
          href="https://en.wikipedia.org/wiki/Jessica_Chastain#2021%E2%80%93present:_Awards_success"
          target="_blank"
          title="awards"
        >
          2021 - present : _Awards_success
        </a>
      </li>
    </ul>
    <h2 id="anchor">Films</h2>
    <a href="https://en.wikipedia.org/wiki/List_of_Jessica_Chastain_performances" target="_blank" title="Films"
      >All Films Jessica_Chastain</a
    >
  </body>
</html>
```

```html
./code/lesson/index.html

<!doctype html>
<html>
  <head>
    <link rel="stylesheet" href="styles.css" type="text/css" />
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Lesson 2</title>
    <style>
      h3 {
        color: rgb(16, 2, 2);
      }
    </style>
  </head>
  <body>
    <header style="color:rgb(72, 22, 22);">
      <h1>
        Немного о кино
        <img
          src="https://img.freepik.com/free-photo/a-cat-is-sitting-in-a-movie-theater-and-eating-a-cup-of-popcorn_1340-32024.jpg?size=626&ext=jpg"
          alt="movie image"
          width="100"
        />
      </h1>
      <nav>
        <a href="">Расписание</a>
        <a href="./kino.html">Кинотеатры</a>
        <a href="">Премьеры</a>
      </nav>
    </header>
    <main>
      <section class="main-sections block-weight">
        <p>
          Киноискусство является уникальным и могущественным способом передачи историй, эмоций и идей. От момента своего
          зарождения в конце XIX века кино претерпело значительное развитие, став неотъемлемой частью культуры и
          развлечений.
        </p>
      </section>
      <section>
        <h3 id="director">Режиссеры</h3>
        Знаменитые режиссеры, такие как Стэнли Кубрик, Стивен Спилберг, Кристофер Нолан и Квентин Тарантино, внесли
        огромный вклад в развитие киноискусства, создавая неповторимые шедевры. Актеры, также играющие ключевую роль в
        мире кино, привносят свой талант и харизму, придавая персонажам жизнь.
      </section>
      <section class="main-sections">
        <h3>Жанры и стили</h3>
        <ul>
          <li>
            Драма: Драматические фильмы фокусируются на развитии персонажей и их эмоциональном состоянии. Этот жанр
            часто затрагивает глубокие и важные темы, такие как любовь, потеря, семейные отношения и социальные
            проблемы.
          </li>
          <li>
            Комедия: Комедийные фильмы созданы для развлечения и вызывают смех у зрителей. Они могут варьироваться от
            легких шуток до сатиры и черного юмора.
          </li>
          <li>
            Фантастика: Этот жанр исследует научные и фантастические концепции, часто перенося зрителей в параллельные
            миры, далекое будущее или космические пространства.
          </li>
          <li>
            Ужасы: Фильмы ужасов создают атмосферу страха и напряжения, играя с элементами мистики,
            <span>сверхъестественного</span>
            и психологических ужасов.
          </li>
          <li>
            Боевик: Боевики ориентированы на динамичные сцены сражений, сталкеровки и преследований. Этот жанр часто
            связан с приключениями и включает в себя героев, способных справляться с физическими вызовами.
          </li>
        </ul>
      </section>
    </main>
    <footer class="block-weight">
      Ссылки,логотип и информация о сайте
      <div class="copyright-block">Блок адреса</div>
    </footer>
  </body>
</html>
```

```css
code/lesson/styles.css

    /* универсальный селектор 
     margin закомментирован для лучшего визуального восприятия, в
следующей домашней работе margin тоже можете не убирать */

    /* *{ margin: 0; } */
    /* селекторы по тегу */
h1 {
  background-color: rgb(204, 185, 185);
}

p {
  color: rgb(84, 84, 182);
}

div {
  background-color: aqua;
}

/* селектор по id
*/
#director {
  font-size: 28px;
}

/* селекторы по классу */
.main-sections {
  background-color: rgb(189, 180, 167);
}

.block-weight {
  font-weight: bold;
}

/* селекторы по атрибуту */
[href] {
  background-color: rgb(116, 97, 134);
}

[href="./kino.html"] {
  color: white;
}
```

#### Homework

**Задание**

Создайте сайт-визитку, которая будет описывать вас

Требования:

    Создать новые index.html и styles.css файлы
    В index.html добавить информацию о себе (информацию можно взять с предыдущей работы, если такая есть, исправив недочёты)
    Использовать изученные на лекции теги
    При добавлении картинок с помощью относительного пути, добавить их в папку images
    Нужно стилизовать вашу страницу, используя изученные нами на уроке свойства css и селекторы
    Стили и дизайн на ваше усмотрение

Важно: выполненное ДЗ нужно прислать мне в виде архива, в котором будут ваши файлы с выполненным ДЗ
!!!Дедлайн: 03.02.2023
