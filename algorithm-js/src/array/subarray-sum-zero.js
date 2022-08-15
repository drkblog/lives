export function finsSubarray(data) {
  // data = [1, 2, -3, 8]
  // p =  0 [1, 3,  0, 8]
  const p = [];
  let sum = 0;
  for (let i = 0; i < data.length; i++) {
    sum += data[i];
    p[i] = sum;
  }
  const present = {};
  for (let i = 0; i < p.length; i++) {
    if (present[p[i]] !== undefined) {
      return [present[p[i]]+1, i];
    }
    if (p[i] === 0) {
      return [0, i];
    }
    present[p[i]] = i;
  }
  return null;
}