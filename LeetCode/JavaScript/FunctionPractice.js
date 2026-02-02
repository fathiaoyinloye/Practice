console.log(getSum(viewSum, 7, 8));

function getSum(anotherFunction, x, y) {
  console.log(viewSum());
  return x + y;
}

function viewSum(sum) {
  return "I am first Funtion";
}

const testArrow = () => console.log(2 * 2);
testArrow();

let numbers = [2, 4, 3, 7, 6];
const square = numbers.map((element) => Math.pow(element, 2));

function getSquare(number) {
  return number * 2;
}

const even = numbers.filter((element) => element % 2 == 0);
const total = numbers.reduce((number, element) => number + element);

console.log(total);
