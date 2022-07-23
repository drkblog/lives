import { findRepeated } from "./find-repeated/find-repeated";

const data1 = [8, 2, 4, 3, 5, 6, 7, 6, 1, 9];
console.log(findRepeated(data1) == 6);

const data2 = [1, 2, 3, 4, 5, 5, 6, 7, 8, 9];
console.log(findRepeated(data2) == 5);

const data3 = [1, 1];
console.log(findRepeated(data3) == 1);

const data4 = [1, 2, 3, 4];
console.log(findRepeated(data4) == -1);

const data5 = [];
console.log(findRepeated(data5) == -1);

const data6 = ['s', 'g', 'z'];
console.log(findRepeated(data6) == -1);