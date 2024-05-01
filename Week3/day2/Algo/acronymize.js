/* 
  Acronyms
  Create a function that, given a string, returns the string’s acronym 
  (first letter of each word capitalized). 
*/

const str1 = "object oriented programming";
const expected1 = "OOP";

// The 4 pillars of OOP
const str2 = "abstraction polymorphism inheritance encapsulation";
const expected2 = "APIE";

const str3 = "software development life cycle";
const expected3 = "SDLC";

// Bonus: ignore extra spaces
const str4 = "  global        information tracker   a";
const expected4 = "GIT";


// ---------- version 1 ----------
function acronymize(str) {
    var acro = "";     
    if (str[0] != " ") {
            acro += str[0];
        }

    for (var i = 0; i < str.length; i++) {
        if(str[i] == " " && str[i+1] != " " && i != str.length-1){
            acro += str[i+1];
        }

    }
    console.log(acro.toUpperCase());
}

// acronymize(str1);
// console.log("============");
// acronymize(str2);
// console.log("============");
// acronymize(str3);
// console.log("============");
// acronymize(str4);


// ---------- version 2 ----------

function acronym(str){
    var acro = "";
    var temp = str.split(" "); // ["object", "oriented", "programming"]

    for (let i = 0; i < temp.length; i++) {
        if (temp[i] != "") {
            acro += temp[i][0].toUpperCase();
        }
    
    }
    console.log(acro);
}

acronym(str1);
console.log("============");
acronym(str2);
console.log("============");
acronym(str3);
console.log("============");
acronym(str4);