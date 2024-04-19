const arr1 = ["a", "a", "a"];
const expect1 = {
    a: 3,
}

const arr2 = ["a", "b", "a", "c", "Bob", "c", "c", "d"];
const expect2 = {
    a: 2,
    b: 1,
    c: 3,
    Bob: 1,
    d: 1
};


function makeFrequencyTable(arr) {
    var obj= {}
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] in obj) {   // if(!obj[arr[i]]){}  //if(obj.hasOwnProperty(arr[i]))
            obj[arr[i]] +=1
        } else {
            obj[arr[i]] =1
        }
        
    }
    return obj
}

console.log(makeFrequencyTable(arr1));
console.log(makeFrequencyTable(arr2));
