// Array
let priceArray = [100, 400, 900, 300, 500];

// DOM element
const pageContainer = document.querySelector(".homework18");

// Elements of button
let showFilteredPrice = document.querySelector(".filter-for-price");

// From your classwork 17
const elements = priceArray.map((item) => {
  const divEl18 = document.createElement("div");
  divEl18.textContent = item;
  return divEl18;
});

// Fill to index.html
elements.forEach((element) => pageContainer.append(element));

let isPriceFiltered = false;

// Action for button
showFilteredPrice.addEventListener("click", () => {
  isPriceFiltered = !isPriceFiltered;

  elements.forEach((element) => {
    if (isPriceFiltered) {
      if (element.textContent < 450) {
        element.style.display = "none"; // hide all divs with price < 450
      } else {
        element.style.display = "block"; // show all divs with price > 450
        element.style.fontWeight = "bold"; // show the price wit bold teext
      }
    } else {
      element.style.display = "block"; // reset to start
      element.style.fontWeight = "normal"; // normal text again
    }
  });
});
