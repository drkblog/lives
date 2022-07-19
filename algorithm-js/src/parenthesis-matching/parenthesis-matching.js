export function isValid(formula) {
  const stack = [];
  for (const char of formula) {
    if (isOpener(char)) {
      stack.push(char);
    } else if (isCloser(char)) {
      if (!matches(stack.pop(), char)) {
        return false;
      }
    }
  }
  return stack.length === 0;
}

function isOpener(char) {
  return char === '(' || char === '[' || char === '{'; 
}

function isCloser(char) {
  return char === ')' || char === ']' || char === '}'; 
}

function matches(opener, closer) {
  return (opener === '(' && closer === ')') 
  || (opener === '[' && closer === ']')
  || (opener === '{' && closer === '}');
}