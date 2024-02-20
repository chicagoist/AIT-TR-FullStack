./code/index.html

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Consultation 3</title>
    <link rel="stylesheet" href="./styles.css" type="text/css" />
  </head>
  <body>
    <div class="overflow-example">
      <p class="element-pseudo">Innovative Approach</p>
      <button class="active-example">Click me!</button>
      <input placeholder="Name" class="focus-example">
      <p class="element-pseudo">
        Our company stands out due to a constant commitment to innovation. We
        actively embrace new technologies and cutting-edge methodologies,
        providing clients and partners access to the most modern solutions in
        our industry. This innovative approach enables us to maintain leadership
        and stay ahead of competitors.
      </p>
    </div>
    <div class="block-hover">
      <p>Наведи на меня</p>
      <div class="popup">
        <p>Важная информация</p>
      </div>
    </div>
  </body>
</html>

./code/styles.css

- { box-sizing: border-box; }

html, body { height: 100%; margin: 0; padding: 0; font-family: monospace; }

h1, h2, h3, h4, h5, h6, p, ul, li { margin: 0; padding: 0; }

.overflow-example { display: flex; flex-direction: column; justify-items: center; align-items: center; width: 40%; /_
height: 400px; _/ background-color: rgb(163, 202, 202); border: 2px solid rgb(26, 55, 71); font-size: 24px; padding:
20px; margin: 30px; /_ overflow: auto; _/ }

/_ Работа с псевдоклассами _/ .overflow-example:hover { color: white; background-color: rgb(19, 49, 49); border: 2px
solid rgb(164, 182, 200); box-shadow: 4px 10px 10px rgb(23, 60, 38); }

.active-example { width: 100%; height: 50px; font-size: 30px; padding: 10px; margin: 20px; color: rgb(27, 23, 48);
border: 2px solid rgb(27, 23, 48); border-radius: 6px; }

.active-example:active { color: aliceblue; background-color: rgb(27, 23, 48); }

.focus-example { width: 100%; height: 60px; margin-bottom: 20px; padding: 10px; border: 4px solid rgb(67, 29, 80);
font-size: 32px; color: rgb(67, 29, 80); }

.focus-example:focus { background-color: rgb(67, 29, 80); color: white; border: 4px solid rgb(97, 43, 80); }

.focus-example:focus-visible { outline: none; }

/_ Работа с псевдоэлементами _/ .element-pseudo::first-letter { color: rgb(54, 54, 198); font-size: 34px; font-weight:
bold; }

.element-pseudo::first-line { color: brown; }

p::selection { background-color: rgb(0, 255, 26); }

.focus-example::placeholder { color: rgb(159, 226, 43); }

/_ Создание всплывающего окна _/ .block-hover { position: relative; width: 400px; margin: 20px; padding: 20px;
font-size: 26px; color: white; background-color: rgb(32, 85, 67); }

.popup { display: none; position: absolute; left: 0; top: 30; width: 200px; padding: 20px; font-size: 20px; color: rgb(
14, 44, 44); border: 2px solid rgb(14, 44, 44); background-color: aliceblue; border-radius: 6px; }

.block-hover:hover .popup { display: block; }
