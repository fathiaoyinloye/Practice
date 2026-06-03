function getInverseMatrix(firstNumbers, secondNumbers){
    let arrays = [];

    for(let count = 0; count < firstNumbers.length; count++){
        let newArray = []
        newArray.push(firstNumbers[count])
        newArray.push(secondNumbers[count])
        arrays.push(newArray);
    }
    return arrays;

}


    


function getInverseMatrix(...secondNumbers){
    let arrays = [];
    console.log(secondNumbers[0].length)

    for(let count = 0; count < secondNumbers[0].length; count++){
        let newArray = []
        for(let counter = 0; counter < secondNumbers.length; counter++){
            newArray.push(secondNumbers[counter][count])

        }
        arrays.push(newArray)
    }
    return arrays;

}


let firstArray = [2,4,5,9]
    let secondArray = [2,4,5,6]
    let thirdArray = [9,8,2,10]


    console.log(getInverseMatrix(firstArray,secondArray,thirdArray))

