function sortArray(numbers) {
  let counter = 0;
  for (let count = 1; count < numbers.length; count++) {
    if (numbers[counter] < numbers[count]) {
      let temp = numbers[counter];
      numbers[counter] = numbers[count];
      numbers[count] = temp;
    }

    if (count == numbers.length - 1) {
      counter += 1;
      count = counter + 1;
    }
    if (counter == numbers.length) break;
  }
  return numbers;
}

function findMedianSortedArrays(numbers) {
  let newNumbers = sortArray(numbers);
  let median;
  if (numbers.length % 2 == 0) {
    median =
      newNumbers[Math.floor(numbers.length / 2)] +
      newNumbers[Math.floor(numbers.length / 2) + 1];
  } else median = newNumbers[Math.floor(numbers.length / 2)];
  return median;
}
let num = [20, -3, 2, 5, 1, 9, 8, 3];
console.log(sortArray(num));

console.log(findMedianSortedArrays(num));
