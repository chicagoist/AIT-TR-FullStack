```html
code/index.html

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Consultation 4</title>
    <link rel="stylesheet" href="./styles.css" type="text/css"/>
    <link rel="preconnect" href="https://fonts.googleapis.com"/>
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin/>
    <link
            href="https://fonts.googleapis.com/css2?family=Monoton&family=Montserrat:ital,wght@0,100;1,500;1,900&family=Rubik+Mono+One&display=swap"
            rel="stylesheet"
    />
</head>
<body>
<div id="root">
    <header></header>
    <h2>Title</h2>
    <div class="card-box">
        <h2 class="card-box-title background__blue">Customer-Centric Focus</h2>
        <p>
            We value each client and place their needs at the heart of our
            operations. Our company takes pride in providing a high level of
            service and aims for complete customer satisfaction. We meticulously
            study requests and offer personalized solutions, ensuring that every
            client feels confident in choosing our services.
        </p>
        <div class="card-box_label">main</div>
    </div>
    <div class="card-box background__blue">
        <h2 class="card-box-title">Expert Team</h2>
        <p>
            We value each client and place their needs at the heart of our
            operations. Our company takes pride in providing a high level of
            service and aims for complete customer satisfaction. We meticulously
            study requests and offer personalized solutions, ensuring that every
            client feels confident in choosing our services.
        </p>
    </div>
</div>
</body>
</html>
```

```html
code/styles.css

* {
box-sizing: border-box;
}

html,
body {
min-height: 100%;
margin: 0;
padding: 0;
font-family: "Rubik Mono One", monospace;
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

#root {
width: 100%;
height: 100%;
padding-top: 200px;
}

.card-box {
width: 400px;
height: 600px;
padding: 20px;
margin: 30px;
/* position: relative; */
/* background-color: #ad4b4b63; */
background-color: #ad4b4b;
color: rgb(54, 46, 46);
font-size: 16px;
opacity: 1;
}

.card-box_label {
width: 50px;
height: 30px;
background-color: rgb(34, 21, 21);
font-size: 14px;
color: antiquewhite;
}

.background__blue {
background-color: #2a2f8d;
}

header {
width: 100%;
height: 150px;
background-color: rgb(96, 96, 164);
position: fixed;
top: 0;
/* opacity: 0.3; */
}
```
