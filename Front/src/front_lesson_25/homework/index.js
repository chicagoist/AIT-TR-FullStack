// DOM element
const homeworkContainer = document.querySelector(".homework25");

// Button element
const getDataButton = document.querySelector(".get-data");

// <div>
const div25 = document.createElement("div");

const getRandomCat = async () => {
  try {
    const responseFromServer = await fetch("https://catfact.ninja/fact", {
      method: "GET",
      headers: {
        "Content-Type": "application/json",
      },
    });

    if (!responseFromServer.ok) {
      throw Object.assign(new Error("Some response error message"), {
        response: responseFromServer,
      });
    } else {
      const respondFact = await responseFromServer.json();

      homeworkContainer.style.margin = "10px";
      homeworkContainer.style.borderColor = "#ccc";
      homeworkContainer.style.borderWidth = "2px";
      homeworkContainer.style.borderRadius = "5px";
      homeworkContainer.style.backgroundColor = "#9fd1eb";
      homeworkContainer.style.padding = "20px";

      div25.textContent = `${respondFact["fact"]}`;
      homeworkContainer.append(div25);
    }
  } catch (error) {
    console.error(`Ошибка ${error.message}`);
  }
};

getDataButton.addEventListener("click", getRandomCat);

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
