import { isValid, isValidRecursive } from './parenthesis-matching/parenthesis-matching';

// {[()]}

const formula1 = '(1 + 3) * 5';
console.log(isValid(formula1) === true);

const formula2 = '{x / [ 2 * x + (x * 2)]}';
console.log(isValid(formula2) === true);

const formulaWrong = '(1 + 3) * [ ( 1 * 5 ] )';
console.log(isValid(formulaWrong) === false);

const formulaOpen = '(1 + 3) * [ 1 * 5';
console.log(isValid(formulaOpen) === false);

const formulaClosed = '(1 + 3) * 1 ] * 5';
console.log(isValid(formulaClosed) === false);

const formulaNoParen = '1 + 3 * 1 * 5';
console.log(isValid(formulaNoParen) === true);