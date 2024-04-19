const str1 = "Y(3(p)p(3)r)s";
const expected1 = true;

const str2 = "M((h)a(8())hj()5";
const expected2 = false;


function chekpar(str) {
    var count1 = 0;
    var count2 = 0;
    for (let i = 0; i < str.length; i++) {
        if (str[i] == '(') {
            count1++;
        } else if (str[i] == ')') {
            count2++;
        }
    }
    if (count1 == count2) {
        return true
    } else{
        return false
    }

}
console.log(chekpar(str1));
console.log(chekpar(str2));