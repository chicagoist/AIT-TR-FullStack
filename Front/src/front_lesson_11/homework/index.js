let temperature = prompt("Введите значение температуры", "0")

if (temperature < 0) {
  console.log("Холодно!")
} else if (20 >= temperature && temperature >= 0) {
  console.log("Прохладно")
} else if (30 >= temperature && temperature >= 21) {
  console.log("Тепло")
} else if (temperature >= 31) {
  console.log("Жарко!")
} else {
  console.log("Введите числовое значений!")
}
