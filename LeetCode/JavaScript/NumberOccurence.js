function isNotUniqque(array, number) {
  for (let counter = 0; counter < array.length; counter++) {
    if (number == array[counter]) return false;
  }
  return true;
}

function getUniqueNumberIII(array) {
  let newArray = [];
  newArray.push(array[0]);
  for (let index = 0; index < array.length; index++) {
    if (isNotUniqque(newArray, array[index])) newArray.push(array[index]);
    //else continue;
  }
  return newArray;
}

console.log(getUniqueNumberIII([1, 2, 1, , 3, 4, 2, 6, 5, 6, 7]));

function getUniqueNumbersII(array) {
  let newArray = [];
  for (let index = 0; index < array.length; index++) {
    if (index == 0) newArray.push(array[index]);
    let count = 0;
    for (let counter = 0; counter < newArray.length; counter++) {
      if (array[index] == newArray[counter]) count++;
    }
    if (count == 0) newArray.push(array[index]);
  }
  return newArray;
}

// function getUnigueNumbers(array) {
//   let newArray = [];
//   for (let index = 0; index < array.length; index++) {
//     for (let count = 1; count < array.length; count++) {
//       for (let counter = 0; counter < newArray.length; counter++) {}
//       if (!newArray.includes(array[index])) {
//         newArray.push(array[index]);
//         break;
//       }
//     }
//   }
//   return newArray;
// }

function getNumberOfOccurence(array) {
  let newArray = getUniqueNumbersII(array);
  let myObject = {};
  myObject["unique"] = newArray;
  for (let index = 0; index < newArray.length; index++) {
    let check = 0;
    for (let count = 0; count < array.length; count++) {
      if (newArray[index] == array[count]) check++;
    }
    myObject[newArray[index]] = check;
  }
  return myObject;
}

let array = [1, 1, 2, 3, 3, 3, 4];

//console.log(getUniqueNumbersII(array));
//console.log(getNumberOfOccurence(array));
