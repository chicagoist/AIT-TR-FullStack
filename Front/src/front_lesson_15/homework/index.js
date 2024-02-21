//preparatory data
const button1 = document.querySelector(".card-button1");
const button2 = document.querySelector(".card-button2");
const button3 = document.querySelector(".card-button3");
const button4 = document.querySelector(".card-button4");

let isBackgroundChanged = false;
let isButtonNameChanged = false;
let isTitleHide = false;
let isTitleAdded = false;

// the function forces the button to return to its original color when clicked again
let actionButton1 = () => {
  let backgroundChange = document.querySelector(".form-section-one");

  if (isBackgroundChanged) {
    backgroundChange.style.backgroundColor = "#9fd1eb";
    isBackgroundChanged = false;
  } else {
    backgroundChange.style.backgroundColor = "#2b5547";
    isBackgroundChanged = true;
  }
};

// the function forces the button to return to its original name when clicked again
let actionButton2 = () => {
  let nameChangeOfButton1 = document.querySelector(".card-button1");
  isButtonNameChanged = !isButtonNameChanged;
  nameChangeOfButton1.innerHTML = isButtonNameChanged ? "ANOTHER" : "BUTTON 1";
};

// this function add the new title to show and changed back it when clicked again
let actionButton3 = () => {
  let addTitleText = document.querySelector(".main-title");
  isTitleAdded = !isTitleAdded;
  addTitleText.innerHTML = isTitleAdded ? "My new Title" : "Main title";
};

// Немного отсебятины, можно не проверять.

// this function opens the title to show and hides it when clicked again
let actionButton4 = () => {
  let unaidedTitleText = document.querySelector(".main-title");
  let container = document.getElementById("container");

  isTitleHide = !isTitleHide;
  unaidedTitleText.style.display = isTitleHide ? "none" : "flex";

  if (isTitleHide) {
    container.style.marginTop = "60px"; // Add padding at the top when the title is hidden
  } else {
    container.style.marginTop = "30px"; // Returning normal indentation when the title is displayed
  }
};

button1.addEventListener("click", actionButton1);
button2.addEventListener("click", actionButton2);
button3.addEventListener("click", actionButton3);
button4.addEventListener("click", actionButton4);
