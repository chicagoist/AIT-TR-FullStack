import {Component} from "react";

const usersData = [
  {
    name: "John Doe",
    age: 25,
    email: "john.doe@example.com",
    city: "New York",
    profession: "Software Engineer",
  },
  {
    name: "Alice Johnson",
    age: 30,
    email: "alice.johnson@example.com",
    city: "Los Angeles",
    profession: "Data Scientist",
  },
  {
    name: "Bob Smith",
    age: 28,
    email: "bob.smith@example.com",
    city: "Chicago",
    profession: "Graphic Designer",
  },
  {
    name: "Eva Davis",
    age: 22,
    email: "eva.davis@example.com",
    city: "Miami",
    profession: "Marketing Specialist",
  },
  {
    name: "David Wilson",
    age: 35,
    email: "david.wilson@example.com",
    city: "San Francisco",
    profession: "Product Manager",
  },
];

// DOM element
const homeworkContainer = document.querySelector(".homework25");

// Button element
const getDataButton = document.querySelector(".get-data");

// From your classwork 17
const elements = usersData.map(
  class extends Component {
    render() {
      const divEl25 = document.createElement("div");
      divEl25.textContent = this.props;
      return divEl25;
    }
  },
);

getDataButton.addEventListener("click", () => {
  // hide button
  getDataButton.style.display = "none";

  usersData.forEach((user) => {
    const userCard = document.createElement("div");
    // CSS
    userCard.style.display = "flex";
    userCard.style.flexDirection = "column";
    userCard.style.margin = "10px";
    userCard.style.textAlign = "center";
    userCard.style.maxWidth = "400px";
    userCard.style.backgroundColor = "#9fd1eb";
    userCard.style.borderStyle = "solid";
    userCard.style.borderColor = "#ccc";
    userCard.style.borderWidth = "2px";
    userCard.style.borderRadius = "5px";
    userCard.style.backgroundColor = "#9fd1eb";
    userCard.style.padding = "20px";
    //
    userCard.className = "user-card"; // Thanks StackOverflow ! ))
    const nameHead = document.createElement("h2");
    nameHead.textContent = `${user.name}`; // only for name
    userCard.appendChild(nameHead); // entry to div
    //
    Object.keys(user).forEach((key) => {
      if (key !== "name") {
        // if not name, then create <p> for others
        const p = document.createElement("p");
        p.textContent = `${key}: ${user[key]}`;
        userCard.appendChild(p); // if name, thek create <p> for name
      }
    });
    homeworkContainer.appendChild(userCard);
  });
});

/*

Методы HTTP возвращают различные типы ответов, которые содержат информацию о выполнении запроса и результате операции. Вот типичные возвращаемые значения для каждого метода:

1. **GET**: Возвращает данные запрошенного ресурса. Обычно это текст, JSON, XML или другой формат данных, который был запрошен.

2. **POST**: Обычно возвращает информацию о созданном ресурсе. Это может быть ID созданного объекта, ссылка на него или какие-то другие метаданные.

3. **PUT**: Возвращает обычно информацию о ресурсе, который был обновлен. Это может быть обновленное представление ресурса или какие-то другие метаданные.

4. **PATCH**: Обычно возвращает информацию о ресурсе, который был частично обновлен. Также может возвращать обновленное представление ресурса или какие-то другие метаданные.

5. **DELETE**: Обычно возвращает подтверждение удаления ресурса или информацию о удаленном ресурсе.

6. **HEAD**: Возвращает только метаданные о запрашиваемом ресурсе без его фактического содержания. Это может включать в себя информацию о заголовках ответа, коде состояния и другие метаданные.

7. **OPTIONS**: Возвращает информацию о возможностях сервера или ресурса. Это может быть список поддерживаемых методов, доступных заголовков и другая информация о конфигурации сервера.

8. **TRACE**: Возвращает запрос, который был отправлен на сервер, что может быть полезно для диагностики и отладки.

9. **CONNECT**: Возвращает установленное соединение.

10. **PATCH**: Обычно возвращает информацию о ресурсе, который был частично обновлен.

    Это общие типы ответов для каждого метода HTTP, но конкретные ответы могут варьироваться в зависимости от реализации сервера и контекста запроса.

*/