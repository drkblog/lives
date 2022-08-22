export function sort(values) {
  // O(n + k) => n: length(values) k: keys
  const counter = {};
  for (const value of values) {
    if (counter[value] == undefined) {
      counter[value] = 0;
    }
    counter[value] += 1;
  }
  const result = [];
  for (const key of (Object.keys(counter))) {
    const repeat = counter[key];
    for (let i = 0; i < repeat; i++) {
      result.push(parseInt(key));
    }
  }
  return result;
}
