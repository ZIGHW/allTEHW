
const sumDouble = (x, y) =>{
    if (x === y) {
        return (2 * (x * y))
    } else {
        return x + y;
    }
}

const hasTeen = (x, y, z) => ! ([x, y, z].filter(c => (c >= 13 && c <= 19)).length === 0);


const lastDigit = (x, y)  =>{
  var arr = [x.toString(), y.toString()].map(z => z[z.length - 1]);
  return (arr[0] === arr[1]);
}

const seeColor = (x, y) =>{
    if (x.substring(0, 3) === 'red') {
        return 'red';
    } else if (x.substring(0,4) === "blue"){
        return 'blue';
    }
    return "";
}

const middleThree = (x) => x.substring(x.length/2 - 1, x.length/2 + 2);

const frontAgain = (x) => (x.substring(0, 2) === x.substring(x.length - 2, x.length));

const alarmClock = (x, y) => {
    days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
    if (y === true){
        if (x === 0 || x === 6) {
            return days[x] + " off";
        } else {
            return days[x] + " 10:00"
        } 
    }
    if (x === 0 || x === 6) {
        return days[x] + " 10:00";
    } else {
        return days[x] + " 7:00"
    } 
}

const makeMiddle = (arr) =>  ((arr.length % 2 === 0) ? arr.slice(arr.length/2 - 1 , arr.length/2 + 1) : []);

const oddOnly = (arr) => (arr.filter(x => x % 2 != 0))

const weave = (arr1, arr2) => {
    let j = 0;
    for (let i = 0; j < arr2.length && j < arr1.length; i+=2){
        arr1.splice(i+1, 0, arr2[j]);
        j++;
    }
    return arr1;
}

const cigarParty = (cigars, weekend) => ((cigars >= 40 & cigars <= 60) || (weekend === true && cigars >= 40));

const stringSplosion = (str) => {
    let str2 = "";
    for (let i = 1; i < str.length; i++) {
        str2 += str.slice(0, i); 
    }
    return (str2 + str);
}

const fizzBuzz = ((num) => (num % 15 === 0) ? 'FizzBuzz' : (num % 3 === 0) ? 'Fizz'  : (num % 5 === 0) ? 'Buzz' : num);

const countValues = (arr) => {
    let dict = {};
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] in dict){
            dict[arr[i]] = ++ dict[arr[i]];
        } else {
            dict[arr[i]] = 1;
        }
    }
    return dict;
}

const reverseArray = (arr) => (arr.reverse());

const blackJack = (x, y) => (y > 21 && x > 21) ? 0 : (y >= x && y < 21) ? y : (x >= y && x < 21) ? x : y;